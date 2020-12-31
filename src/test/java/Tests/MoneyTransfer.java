package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.MoneyTransferPOM;
import io.appium.java_client.MobileElement;
public class MoneyTransfer extends AppSetup {

	@Test  (priority = 2)
	public void ClickOnMoneyTransfer() throws InterruptedException 
	{
		test = extent.createTest("Money Tranfer to JazzCash Account");

		test.log(Status.INFO, "Execution Started");

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();

		test.log(Status.PASS, "Money Transfer is Clicked and the user is inside the menu");

		POM.TMobile.click();
		test.log(Status.PASS, "Transfer to Mobile Account Clicked successfully");

		POM.SearchNO.click();
		Thread.sleep(5000);
		POM.SearchNO.sendKeys("03435598382");
		test.log(Status.PASS, "User Searched from the list successfully");


		POM.Send.click();
		test.log(Status.PASS, "User Selected from the list successfully");

		MobileElement el3 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_1");
		el3.click();
		test.log(Status.PASS, "Amount Entered  to Send successfully");


		POM.Continue.click();
		test.log(Status.PASS, "Money Transfered flow initiated successfully");

		POM.AuthoriseTransfer.click(); //Click on Authorize Transfer Button to Continue 
		test.log(Status.PASS, "Authorise Transfer Successfully");

		POM.UseMPIM.click();    //Select Use MPIN

		MobileElement el7 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_3");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_6");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_9");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_8");
		el10.click();

		if(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/anroid.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.TextView[1]")).isDisplayed())
		{
			test.log(Status.PASS, "Transaction Successfull");
			test.log(Status.PASS, "Money Transffered to JazzCash Account Successfully");
		}
		else
		{
			test.log(Status.PASS, "Transaction Failed");

		}

	}

}
