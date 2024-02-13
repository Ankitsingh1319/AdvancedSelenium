package generic_utility;


import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Anshu
 */
public class webdriver_utility {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor j;
	public static Properties p;
	
	/**
	 * this method is used to navigate to particular url
	 * @param url
	 */
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	/**
	 * this method is used to get current url of the web page
	 * @param url
	 */
	public static String currentUrl()
	{
		return driver.getCurrentUrl();
	}
	/**
	 * this method is used to get source  of the webpage
	 * @param url
	 */
	public static String pageSource()
	{
		return driver.getPageSource();
	}
	/**
	 * this method is used to get the title of webpage
	 * @param url
	 */
	public static String title()
	{
		return driver.getTitle();
	}
	/**
	 * this method is used to get the current window of webpage
	 * @param url
	 */
	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method is used to give implicit wait
	 * @return
	 */
	public static String currentWindow()
	{
		return driver.getWindowHandle();
	}
	/**
	 * this method is used to get all window 
	 * @param url
	 */
	public static Set<String> allWindow()
	{
		return driver.getWindowHandles();
	}
	/**
	 * this method is used to maximize the window
	 * @param url
	 */
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to minimize the window
	 * @param url
	 */
	public static void minimize()
	{
		driver.manage().window().minimize();;
	}
	/**
	 * this method is used to forward the webpage
	 * @param url
	 */
	public static void forward()
	{
		driver.navigate().forward();
	}
	/**
	 * this method is used to backward the webpage
	 * @param url
	 */
	public static void backward()
	{
		driver.navigate().back();;
	}
	/**
	 * this method is used to refresh the webpage
	 * @param url
	 */
	public static void refresh()
	{
		driver.navigate().refresh();;
	}
	/**
	 * this method is used to navigate the particular url
	 * @param url
	 */
	public static void toUrl(String url)
	{
		driver.navigate().to(url);
	}
	/**
	 * this method is used to close the current window
	 * @param url
	 */
	public static void closewindow()
	{
		driver.close();;
	}
	/**
	 * this method is used to close all
	 *  window
	 * @param url
	 */
	public static void quitwindow()
	{
		driver.quit();
	}
	/**
	 * this method is used for timeout
	 * @param element
	 */
	public static void ExplicitWait(WebElement element)
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
				}
	/**
	 * this method is used to select the element from the dropdown by using id
	 * @param index
	 * @param element
	 */
	public static void dropdown(int index,WebElement element)
	{
		s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * this method is used to select the element from the dropdown by using value
	 * @param index
	 * @param value
	 */
	public static void dropdown(String value,WebElement element)
	{
		s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 * this method is used to select the element from the dropdown by using visibletext
	 * @param index
	 * @param visibletext
	 */
	public static void dropdown(WebElement element, String visibletext)
	{
		s=new Select(element);
		s.selectByVisibleText(visibletext);
	}
	/**
	 * this method is used to move the cursor to perticular element
	 * @param element
	 */
	public static void moveCursor(WebElement element)
	{
		a=new Actions(driver);
		a.moveToElement(element).perform();;
	}
	public static void rightClick(WebElement element)
	{
		a=new Actions(driver);
		a.contextClick(element).perform();;
	}
	public static void doubleClick(WebElement element)
	{
		a=new Actions(driver);
		a.doubleClick(element).perform();;
	}
	public static void dragAndDrop(WebElement source,WebElement destination)
	{
		a=new Actions(driver);
		a.dragAndDrop(source,destination).perform();;
	}
	public static void click(WebElement element)
	{
		a=new Actions(driver);
		a.click(element).perform();;
	}
	public static void randomclick(WebElement element)
	{
		a=new Actions(driver);
		a.click().perform();
	}
	
}
