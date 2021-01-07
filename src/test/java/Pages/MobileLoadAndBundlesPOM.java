package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileLoadAndBundlesPOM {
	public MobileLoadAndBundlesPOM(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Prepaid laod to Jazz
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View"))
	public AndroidElement Appdrawer;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/et_mobileNumber"))
	public AndroidElement SearchMobileNO;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_add_contact"))
	public AndroidElement SelectNO;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btnSendRupees"))
	public AndroidElement LoadRS;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_transaction"))
	public AndroidElement ConfirmTransaction;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_use_mpin"))
	public AndroidElement UseMPIM;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/btn_done"))
	public AndroidElement Done;
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
	
}
