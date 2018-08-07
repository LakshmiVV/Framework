package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();	
    driver.manage().window().maximize();
	driver.get("http://jqueryui.com/");
	driver.findElementByLinkText("Draggable").click();
	driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
	System.out.println(driver.findElementByXPath("//div[@id='draggable']/p").getText());
	driver.switchTo().defaultContent();
	driver.findElementByLinkText("Droppable").click();

}

}

