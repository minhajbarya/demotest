package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.MobileLoadAndBundlesPOM;
import io.appium.java_client.MobileBy;

@Test  (priority = 5)

public class PrePaidLoad extends AppSetup{
	public void PrePaidMobileLoad() throws InterruptedException 
	{		


		test = extent.createTest("Prepaid Mobile Load");
		test.log(Status.INFO, "Execution Started");

		MobileLoadAndBundlesPOM POM=new MobileLoadAndBundlesPOM(driver);
		POM.Appdrawer.click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ "Prepaid Load" + "\").instance(0))")).click();
		test.log(Status.PASS, "Prepaid Load is Clicked and the user is inside the Jazz Section");

		POM.SearchMobileNO.click();
		POM.SearchMobileNO.sendKeys("03025782949");
		POM.SelectNO.click();
		test.log(Status.PASS, "Mobile Number Searched and Selected from the List Sccuessfully");

		POM.Three.click();
		
		if(driver.findElements(By.id("com.techlogix.mobilinkcustomer:id/btnSendRupees")).size()>0)
				 
				{
				   System.out.println("The element present");
				}
		else
				{
				   System.out.println("this element is missing");
				}
		POM.Zero.click();
		test.log(Status.PASS, "Amount Entered to Send  Sccuessfully");

		
		POM.LoadRS.click();
		Thread.sleep(2000);
		POM.ConfirmTransaction.click();
		POM.UseMPIM.click();
		Thread.sleep(2000);

		
		//Entering MPIN
		POM.Three.click();
		POM.Six.click();
		POM.Nine.click();
		POM.Eight.click();
		test.log(Status.PASS, "MPIN Entered  Sccuessfully");
		Thread.sleep(3000);

		POM.Done.click();
		test.log(Status.PASS, "Mobile Load Successfully Purchased");
		test.log(Status.PASS, "User Landed On HomeScreen");

	}
}