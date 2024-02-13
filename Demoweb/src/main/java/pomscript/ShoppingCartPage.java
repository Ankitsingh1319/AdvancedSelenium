package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Base_page {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name=\"removefromcart\"]")
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return checkbox;
	}
	
	@FindBy(xpath = "//input[@id=\"termsofservice\"]")
	private WebElement termandcondition;

	public WebElement getTermandcondition() {
		return termandcondition;
	}
	
	@FindBy(xpath = "//button[@id=\"checkout\"]")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
}
