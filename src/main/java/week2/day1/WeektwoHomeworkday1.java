package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import okio.Options;

public class WeektwoHomeworkday1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("lakshmi");
		driver.findElementById("userRegistrationForm:password").sendKeys("diya@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("diya@123");
		Thread.sleep(10000);
		WebElement SecurityQuestion = driver.findElementById("userRegistrationForm:securityQ");
		Select options = new Select(SecurityQuestion);
		options.selectByIndex(1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("dog");
		WebElement PreferredLanguage = driver.findElementById("userRegistrationForm:prelan");
		Select optionsprelanguage = new Select(PreferredLanguage);
		optionsprelanguage.selectByIndex(1);
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementByName("userRegistrationForm:firstName").sendKeys("vishnu");
		// WebElement radioBtn = driver.findElementById("userRegistrationForm:gender");
		// radioBtn.click();
		// WebElement radioBtn1 =
		// driver.findElementById("userRegistrationForm:maritalStatus");
		// radioBtn1.click();
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		WebElement Occupation = driver.findElementById("userRegistrationForm:occupation");
		Select optionsone = new Select(Occupation);
		options.selectByIndex(6);
		WebElement dobDay = driver.findElementById("userRegistrationForm:dobDay");
		Select optionsdob = new Select(dobDay);
		optionsdob.selectByValue("01");
		WebElement bornMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select dobMonth = new Select(bornMonth);
		dobMonth.selectByValue("02");
		WebElement bornYear = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dobYear = new Select(bornYear);
		dobYear.selectByVisibleText("1987");
		WebElement Country = driver.findElementById("userRegistrationForm:countries");
		Select optionscountry = new Select(Country);
		optionscountry.selectByIndex(1);
		driver.findElementById("userRegistrationForm:email").sendKeys("lakshmiramraj85@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9884680880");
		WebElement Nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select optionsnationality = new Select(Nationality);
		optionsnationality.selectByIndex(1);
		driver.findElementById("userRegistrationForm:address").sendKeys("No:11,vivekanandha street");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600073", Keys.TAB);
		Thread.sleep(5000);
		// driver.findElementById("userRegistrationForm:statesName").sendKeys("TamilNadu", Keys.TAB);
		WebElement City = driver.findElementById("userRegistrationForm:cityName");
		Select City1 = new Select(driver.findElementById("userRegistrationForm:cityName"));
		City1.selectByIndex(1);
		Thread.sleep(1000);
		WebElement Postoffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select optionspostoffice = new Select(Postoffice);
		optionspostoffice.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElementById("userRegistrationForm:landline").sendKeys("8951159910");
       
	}

}
