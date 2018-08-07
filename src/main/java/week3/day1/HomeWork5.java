package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		Set <String> allWindowHandle = driver.getWindowHandles();
		List <String> listOfWindows= new ArrayList <String>();
		listOfWindows.addAll(allWindowHandle);
		driver.switchTo().window(listOfWindows.get(1));
		driver.close();
		driver.switchTo().window(listOfWindows.get(2));
		driver.close();
		driver.switchTo().window(listOfWindows.get(3));
		driver.close();
		driver.switchTo().window(listOfWindows.get(0));
		System.out.println(driver.getTitle());
	}

}
