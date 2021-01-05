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

	//Transfer to JazzCashAccout
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

	// IBFT Objects

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout"))
	public AndroidElement IBFT;

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView"))
	public AndroidElement ClickBankName;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_continue"))
	public AndroidElement Continue1;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/name"))
	public AndroidElement TransferPurpose;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/skipButton"))
	public AndroidElement Skip;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/doneTV"))
	public AndroidElement Done;

	//Transfer to CNIC Objects

	@AndroidFindBy(xpath=("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout"))
	public AndroidElement TCNIC;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/send_text"))
	public AndroidElement AuthoriseTransfer1;

	//Keyboard Object 
	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_0"))
	public AndroidElement Zero;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_1"))
	public AndroidElement One;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_2"))
	public AndroidElement Two;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_3"))
	public AndroidElement Three;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_4"))
	public AndroidElement Four;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_5"))
	public AndroidElement Five;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_6"))
	public AndroidElement Six;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_7"))
	public AndroidElement Seven;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_8"))
	public AndroidElement Eight;

	@AndroidFindBy(id=("com.techlogix.mobilinkcustomer:id/tv_9"))
	public AndroidElement Nine;


}
