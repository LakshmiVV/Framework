package week5.week5.day2;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import weekendhomework.SeMethods;


public class Annotations extends SeMethods {
	@Parameters ({"url","username","password"})
	@BeforeMethod
	//@BeforeMethod(groups= {"sanity","smoke"})
	public void login(String url,String username,String password)  {
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, username);
		WebElement elePwd = locateElement("id", "password");
		type(elePwd, password);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		eleLogin.click();
		WebElement eleCrmsfa = locateElement("LinkText", "CRM/SFA");
		eleCrmsfa.click();
		//Thread.sleep(20000);
	}

	//@AfterMethod(groups= {"sanity","smoke"})
	@AfterMethod
	public void close() {
		closeBrowser();
	}
}


