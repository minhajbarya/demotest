package Tests;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class AppSetup{
	public static ExtentHtmlReporter html; 
	public static ExtentReports extent;
	String suiteName;
	public static ExtentTest test;
	public static AppiumDriver<AndroidElement> driver;
	@Parameters({"platform", "udid","device"})
	@BeforeSuite
	public void setup(@Optional String platform,@Optional String udid,@Optional String device)  throws MalformedURLException
	{

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", platform);
		desiredCapabilities.setCapability("deviceName",device);
		desiredCapabilities.setCapability("udid", udid);
		desiredCapabilities.setCapability("autoGrantPermissions",true);
		desiredCapabilities.setCapability("newCommandTimeout","30");
		//		desiredCapabilities.setCapability("noReset", "true");
		//		desiredCapabilities.setCapability("fullReset", "false");
		//desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
		//		desiredCapabilities.setCapability("–session-override",true);

		desiredCapabilities.setCapability("appPackage", "com.techlogix.mobilinkcustomer");
		desiredCapabilities.setCapability("appActivity", "com.ibm.jazzcashconsumer.view.splash.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<AndroidElement>(url,desiredCapabilities);
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

	@AfterMethod
	public void getResult(ITestResult result) throws IOException
	{

		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
			test.fail(result.getThrowable());		
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
	@AfterSuite
	public void tearDown() 
	{
		extent.flush();
		driver.quit();

	}

}
