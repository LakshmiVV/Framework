package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/sortable/");
		Thread.sleep(2000);
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame);
		WebElement eleDrag =driver.findElementByXPath("//ul[@id='sortable']/li[1]");
		Thread.sleep(2000);
		WebElement eleDrop =driver.findElementByXPath("//ul[@id='sortable']/li[5]");
		System.out.println(eleDrop.getLocation());
		Actions builder =new Actions(driver);
		builder.dragAndDropBy(eleDrag, 11, 171).build().perform();
	}

}
