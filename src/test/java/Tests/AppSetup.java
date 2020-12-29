package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;

public class AppSetup extends ExtentReportsJazzcash{

	static AppiumDriver<AndroidElement> driver;
	@Parameters({"platform", "udid","device"})
	@BeforeTest
	public void setup(String platform, String udid,String device)  throws MalformedURLException
	{

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", platform);
		desiredCapabilities.setCapability("deviceName",device);
		desiredCapabilities.setCapability("udid", udid);
		desiredCapabilities.setCapability("autoGrantPermissions",true);
		desiredCapabilities.setCapability("newCommandTimeout","30");
		desiredCapabilities.setCapability("noReset", "true");
		desiredCapabilities.setCapability("fullReset", "false");
		//desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
		desiredCapabilities.setCapability("appPackage", "com.techlogix.mobilinkcustomer");
		desiredCapabilities.setCapability("appActivity", "com.ibm.jazzcashconsumer.view.splash.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<AndroidElement>(url,desiredCapabilities);
	}


}
