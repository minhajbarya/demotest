package Pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MoneyTransferPOM {
	public MoneyTransferPOM(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView"))
	public AndroidElement SendMoney;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout"))
	public AndroidElement TMobile;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/searchRecipientET"))
	public AndroidElement SearchNO;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/sendButton"))
	public AndroidElement Send;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/continueButton"))
	public AndroidElement Continue;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/send_image_view"))
	public AndroidElement AuthoriseTransfer;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_use_mpin"))
	public AndroidElement UseMPIM;





}
