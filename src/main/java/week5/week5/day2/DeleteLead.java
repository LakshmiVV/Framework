package week5.week5.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElementByXPath("//span[text()='Phone']").click();
		WebElement ccode = driver.findElementByName("phoneCountryCode");
		ccode.clear();
		ccode.sendKeys("1",Keys.TAB);
		driver.findElementByName("phoneAreaCode").sendKeys("1");
		driver.findElementByName("phoneNumber").sendKeys("9962553665");
		WebElement button = driver.findElementByXPath("//button[text() ='Find Leads']");
		button.click();
		Thread.sleep(2000);
		String id = driver.findElementByXPath("(//div[@class='x-grid3-scroller']//table[1]//div[1]/a)[1]").getText();
		System.out.println(id);
		driver.findElementByXPath("(//div[@class='x-grid3-scroller']//table[1]//div[1]/a)[1]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		Thread.sleep(2000);
		WebElement button1 = driver.findElementByXPath("//button[text() ='Find Leads']");
		button1.click();
		String comment = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(comment);
		driver.close();
		

	}

}
