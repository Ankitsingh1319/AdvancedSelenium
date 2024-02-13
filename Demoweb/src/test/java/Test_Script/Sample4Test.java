package Test_Script;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample4Test {

	@Test
	public void testcase()
	{
		ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\Anshu\\eclipse-workspace\\Demoweb\\ExtentReport\\report.html");
		ExtentReports er=new ExtentReports();
		er.attachReporter(esr);
		ExtentTest et = er.createTest("Sample4Test");
		et.log(Status.INFO, "test case successfully attached to the report");
		er.flush();
	}
}
