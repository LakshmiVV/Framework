package weekendhomework;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class DuplicateLeadSEMethods extends SeMethods {
	@Test
	public void DuplicateLeadSEMethods () throws InterruptedException {
		startApp("chrome","http://leaftaps.com/opentaps/control/main");	
		WebElement username = locateElement("username");
		type(username,"DemoSalesManager");
		WebElement password = locateElement("password");
		type(password,"crmsfa"); 
		WebElement login = locateElement("class","decorativeSubmit"); 
		click(login); 
		WebElement crmsfa = locateElement("LinkText","CRM/SFA");
		click(crmsfa); 
		WebElement leads = locateElement("LinkText","Leads");
		click(leads);
		WebElement elefindLeads= locateElement("LinkText", "Find Leads");
		elefindLeads.click();
		WebElement email = locateElement("xpath","//span[text()='Email']");
		click(email);
		WebElement emailaddress = locateElement("xpath","(//input[@name='emailAddress'])[1]");
		type(emailaddress,"vijaycse@gmail.com");
		WebElement button = locateElement("xpath","//button[text() ='Find Leads']");
		button.click();
		Thread.sleep(2000);
		WebElement id = locateElement("xpath","//div[@class='x-grid3-scroller']//table[1]//div[1]/a[1]");
		getText(id);
		Thread.sleep(5000);
		WebElement firstresulting= locateElement("xpath","//div[@class='x-grid3-scroller']//table[1]//div[1]/a[1]");
		firstresulting.click();
		Thread.sleep(5000);
		WebElement edit= locateElement("xpath", "//a[text()='Duplicate Lead']");
		edit.click();
		WebElement title = locateElement("id","sectionHeaderTitle_leads");
		getText(title);
		WebElement submit =locateElement("xpath","//input[@name ='submitButton']");
		getText(submit);
		closeBrowser();


	}

}
