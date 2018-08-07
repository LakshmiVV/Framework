package weekendhomework;
import java.awt.List;
import org.hamcrest.core.IsSame;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckBox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		java.util.List<WebElement> checkedList = driver.findElementsByTagName("input");

		for (WebElement uncheck : checkedList) {
			if (uncheck.isSelected()) {
				uncheck.click();
				System.out.println("The items are Unchecked");
			}
		}

	}

}
