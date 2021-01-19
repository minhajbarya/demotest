package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.LoginPagePOM;
public class LoignWithPIN  extends AppSetup{

	@Parameters({"MSISDN"})
	@Test  (priority = 1)

	public void login(String MSISDN) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30);

//		test = extent.createTest("Login as customer");
//		test.log(Status.INFO, "Execution Started");
//		test.log(Status.INFO, "App Launched");

		LoginPagePOM POM=new LoginPagePOM(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.techlogix.mobilinkcustomer:id/et_phone_number")));

		POM.MSISDNField.click();
//		test.log(Status.PASS, "Clicked on Enter phone number");

		Thread.sleep(2000);

		//Entering MSISDN
		POM.MSISDN.sendKeys(MSISDN);
		Thread.sleep(2000);

		POM.Next.click();
		Thread.sleep(2000);

//		test.log(Status.PASS, "MSISDN Entered Successfully");


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.techlogix.mobilinkcustomer:id/t9_key_3")));

		//Entering MPIN
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();

//		test.log(Status.PASS, "User Logged in Successfully After Valid MPIN");
		Thread.sleep(3000);

		//Clicking on Guided Tour after Login
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.TextView")));
		POM.Next1.click();
		POM.Next2.click();
		POM.Next3.click();
		POM.Next4.click();
		POM.Next5.click();
		POM.Gotit.click();
		POM.Gotit1.click();
		Thread.sleep(2000);
//		test.log(Status.FAIL, "User landed on HomeScreen Sucessfully");

//		if((driver.getPageSource().contains("Money Transferrrr")))
//
//		{
//			test.log(Status.PASS, "Money Transfer Is Visible");
//
//		}
//		else
//		{
//			test.log(Status.FAIL, "Money Transfer Is Not Visible");
//		}

	}

}

