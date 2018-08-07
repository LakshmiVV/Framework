package weekendhomework;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadSEMethods extends SeMethods {
	@Test
	public void EditLead() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "demosalesmanager");
		WebElement elePwd = locateElement("id", "password");
		type(elePwd, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		eleLogin.click();
		WebElement eleCrmsfa = locateElement("LinkText", "CRM/SFA");
		eleCrmsfa.click();
		WebElement eleLeads= locateElement("LinkText", "Leads");
		eleLeads.click();
        WebElement elefindLeads= locateElement("LinkText", "Find Leads");
		elefindLeads.click();
        WebElement elefirstname = locateElement("xpath","(//input[@name='firstName'])[3]");
		type(elefirstname , "lakshmi");
        WebElement findLeads = locateElement("xpath", "//button[text() ='Find Leads']");
		findLeads.click();
        Thread.sleep(5000);
        WebElement firstresulting= locateElement("xpath","//div[@class='x-grid3-scroller']//table[1]//div[1]/a[1]");
		firstresulting.click();
        Thread.sleep(5000);
        WebElement viewleadcompany =locateElement("id", "viewLead_companyName_sp");
		getText(viewleadcompany);
		getTitle();
        WebElement edit= locateElement("xpath", "//a[text()='Edit']");
		edit.click();
        WebElement companyName= locateElement("id", "updateLeadForm_companyName");
		companyName.clear();
        WebElement entercompanyName= locateElement("id", "updateLeadForm_companyName");
		type(entercompanyName ,"cognizant");
        WebElement submitButton= locateElement("name", "submitButton");
		submitButton.click();
        Thread.sleep(5000);
        WebElement viewleadcompanys = locateElement("id", "viewLead_companyName_sp");
        String company ="cognizant (10315)";
        verifyExactText(viewleadcompanys,company);
		closeBrowser();
		

}
}