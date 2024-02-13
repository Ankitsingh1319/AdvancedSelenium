package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends Base_page{

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	private WebElement registerlink;

	public WebElement getRegisterlink() {
		return registerlink;
	}
	
	@FindBy(linkText = "Log in")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
   
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingcart;

	public WebElement getShoppingcart() {
		return shoppingcart;
	}
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
}
