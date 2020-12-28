package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	public LoginPage(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/et_phone_number"))
	public AndroidElement MSISDNField;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_mobile"))
	public AndroidElement MSISDN;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_send_otp"))
	public AndroidElement Next;
	
}
