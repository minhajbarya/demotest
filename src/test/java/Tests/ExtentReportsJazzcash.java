package Tests;

import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsJazzcash {
	ExtentHtmlReporter html; 
	ExtentReports extent;
	String suiteName;

	@BeforeSuite
	public void reportsetup(ITestContext ctx) {
		suiteName = ctx.getCurrentXmlTest().getSuite().getName();

		html = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/" + suiteName + ".html");
		extent = new ExtentReports();
		extent.attachReporter(html);
		extent.setSystemInfo("OS", "Android");
		extent.setSystemInfo("Host Name", "Salman Javed");
		extent.setSystemInfo("Environment", "Production");

		html.config().setDocumentTitle("JazzCash Consumer App Report");
		html.config().setReportName("JazzCash Consumer Automation Test Report");
		html.config().setTheme(Theme.DARK);
	}
	@AfterSuite
	public void reportTeardown() {

		extent.flush();
	}
}


