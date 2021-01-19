package Tests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.MoneyTransferPOM;
import io.appium.java_client.MobileElement;

@Test  (priority = 2)

public class MoneyTransferToJazzCash extends AppSetup {
	@Parameters({"device"})

	public void ClickOnMoneyTransfer(String device) throws InterruptedException 
	{
		test = extent.createTest("Money Tranfer to JazzCash Account"+ "  ("+"Device Name:"+"  " +device+") ");

		test.log(Status.INFO, "Execution Started");
		
		MoneyTransferPOM POM=new MoneyTransferPOM(driver);
		POM.SendMoney.click();

		test.log(Status.PASS, "Money Transfer is Clicked and the user is inside the menu");

		POM.TMobile.click();
		test.log(Status.PASS, "Transfer to Mobile Account Clicked successfully");

		POM.SearchNO.click();
		Thread.sleep(3000);
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

		POM.UseMPIM.click();    //Select Use MPIN
		test.log(Status.PASS, "Authorise Transfer Successfully");

		//Entering MPIN
		POM.One.click();
		POM.One.click();
		POM.Two.click();
		POM.Two.click();

		POM.Done.click();
		Thread.sleep(2000);

	}

}
