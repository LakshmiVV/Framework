package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();	
    driver.manage().window().maximize();
	driver.get("http://jqueryui.com/droppable/");
	Thread.sleep(2000);
    WebElement eleFrame = driver.findElementByClassName("demo-frame");
	driver.switchTo().frame(eleFrame);
	WebElement eleDrag =driver.findElementByXPath("//div[@id='draggable']/p");
	WebElement eleDrop =driver.findElementByXPath("//div[@id='droppable']");
	//eleDrop.getLocation();
	Actions builder =new Actions(driver);
	builder.dragAndDrop(eleDrag, eleDrop).perform();
	}
}