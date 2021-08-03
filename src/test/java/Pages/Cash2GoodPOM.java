package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Cash2GoodPOM {
	public Cash2GoodPOM(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Cash 2 good Test Cases
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout"))
	public AndroidElement Appdrawer;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cash2Goods\"));")
	public AndroidElement ClickonCash2Good;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchRecipientET"))
	public AndroidElement ClickonMobileSearchField;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/checkContact"))
	public AndroidElement ClickonC2GMobileNumberCheckbox;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/add_sendC2G_btn"))
	public AndroidElement ClickonC2GSendButton;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/continueButton"))
	public AndroidElement ClickonC2GAmountContinue;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/add_initC2G_btn"))
	public AndroidElement ClickOnSendC2GButton;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_transaction_collapsed"))
	public AndroidElement ClickonC2GSubmitButton;

	
	
	

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_use_mpin"))
	public AndroidElement ClickonC2GUseMPIN;
	

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_positive"))
	public AndroidElement C2GReceiptVisibility;
	


	
	//keyboard objects
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_0"))
	public AndroidElement Zero;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_1"))
	public AndroidElement One;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_2"))
	public AndroidElement Two;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_3"))
	public AndroidElement Three;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_4"))
	public AndroidElement Four;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_5"))
	public AndroidElement Five;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_6"))
	public AndroidElement Six;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_7"))
	public AndroidElement Seven;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_8"))
	public AndroidElement Eight;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/t9_key_9"))
	public AndroidElement Nine;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btnEditJazzCash"))
	public AndroidElement Visibility;

}
