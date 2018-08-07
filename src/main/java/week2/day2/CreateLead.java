package week2.day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import weekendhomework.SeMethods;

public class CreateLead extends SeMethods {
	@Test
	public void createLead(){
             startApp("chrome", "http://leaftaps.com/opentaps");
             WebElement eleUserName = locateElement("id", "username");
             type(eleUserName, "demosalesmanager");
             WebElement elePwd = locateElement("id", "password");
             type(elePwd, "crmsfa");
             WebElement eleLogin = locateElement("class", "decorativeSubmit");
             eleLogin.click();
             WebElement eleCrmsfa = locateElement("LinkText", "CRM/SFA");
             eleCrmsfa.click();
             WebElement eleCreateLead = locateElement("LinkText", "Create Lead");
             eleCreateLead.click();
             WebElement companyName = locateElement("id", "createLeadForm_companyName");
             type(companyName, "WIPRO");
             WebElement firstName = locateElement("id", "createLeadForm_firstName");
             type(firstName, "Vaidehi");
             WebElement lastName = locateElement("id", "createLeadForm_lastName");
             type(lastName, "Lakshmi");
             WebElement firstNameLocal = locateElement("id", "createLeadForm_firstNameLocal");
             type(firstNameLocal, "Vaidehi");
             WebElement lastNameLocal = locateElement("id", "createLeadForm_lastNameLocal");
             type(lastNameLocal, "Lakshmi");
             WebElement personalTitle = locateElement("id", "createLeadForm_personalTitle");
             type(personalTitle, "y");
             WebElement profileTitle = locateElement("id", "createLeadForm_generalProfTitle");
             type(profileTitle, "mrs");
             WebElement revenue = locateElement("id", "createLeadForm_annualRevenue");
             type(revenue, "10000");
             WebElement dataSource = locateElement("id", "createLeadForm_dataSourceId");
             selectDropDownUsingIndex(dataSource, 7);
             WebElement industry = locateElement("id", "createLeadForm_industryEnumId");
             selectDropDownUsingIndex(industry, 8);
             WebElement ownership = locateElement("id", "createLeadForm_ownershipEnumId");
             selectDropDownUsingIndex(ownership, 5);
             WebElement pinCode = locateElement("id", "createLeadForm_sicCode");
             type(pinCode, "001");
             WebElement desc = locateElement("id", "createLeadForm_description");
             type(desc, "createlead");
             WebElement importantNotes = locateElement("id", "createLeadForm_importantNote");
             type(importantNotes, "createlead");
             WebElement ctryCd = locateElement("id", "createLeadForm_primaryPhoneCountryCode");
             type(ctryCd, "91");
             WebElement areaCd = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
             type(areaCd, "01");
             WebElement phoneExtCd = locateElement("id", "createLeadForm_primaryPhoneExtension");
             type(phoneExtCd, "01");
             WebElement departName = locateElement("id", "createLeadForm_departmentName");
             type(departName, "ECE");
             WebElement currency = locateElement("id", "createLeadForm_currencyUomId");
             selectDropDownUsingIndex(currency, 5);
             //switchToFrame(eleCreateLead);
	}        
	        
	}
	  /*    	   
			
		
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("3");
			driver.findElementById("createLeadForm_tickerSymbol").sendKeys("three");
			driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("8951159910");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("wwww.gmail.com");
			driver.findElementById("createLeadForm_generalToName").sendKeys("vishnu");
			driver.findElementById("createLeadForm_generalAddress1").sendKeys("No:11 vivekanandhastreet");
			driver.findElementById("createLeadForm_generalAddress2").sendKeys("No:18,vengopalswamystreet");
			driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
			WebElement ZipPostalCodeExtension = driver.findElementById("createLeadForm_currencyUomId");
			Select codeextension = new Select(ZipPostalCodeExtension);
			codeextension.selectByIndex(5);
			driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600073");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600073");
			driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600073");
			WebElement country = driver.findElementById("createLeadForm_currencyUomId");
			Select countn = new Select(country);
			countn.selectByIndex(5);
			WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select stateoptions = new Select(state);
			stateoptions.selectByIndex(5);
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9884680880");
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("lakshmiramraj85@gmai.com");
			driver.findElementByClassName("smallSubmit").click();
	}

}*/
