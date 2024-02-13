package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base_page {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
@FindBy(id = "Email")
private WebElement e;

public WebElement getE() {
	return e;
}
@FindBy(id = "Password")
private WebElement p;
public WebElement getP() {
	return p;
}
@FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
private WebElement loginclick;

public WebElement getLoginclick() {
	return loginclick;
}
}
