package generic_utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass extends webdriver_utility {
	
		@BeforeSuite
		public void beforesuite()
		{
			Reporter.log("connect to server",true);
		}
		@BeforeTest
		public void beforetest()
		{
			Reporter.log("connect to database",true);
		}
		@BeforeClass
		public void beforeclass() throws Exception 
		{
			driver=new ChromeDriver();
			maximize();
			implicitWait();
			String url=property_file_utility.property("URL");
			getUrl(url);
		}
/*		@BeforeMethod
		public void login()
		{
			driver.findElement(By.className("ico-login")).click();
			}
		@AfterMethod
		public void logout()
		{
			driver.findElement(By.xpath("//a[.='Log out']")).click();
			}
*/			
		@AfterClass
		public void closeBrowser()
		{
			driver.quit();
			}
		@AfterTest
		public void disconnectDatabase()
		{
			Reporter.log("disconnecting to the database",true);
			}
		@AfterSuite
		public void disconnectserver()
		{
			Reporter.log("disconnecting the server",true);
			}
}
