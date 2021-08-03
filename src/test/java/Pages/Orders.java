package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Orders {public Orders(AppiumDriver<AndroidElement> driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup"))
	public AndroidElement AlaCart;

	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/iv_user_profile"))
	public AndroidElement ClickonProfile;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/orders_select"))
	public AndroidElement ClickonMenu;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[1]"))
	public AndroidElement ClickonOrder;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/track_order"))
	public AndroidElement ClickonTrackOrder;
	
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/order_btn"))
	public AndroidElement ClickonCancleOrder;
	
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/cancel"))
	public AndroidElement Close;
	
	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView"))
	public AndroidElement ClickonSureCancle;
	
	
	
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
