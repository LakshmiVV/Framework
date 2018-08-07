package week4.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeOptions max = new ChromeOptions();
        //max.setHeadless(true);
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByXPath("//a[text()='Contacts']").click();
        driver.findElementByLinkText("Create Contact").click();
        driver.findElementById("firstNameField").sendKeys("lakshmi");
        driver.findElementById("lastNameField").sendKeys("vaidelhi");
        driver.findElementById("createContactForm_firstNameLocal").sendKeys("vaidelhi");
        driver.findElementById("createContactForm_lastNameLocal").sendKeys("lakshmi");
        driver.findElementById("createContactForm_personalTitle").sendKeys("mrs");
        driver.findElementById("createContactForm_generalProfTitle").sendKeys("mrs");
        driver.findElementById("createContactForm_departmentName").sendKeys("ece");
        WebElement preferredCurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");
		Select preferredoptions = new Select(preferredCurrency);
		preferredoptions.selectByIndex(5);
		driver.findElementById("createContactForm_description").sendKeys("project");
		driver.findElementById("createContactForm_importantNote").sendKeys("important");
		driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("01");
		driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("01");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("lakshmiramraj85@gmail.com");
		driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("91");
		driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("91");
		String toName =driver.findElementById("generalToNameField").getText();
		System.out.println(toName);
		driver.findElementById("createContactForm_generalAddress1").sendKeys("test");
		driver.findElementById("createContactForm_generalCity").sendKeys("01");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("01");
		driver.findElementById("createContactForm_generalPostalCode").sendKeys("91");
		driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("91");
		driver.findElementById("createContactForm_generalAttnName").sendKeys("91");
		driver.findElementById("createContactForm_generalAddress2").sendKeys("91");
		WebElement country = driver.findElementById("createContactForm_generalCountryGeoId");
		Select countyOpt = new Select(country);
		countyOpt.selectByVisibleText("India");
		Thread.sleep(2000);
		WebElement state = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select stateOpt = new Select(state);
		stateOpt.selectByValue("IN-AR");
		driver.findElementByName("submitButton").click();
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
