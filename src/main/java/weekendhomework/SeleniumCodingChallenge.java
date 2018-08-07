package weekendhomework;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCodingChallenge {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		WebElement Country = driver.findElementById("userRegistrationForm:countries");
		Select select = new Select(Country);
		List<WebElement> list = select.getOptions();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}

	}
}