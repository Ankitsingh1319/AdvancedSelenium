package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_page {

	public Base_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
