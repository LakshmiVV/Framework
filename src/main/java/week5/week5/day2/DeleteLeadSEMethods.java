package week5.week5.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
		public class DeleteLeadSEMethods extends Annotations {
			//@Test (groups= {"sanity"})
			//@Test(dependsOnMethods= {"week5.week5.day2.createLead"})
			@Test
			public void deleteLead() throws InterruptedException {
			
				WebElement login = locateElement("class","decorativeSubmit"); 
				click(login); 
				WebElement crmsfa = locateElement("LinkText","CRM/SFA");
				click(crmsfa); 
				WebElement leads = locateElement("LinkText","Leads");
				click(leads);
				WebElement findLead = locateElement("LinkText","Find Leads"); 
				click(findLead);
				WebElement Phone = locateElement("xpath","//span[@class='x-tab-strip-text ' and text() = 'Phone']");
				click(Phone);
				WebElement phoneCountryCode = locateElement("name","phoneCountryCode");
				phoneCountryCode.clear();
				//type(phoneCountryCode,"91");
				phoneCountryCode.sendKeys("91",Keys.TAB);
//				WebElement PhoneAreaCode = locateElement("xpath","//input[@name='phoneAreaCode']");
//				type(PhoneAreaCode,"222"); 
				WebElement phoneNumber = locateElement("xpath","//input[@name='phoneNumber']");
				type(phoneNumber,"9600851656");
				WebElement findLeadsButton = locateElement("xpath","//button[text() ='Find Leads']");
				click(findLeadsButton); 
				Thread.sleep(2000);
				WebElement id = locateElement("xpath","//div[@class='x-grid3-scroller']//table[1]//div[1]/a[1]");
				getText(id);
				Thread.sleep(5000);
				WebElement firstresulting= locateElement("xpath","//div[@class='x-grid3-scroller']//table[1]//div[1]/a[1]");
				firstresulting.click();
		        Thread.sleep(5000);
				WebElement edit= locateElement("xpath", "//a[text()='Delete']");
				edit.click();
				WebElement findLeads = locateElement("LinkText","Find Leads"); 
				click(findLeads);
				WebElement Leadid = locateElement("xpath", "//input[@name='id']");
				type(Leadid,"10000"); 
				Thread.sleep(2000);
				WebElement button1 = locateElement("xpath","//button[text() ='Find Leads']");
				button1.click();
				WebElement comment = locateElement("xpath","//div[@class='x-paging-info']");
				getText(comment);
				closeBrowser();

				
					

			}
		}
