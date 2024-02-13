package Test_Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_utility.Baseclass;
import pomscript.LoginPage;
import pomscript.WelcomePage;

public class programTest extends Baseclass{
@Test
public void  testcase()
{
    String username=	System.getProperty("username");
	String password=System.getProperty("password");
	
	Reporter.log(username,true);
	Reporter.log(password,true);
	WelcomePage w=new WelcomePage(driver);
	w.getLogin().click();
	LoginPage l=new LoginPage(driver);
	l.getE().sendKeys(username);
	l.getP().sendKeys(password);
	l.getLoginclick().click();
	
	}
}
