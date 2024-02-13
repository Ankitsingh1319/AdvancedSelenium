package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalPage extends Base_page {

	public DigitalPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@data-productid=\"2\"]//input")
	private WebElement product1;

	public WebElement getProduct1() {
		return product1;
	}

	@FindBy(xpath = "//div[@data-productid=\"31\"]//input")
	private WebElement product2;

	public WebElement getProduct2() {
		return product2;
	}

	@FindBy(xpath = "//div[@data-productid=\"72\"]//input")
	private WebElement produc3;

	public WebElement getProduc3() {
		return produc3;
	}
}
