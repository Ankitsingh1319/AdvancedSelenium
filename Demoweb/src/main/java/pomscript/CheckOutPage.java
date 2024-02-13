package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Base_page{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_Company\"]")
	private WebElement company;
	
	@FindBy(xpath = "//select[@id=\"BillingNewAddress_CountryId\"]")
	private WebElement country;
	
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_City\"]")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_Address1\"]")
	private WebElement address1;

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}
	
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_Address2\"]")
	private WebElement address2;

	public WebElement getAddress2() {
		return address2;
	}
	
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_ZipPostalCode\"]")
	private WebElement poatalcode;

	public WebElement getPoatalcode() {
		return poatalcode;
	}
	
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_PhoneNumber\"]")
	private WebElement phonenumber;

	public WebElement getPhonenumber() {
		return phonenumber;
	}
	
	@FindBy(xpath = "//div[@id=\"billing-buttons-container\"]//input")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}

}
