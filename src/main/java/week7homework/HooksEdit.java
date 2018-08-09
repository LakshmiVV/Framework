package week7homework;

import org.openqa.selenium.WebElement;

import MergeLead.Annotations;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksEdit extends Annotations {
	
	@Before
	public void beforeMethod(Scenario sc) {
		
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		click(locateElement("LinkText","CRM/SFA"));
		
	}
	@After
	public void afterMethod(Scenario sc) {
		
		System.out.println(sc.getStatus());
		System.out.println(sc.isFailed());
		closeAllBrowsers();

		
	}

	
}
