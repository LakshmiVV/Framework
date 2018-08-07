package weekendhomework;
import javax.swing.plaf.ButtonUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		//ChromeOptions max = new ChromeOptions();
        //max.setHeadless(true);
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("lakshmi");
        WebElement button = driver.findElementByXPath("//button[text() ='Find Leads']");
		button.click();                                                        
        Thread.sleep(2000);
        driver.findElementByXPath("(//div[@class='x-grid3-scroller']//table[1]//div[1]/a)[1]").click();
        Thread.sleep(2000);
        String title = driver.getTitle();
		System.out.println(title);
        driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
		String cName = driver.findElementById("viewLead_companyName_sp").getText();
		String company ="Cognizant";
		if(cName==company)
		{ System.out.println("correct");}
		else {System.out.println("Wrong");}
		driver.close();  
	}   
	}
	        