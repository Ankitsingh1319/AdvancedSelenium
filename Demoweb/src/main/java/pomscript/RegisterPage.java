package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Base_page {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

@FindBy(linkText = "Register")
private WebElement registerlink;

public WebElement getRegisterlink() {
	return registerlink;
}
}
