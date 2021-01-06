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
	
}
