package week4.day2;



import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import weekendhomework.SeMethods;


public class Flipkart extends SeMethods{
	@Test
	public void compare() throws Exception{

		startApp("chrome","https://www.flipkart.com/");
		WebElement alertclose = locateElement("xpath","//button[@class='_2AkmmA _29YdH8']");
		click(alertclose); 
		Actions builder = new Actions(driver);
		WebElement tvandapp = locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement samsung = locateElement("xpath","(//span[text()='Samsung'])[2]");
		builder.moveToElement(tvandapp).pause(3000).click(samsung).perform(); 
		WebElement mininum = locateElement("xpath","//select[@class='fPjUPw']");
		selectDropDownUsingIndex(mininum,3); 
		WebElement maximum = locateElement("xpath","//div[@class='_1YoBfV']/select");
		selectDropDownUsingIndex(maximum,4);  
		WebElement screenSize = locateElement("xpath","//div[text()='Screen Size']");
		click(screenSize);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(screenSize));
		WebElement screenSizeClick = locateElement("xpath","//div[@class='_1GEhLw' and text() = '48 - 55']");
		click(screenSizeClick); 
		WebElement clickFirstProduct = locateElement("xpath","(//div[@class='_3wU53n'])[1]");
		click(clickFirstProduct); 
		switchToWindow(1);
		WebElement compare = locateElement("xpath","//span[text()='Compare']");
		click(compare);
		closeBrowser();
		switchToWindow(0);
		WebElement clicksecondproduct = locateElement("xpath","(//div[@class='_3wU53n'])[2]");
		click(clicksecondproduct);
		switchToWindow(1); 
		WebElement compare2 = locateElement("xpath","//span[text()='Compare']");
		click(compare2);
		WebElement comparel = locateElement("xpath","//span[text()='COMPARE']"); 
		click(comparel); 
		String compareAmount1 = locateElement("xpath","(//div[@class='_1vC4OE'])[1]").getText().replaceAll("₹", "").replaceAll(",", "");
		int compareAmount1Int = Integer.parseInt(compareAmount1);
		String compareAmount2 = locateElement("xpath","(//div[@class='_1vC4OE'])[2]").getText().replaceAll("₹", "").replaceAll(",", "");
		int compareAmount2Int = Integer.parseInt(compareAmount2);
		if(compareAmount1Int<compareAmount2Int) {
			WebElement buynow = locateElement("xpath","(//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[1]");
			click(buynow); 
		}else {
			WebElement buynow1 = locateElement("xpath","(//button[@class='_2AkmmA _2Npkh4 _2kuvG8 e1kKGU _7UHT_c'])[2]");
			click(buynow1); 
		} 



	}
}