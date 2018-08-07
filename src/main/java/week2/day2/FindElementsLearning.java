	
		package week2.day2;
		import java.util.List;

		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.support.ui.Select;

		import okio.Options;

		public class FindElementsLearning {

			public static void main(String[] args) {
		     System.setProperty("webdriver.chrome.driver","D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
			 ChromeOptions max = new ChromeOptions();
		     max.setHeadless(true);
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("http://leaftaps.com/opentaps");
		        driver.findElementById("username").sendKeys("demosalesmanager");
		        driver.findElementById("password").sendKeys("crmsfa");
		        driver.findElementByClassName("decorativeSubmit").click();
		        driver.findElementByLinkText("CRM/SFA").click();
		        driver.findElementByLinkText("Create Lead").click();
		        List<WebElement> dropDown = driver.findElementsByTagName("select");
		        int numberOfDrop = dropDown.size();
		        System.out.println(numberOfDrop);
		        List<WebElement> textBox = driver.findElementsByClassName("inputBox");
		        int noOfTextBox=textBox.size();
		        System.out.println(noOfTextBox);
		        

	}

}
