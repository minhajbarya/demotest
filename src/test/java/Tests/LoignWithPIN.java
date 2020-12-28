package Tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pages.LoginPage;
import io.appium.java_client.MobileElement;
public class LoignWithPIN  extends AppSetup{
	@Parameters({"MSISDN"})
	@Test
	public void login(String MSISDN) throws InterruptedException {

		ExtentTest test1 = extent.createTest("LoginwithPIN", "This test case will have the user enter the App with PIM");
		test1.log(Status.INFO, "Execution Started");
		test1.log(Status.INFO, "App Launched");

		LoginPage POM=new LoginPage(driver);
		POM.MSISDNField.click();
		test1.log(Status.PASS, "Clicked on Enter phone number");

		POM.MSISDN.sendKeys(MSISDN);
		POM.Next.click();
		Thread.sleep(3000);
		test1.log(Status.PASS, "MSISDN Entered Successfully");

		MobileElement el4 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/t9_key_3");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/t9_key_6");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/t9_key_9");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/t9_key_8");
		el7.click();
		test1.log(Status.PASS, "User Logged in Successfully After Valid PIN");

	}

}

