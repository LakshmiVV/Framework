package weekendhomework;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lastonefindeach {	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
	WebElement drops = driver.findElementByXPath("//div[@class='example']//input[2]");
	boolean vbselected=drops.isSelected();
	if(vbselected==true) {
		System.out.println("The VB Check box is selected");
	}
	else
	{
		System.out.println("The VB Check box is not selected");
	}
	WebElement down=driver.findElementByXPath("//div[@id=\"contentblock\"]/section/div[2]/input");
	boolean selselected=down.isSelected();
	if(selselected==true)
	{
		System.out.println("The Selenium Check box is selected");
	}
	else
	{
		System.out.println("The Selenium Check box is not selected");
	}
}
}

