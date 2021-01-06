package Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import Pages.MobileLoadAndBundlesPOM;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

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
		POM.SearchMobileNO.sendKeys("03435598382");
		POM.SelectNO.click();
		test.log(Status.PASS, "Mobile Number Searched and Selected from List Sccuessfully");
		
		MobileElement Three = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/t9_key_3");
		Three.click();
		MobileElement Zero = (MobileElement) driver.findElementById("com.techlogix.mobilinkcustomer:id/t9_key_0");
		Zero.click();
		
		if(driver.findElement(By.id("com.techlogix.mobilinkcustomer:id/btnSendRupees")).isDisplayed())
		{
			test.log(Status.PASS, "Transaction Successfull");
			test.log(Status.PASS, "Money Transffered to Bank Account Successfully");
		}
		else
		{
			test.log(Status.FAIL, "Money Transffered to Bank Account  Failed");

		}
		

		

	}
}
