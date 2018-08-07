package week4.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import weekendhomework.SeMethods;

public class CreateContactSeMethods extends SeMethods {

	public void createContact() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "demosalesmanager");
		WebElement elePwd = locateElement("id", "password");
		type(elePwd, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		eleLogin.click();
		WebElement eleCrmsfa = locateElement("LinkText", "CRM/SFA");
		eleCrmsfa.click();
		WebElement contacts = locateElement("xpath", "//a[text()='Contacts']");
		contacts.click();
		WebElement createContact = locateElement("LinkText", "Create Contact']");
		createContact.click();
		WebElement firstNameField = locateElement("id", "firstNameField");
		type(firstNameField, "lakshmi");
		WebElement lastNameField = locateElement("id", "lastNameField");
		type(lastNameField, "vaidelhi");
		WebElement createContactForm_firstNameLocal = locateElement("id", "createContactForm_firstNameLocal");
		type(createContactForm_firstNameLocal, "vaidelhi");
		WebElement createContactForm_lastNameLocal = locateElement("id", "createContactForm_lastNameLocal");
		type(createContactForm_lastNameLocal, "lakshmi");
		WebElement createContactForm_personalTitle = locateElement("id", "createContactForm_personalTitle");
		type(createContactForm_personalTitle, "mrs");
		WebElement createContactForm_generalProfTitle = locateElement("id", "createContactForm_generalProfTitle");
		type(createContactForm_generalProfTitle, "mrs");  
		WebElement createContactForm_departmentName = locateElement("id", "createContactForm_departmentName");
		type(createContactForm_departmentName, "ece");     
	    WebElement preferredCurrency = locateElement("id","createContactForm_preferredCurrencyUomId");
	    selectDropDownUsingIndex(preferredCurrency, 5);	
		WebElement createContactForm_description = locateElement("id", "createContactForm_description");
		type(createContactForm_description, "project");
		WebElement createContactForm_importantNote = locateElement("id", "createContactForm_importantNote");
		type(createContactForm_importantNote, "important");
		WebElement createContactForm_primaryPhoneAreaCode = locateElement("id", "createContactForm_primaryPhoneAreaCode");
		type(createContactForm_primaryPhoneAreaCode, "01");
		WebElement createContactForm_primaryPhoneExtension = locateElement("id", "createContactForm_primaryPhoneExtension");
		type(createContactForm_primaryPhoneExtension, "01");
		WebElement createContactForm_primaryEmail = locateElement("id", "createContactForm_primaryEmail");
		type(createContactForm_primaryEmail, "lakshmiramraj85@gmail.com");
		WebElement createContactForm_primaryPhoneNumber = locateElement("id", "createContactForm_primaryPhoneNumber");
		type(createContactForm_primaryPhoneNumber, "91");
		WebElement createContactForm_primaryPhoneAskForName = locateElement("id", "createContactForm_primaryPhoneAskForName");
		type(createContactForm_primaryPhoneAskForName, "91");	
       WebElement toName =locateElement("id","generalToNameField");
	    getText(toName);
		WebElement createContactForm_generalAddress1 = locateElement("id", "createContactForm_generalAddress1");
		type(createContactForm_generalAddress1, "test");	
		WebElement createContactForm_generalCity = locateElement("id", "createContactForm_generalCity");
		type(createContactForm_generalCity, "01");	
		WebElement createContactForm_generalPostalCode = locateElement("id", "createContactForm_generalPostalCode");
		type(createContactForm_generalPostalCode, "01");	
		WebElement createContactForm_generalPostalCodeExt = locateElement("id", "createContactForm_generalPostalCodeExt");
		type(createContactForm_generalPostalCodeExt, "91");	
		WebElement createContactForm_generalAttnName = locateElement("id", "createContactForm_generalAttnName");
		type(createContactForm_generalAttnName, "01");	
		WebElement createContactForm_generalAddress2 = locateElement("id", "createContactForm_generalAddress2");
		type(createContactForm_generalAddress2, "01");	
		WebElement country = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText (country, "India");	
		Thread.sleep(2000);	
		WebElement state = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingValue(state, "IN-AR");			
		WebElement addContact = locateElement("name", "submitButton");
		clickNoSnap(addContact);
		
			String firstName =driver.findElementById("viewContact_fullName_sp").getText();
			if (firstName.contains(toName)) {
				System.out.println("to name and first name is same");
			}else {
				System.out.println("to name and first name is not same");
			}
			 driver.findElementByLinkText("Edit").click();
			 WebElement campaign = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
			 Select campaignOpt = new Select(campaign);
			 campaignOpt.selectByVisibleText("Car and Driver");
			 String campaignvalue=driver.findElementByXPath("//div[@class='subSectionHeader']//following::a[1]").getText();
			 System.out.println(campaignvalue);
			 String campaignResults =driver.findElementById("viewContact_marketingCampaigns_sp").getText();
			 driver.findElementByXPath("//div[@class='fieldgroup-body']//tr[2]//td[2]//input[@type='submit']").click();
			 driver.findElementByXPath("//div[@class='fieldgroup-body']//tr[8]//td[2]//input[@type='submit']").click();
			
			 System.out.println(campaignResults);
			 if (campaignResults.contains(campaignvalue)) {
					System.out.println("CAmpaign value appeared correctly");
				}else {
					System.out.println("CAmpaign value appeared are not correct");
				}
			
			
			
		
	       
		}


	}