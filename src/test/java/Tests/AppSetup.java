package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class AppSetup  {

	public  AndroidDriver<AndroidElement> driver;

	@Parameters({"platform", "udid","device", "systemPort"})
	@BeforeTest
	public void setup( String platform, String udid, String device, String systemPort)  throws MalformedURLException, InterruptedException
	{

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", platform);
		desiredCapabilities.setCapability("deviceName",device);
		desiredCapabilities.setCapability("udid", udid);
		desiredCapabilities.setCapability("autoGrantPermissions",true);
		desiredCapabilities.setCapability("newCommandTimeout","90");
		//desiredCapabilities.setCapability("noReset", "true");
		//desiredCapabilities.setCapability("fullReset", "false");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);

		desiredCapabilities.setCapability("appPackage", "com.whatsapp");
		desiredCapabilities.setCapability("appActivity", "com.whatsapp.HomeActivity");

//	URL url = new URL("http://127.0.0.1:4444/wd/hub");
 URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<AndroidElement>(url,desiredCapabilities);
	}

	@Parameters({"device"})
	@BeforeTest
	public void researchText (String device, ITestContext context){
	    context.setAttribute("DeviceName", device);
	}
	
	
	@AfterSuite
	public void tearDown() 
	{
		driver.quit();
		driver.closeApp();


	}

}
