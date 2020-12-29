package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pages.LoginPage;
import Pages.MoneyTransferPOM;
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
		test1.log(Status.PASS, "User Logged in Successfully After Valid MPIN");

		WebDriverWait wait = new WebDriverWait(driver,30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView")));
		POM.Next1.click();
		POM.Next2.click();
		POM.Next3.click();
		POM.Next4.click();
		POM.Next5.click();
		POM.Gotit.click();
		POM.Gotit1.click();
		test1.log(Status.PASS, "User landed on HomeScreen Sucessfully");

	}

}

