package generic_utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * @author Anshu
 */
public class java_script_Utility extends webdriver_utility
{	
	public static void scrollby(int x,int y)
	{
		j =(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}
	public static void scroll_To(int x,int y)
	{
		j =(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo("+x+","+y+")");
	}
	public static void scroll_In_To_View(int index,Boolean b, WebElement element)
	{
		j =(JavascriptExecutor)driver;
		j.executeScript("arguments["+index+"].scrollIntoView("+b+");",element);
	}
	
	public static void clickDisable(WebElement element)
	{
		j =(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click();",element);
	}
}
