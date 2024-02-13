package Test_Script;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_utility.Baseclass;
import generic_utility.readExcel_utility;
import generic_utility.webdriver_utility;
import pomscript.CheckOutPage;
import pomscript.DigitalPage;
import pomscript.LoginPage;
import pomscript.RegisterPage1;
import pomscript.ShoppingCartPage;
import pomscript.WelcomePage;

public class Sample1Test extends Baseclass {

	
	@Test(dataProvider = "ram", dependsOnMethods = "register")
	public void login(String s1, String s2) throws Exception
	{
		Reporter.log("sample1 Test",true);
		Reporter.log(s1,true);
		Reporter.log(s2,true);
		int row = readExcel_utility.rowSize("Sheet5");
		System.out.println(row);
		int column=readExcel_utility.columnSize("Sheet5");
		System.out.println(column);
		
		WelcomePage w=new WelcomePage(driver);
		w.getLogin().click();
		
		LoginPage l=new LoginPage(driver);
		l.getE().sendKeys(s1);
		l.getP().sendKeys(s2);
		l.getLoginclick().click();
		
	//	w.getLogout().click();
		
	}
	@DataProvider(name = "ram")
	public Object[][] data() throws Exception
	{
		return readExcel_utility.fetchAllData("Sheet5");
	}

	
	@DataProvider(name = "reg")
	public Object[][] reg_data() throws Exception
	{
		return readExcel_utility.fetchAllData("Sheet7");
	}
	@Test(dataProvider = "reg", priority = 1)
	public void register(String s1, String s2,String s3,String s4,String s5)
	{
		WelcomePage w=new WelcomePage(driver);
		w.getRegisterlink().click();
		
		RegisterPage1 r=new RegisterPage1(driver);
		r.getGender().click();
	    r.getFirstname().sendKeys(s1);
	    r.getLastname().sendKeys(s2);
	    r.getEmail().sendKeys(s3);
	    r.getPassword().sendKeys(s4);
	    r.getConfirmpassword().sendKeys(s5);
	    r.getRegister().click();
	    
	    w.getLogout().click();
	    
	}
	@Test(dependsOnMethods = "login")
	public void selectProduct()
	{
		DigitalPage d=new DigitalPage(driver);
		d.getProduct2().click();
	}
	@Test(dependsOnMethods = "selectProduct")
	public void ClickOnShoppingCart()
	{
		WelcomePage w=new WelcomePage(driver);
		w.getShoppingcart().click();
	}
	@Test(dependsOnMethods = "ClickOnShoppingCart" )
	public void shoppingCart()
	{
		ShoppingCartPage s=new ShoppingCartPage(driver);
		s.getCheckbox().click();
		s.getTermandcondition().click();
		s.getCheckout().click();
	}
	@Test(dependsOnMethods = "shoppingCart")
	public void checkout()
	{
		CheckOutPage c=new CheckOutPage(driver);
		c.getCompany().sendKeys("puma");
		webdriver_utility.dropdown(c.getCountry(), "India");
		c.getCity().sendKeys("Bengaluru");
		c.getAddress1().sendKeys("ramghat");
		c.getAddress2().sendKeys("rampur");
		c.getPoatalcode().sendKeys("123456");
		c.getPhonenumber().sendKeys("7894561230");
		
	}

}
