package Test_Script;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample5Test {

	@Test
	public void testcase()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String image=driver.getScreenshotAs(OutputType.BASE64);

			ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\Anshu\\eclipse-workspace\\Demoweb\\ExtentReport\\report.html");
			ExtentReports er=new ExtentReports();
			er.attachReporter(esr);
			ExtentTest et = er.createTest("Sample4Test");
			et.log(Status.INFO, "test case successfully attached to the report");
			et.addScreenCaptureFromBase64String(image);
			er.flush();
	}
}
