package Tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class AppSetup{
	public static ExtentHtmlReporter html; 
	public static ExtentReports extent;
	String suiteName;
	public static ExtentTest test;
	public static AndroidDriver<AndroidElement> driver;
	@Parameters({"platform", "udid","device","systemPort"})
	@BeforeTest
	public void setup(String platform, String udid,String device, String systemPort)  throws MalformedURLException
	{

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", platform);
		desiredCapabilities.setCapability("deviceName",device);
		desiredCapabilities.setCapability("udid", udid);
		desiredCapabilities.setCapability("autoGrantPermissions",true);
		desiredCapabilities.setCapability("newCommandTimeout","30");
		//desiredCapabilities.setCapability("noReset", "true");
		//desiredCapabilities.setCapability("fullReset", "false");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);

		desiredCapabilities.setCapability("appPackage", "com.techlogix.mobilinkcustomer");
		desiredCapabilities.setCapability("appActivity", "com.ibm.jazzcashconsumer.view.splash.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<AndroidElement>(url,desiredCapabilities);
	}

	@BeforeSuite
	public void reportsetup(ITestContext ctx) {
		suiteName = ctx.getCurrentXmlTest().getSuite().getName();

		html = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/" + suiteName + ".html"	);
		extent = new ExtentReports();
		extent.attachReporter(html);
		extent.setSystemInfo("OS", "Android");
		extent.setSystemInfo("Host Name", "CashJazz Team");
		extent.setSystemInfo("Environment", "Production");

		html.config().setDocumentTitle("JazzCash Consumer App Report");
		html.config().setReportName("JazzCash Consumer Automation Test Report");
		html.config().setTheme(Theme.DARK);
	}




	@AfterSuite
	public void getResult(ITestResult result) throws IOException
	{

		String methodName=result.getMethod().getMethodName();
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
			test.fail(result.getThrowable());

			String path=takeScreenshot(result.getMethod().getMethodName());
			try {

				test.fail("<b><font color=red>"+"Screenshot of FAILURE"+"</font></b>",
						MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}
			catch(IOException e) {

				test.fail("Test Failed, cannot  attach screenshot");


			}
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		else
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}


	public String takeScreenshot(String methodName)
	{

		String fileName= getScreenshotName(methodName);
		String directory=System.getProperty("user.dir")+"/screenshot/";
		new File(directory).mkdirs();
		String path=directory + fileName;

		try {

			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot,new File(path));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return path;
	}


	public static  String getScreenshotName(String methodName)
	{
		Date D=new Date();
		String  fileName=methodName + "" + D.toString().replace(":","_").replace(" ", "_")+".png";
		return fileName;
	}

	@AfterTest

	public void tearDown() 
	{
		extent.flush();
		driver.quit();

	}

}
