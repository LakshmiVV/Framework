package week5.week5.day2;
import javax.swing.plaf.ButtonUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EditLead extends Annotations {
	//@Test (groups= {"sanity"})
	@Test(dependsOnMethods= {"week5.week5.day2.CreateLead.createLead"})
	//@Test(enabled =false)
	//@Test
	public void EditLead() throws InterruptedException {
    
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
	
		
	}   
	}
	        