package week3.day1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int count =0;
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
	    // Getting the inframe using webelement List
	    List<WebElement> allFrames =  driver.findElements(By.tagName("iframe"));
	    for(WebElement eachFrame: allFrames)
		{   
			driver.switchTo().frame(eachFrame);
		    List<WebElement> inFrame =  driver.findElements(By.tagName("iframe"));
			
			for(WebElement innerFrame : inFrame)
			{
				count = count+size;
			
	
			}
		 	driver.switchTo().defaultContent();
		  }
	    System.out.println("Total Frames --" + count);
}
}
