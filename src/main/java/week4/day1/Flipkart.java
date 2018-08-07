package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();	
    driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByXPath("//button[text()='✕']").click();
	WebElement eleTv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
	WebElement eleThomsan = driver.findElementByXPath("//span[text()='Thomson']");
	Actions builder = new Actions(driver);
	builder.moveToElement(eleTv).pause(3000).click(eleThomsan).build().perform();
	
	}

}
