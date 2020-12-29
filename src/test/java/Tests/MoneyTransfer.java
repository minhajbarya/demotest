package Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pages.MoneyTransferPOM;
import io.appium.java_client.MobileElement;

public class MoneyTransfer extends AppSetup {
	@Test
	public void ClickOnMoneyTransfer() 
	{


		ExtentTest test1 = extent.createTest("Navigate to Money Transfer Menu", "This test case will Locate and Click Money Transfer icon on Home Screen");
		test1.log(Status.INFO, "Execution Started");
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();
		test1.log(Status.PASS, "Money Transfer is Clicked and the user is inside the menu");



		POM.TMobile.click();
		test1.log(Status.PASS, "Transfer to Mobile Account Clicked Sucessfully");

		POM.SearchNO.click();
		POM.SearchNO.sendKeys("03435598382");
		test1.log(Status.PASS, "User Searched from the list Sucessfully");


		POM.Send.click();
		test1.log(Status.PASS, "User Selected from the list Sucessfully");


		MobileElement el3 = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/tv_1");
		el3.click();
		test1.log(Status.PASS, "Amount Entered  to Send Sucessfully");


		POM.Continue.click();
		test1.log(Status.PASS, "Money Transfered flow initiated scuessfully");
		

	}

}
