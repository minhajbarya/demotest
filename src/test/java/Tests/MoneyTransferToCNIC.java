package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.MoneyTransferPOM;

public class MoneyTransferToCNIC extends AppSetup {
	@Test  (priority = 4)
	@Parameters({"device"})

	public void TransferToCNIC(String device) throws InterruptedException 
	{		


		test = extent.createTest("Money Tranfer to CNIC"+ "  ("+"Device Name:"+"  " +device+") ");

		test.log(Status.INFO, "Execution Started");

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();
		test.log(Status.PASS, "Money Transfer is Clicked and the user is inside the menu");

		POM.TCNIC.click();
		test.log(Status.PASS, "Clicked on Tranfer to CNIC Successfully");

		//Entering CNIC Number(3740570625545)
		POM.Three.click();
		POM.Seven.click();
		POM.Four.click();
		POM.Zero.click();
		POM.Five.click();
		POM.Seven.click();
		POM.Zero.click();
		POM.Six.click();
		POM.Two.click();
		POM.Five.click();
		POM.Five.click();
		POM.Four.click();
		POM.Five.click();
		POM.Continue1.click();
		test.log(Status.PASS, "CNIC Number Entered Successfully");
		Thread.sleep(7000);

		//Entering Amount and Clicking on Send
		POM.One.click();
		POM.Continue1.click();
		test.log(Status.PASS, "Amount to Send Entered Successfully");

		//Entering Recipient Mobile Number(03435598382)
		POM.Zero.click();
		POM.Three.click();
		POM.Four.click();
		POM.Three.click();
		POM.Five.click();
		POM.Five.click();
		POM.Nine.click();
		POM.Eight.click();
		POM.Three.click();
		POM.Eight.click();
		POM.Two.click();
		test.log(Status.PASS, "Recipient Mobile Number  Entered Successfully");

		POM.Continue1.click();
		test.log(Status.PASS, "Continue to Authorise Tranfer");

		Thread.sleep(13000);


		//Clicking on Authorize transfer after entering amount
		POM.AuthoriseTransfer1.click();
		test.log(Status.PASS, "Clicked on Authorise Tranfer  Successfully");

		//Entering User MPIN
		POM.UseMPIM.click();
		POM.Three.click();
		POM.Six.click();
		POM.Nine.click();
		POM.Eight.click();
		test.log(Status.PASS, "MPIN Entered Successfully");
		Thread.sleep(15000);
		if(driver.findElement(By.id("com.techlogix.mobilinkcustomer:id/textView5")).isDisplayed())
		{
			test.log(Status.PASS, "Transaction Successfull");
			test.log(Status.PASS, "Money Transffered to CNIC Successfully");
		}
		else
		{
			test.log(Status.FAIL, "Money Transffered to CNIC  Failed");

		}

		POM.Done.click();
		Thread.sleep(2000);

	}
}
