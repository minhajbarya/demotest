package Tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.MoneyTransferPOM;

@Test  (priority = 3)

public class MoneyTransferIBFT extends AppSetup {

	public void MoneyTransferToBank() throws InterruptedException 
	{		


		test = extent.createTest("Money Tranfer to Bank Account");

		test.log(Status.INFO, "Execution Started");

		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();
		test.log(Status.PASS, "Money Transfer is Clicked and the user is inside the menu");

		POM.IBFT.click();
		test.log(Status.PASS, "Transfer to Bank Account Clicked successfully");

		POM.SearchNO.click();
		Thread.sleep(2000);
		POM.SearchNO.sendKeys("Habib Bank Limited");
		test.log(Status.PASS, "Bank Name Searched from the list successfully");

		POM.ClickBankName.click();
		test.log(Status.PASS, "Successfully Clicked On Searched Bank Name");
		Thread.sleep(3000);

		//Entering Back Account Number(12345678911112)
		POM.One.click();
		POM.Two.click();
		POM.Three.click();
		POM.Four.click();
		POM.Five.click();
		POM.Six.click();
		POM.Seven.click();
		POM.Eight.click();
		POM.Nine.click();
		POM.One.click();
		POM.One.click();
		POM.One.click();
		POM.One.click();
		POM.Two.click();

		POM.Continue1.click();
		test.log(Status.PASS, "Bank Account Number Entered Successfully");
		Thread.sleep(3000);
		POM.One.click();		
		POM.Continue.click();
		test.log(Status.PASS, "Amount to Send Entered Successfully");

		POM.SearchNO.click();
		POM.SearchNO.sendKeys("Family Support");
		POM.TransferPurpose.click();
		test.log(Status.PASS, "Purpose to Transfer Selected Successfully");

		POM.Skip.click();
		test.log(Status.PASS, "Skipped Recipients Mobile Number Successfully");
		Thread.sleep(12000);

		if(driver.findElement(By.id("com.techlogix.mobilinkcustomer:id/txtSendMoneyTitle")).isDisplayed())
		{
			test.log(Status.PASS, "Transaction Authorized Successfull");
		}
		else
		{
			test.log(Status.FAIL, "Transaction Authorization Failed");

		}


		POM.AuthoriseTransfer.click();
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
			test.log(Status.PASS, "Money Transffered to Bank Account Successfully");
		}
		else
		{
			test.log(Status.FAIL, "Money Transffered to Bank Account  Failed");

		}

		POM.Done.click();
		Thread.sleep(2000);
	}

}
