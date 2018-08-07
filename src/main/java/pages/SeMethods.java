package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods extends Reporter implements WdMethods{
	public  RemoteWebDriver driver ;
	public static Properties prop;
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				 driver = new FirefoxDriver();		
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			reportStep("The Browser "+browser+" is Launched Successfully","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			reportStep("The Browser "+browser+" is not Launched","fail");
		}
		finally {
		takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);	
			case "linktext" : return driver.findElementByLinkText(locValue);
			case"name" : return driver.findElementByName(locValue);
			}
			reportStep("The element "+locValue+" is found successfully","pass");
		} catch (NoSuchElementException e) {
			//System.err.println("NoSuchElementException occurred");
			reportStep("The element "+locValue+" is not found","fail");
		} catch(Exception e) {
			reportStep("The element "+locValue+" is not found","fail");
			throw new RuntimeException();
		}
			return null;
	}

	public WebElement locateElement(String locValue) {
		try {
			reportStep("The element "+locValue+" is found successfully","pass");
			return driver.findElementById(locValue);
		} catch (Exception e) {
			reportStep("The element "+locValue+" is not found","fail");
			e.printStackTrace();
		}
		return null;
	}

	public void type(WebElement ele, String data) throws NullPointerException{
		try {
			ele.sendKeys(data);
			//System.out.println("The Data "+data+" is Entered Successfully");
			reportStep("The Data "+data+" is Entered Successfully","pass");
		} catch (WebDriverException e) {
			//System.err.println("WebDriverException has occurred");
			reportStep("The Data "+data+" is not Entered","fail");
			e.printStackTrace();
		}catch(Exception e) {
			//System.err.println("exception"+e+"has occurred");
			reportStep("The Data "+data+" is not Entered","fail");
		}finally {
		takeSnap();
		}
	}

	public void click(WebElement ele) {
	try {
		ele.click();
		//System.out.println("The Element " + ele + " is clicked Successfully");
		reportStep("The Element " + ele + " is clicked Successfully","pass");
	}catch(Exception e){
		reportStep("The Element " + ele + " is not clicked","fail");
	}
	finally {
		// TODO: handle finally clause
		takeSnap();	
	}	
	}

	public String getText(WebElement ele) {
		// returns the text Value as a String
		try {
			ele.getText();
			reportStep("The value of Element"+ele+"has been retruned","pass");
			return ele.getText();
		} catch (Exception e) {
			reportStep("The value of Element"+ele+"is not retruned","fail");
			e.printStackTrace();
		} 
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
			reportStep("the element with text"+value+"has been selected","pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("the element with text"+value+"is not selected","fail");
			throw new RuntimeException();
		} finally {
		takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		try {
		Select dd = new Select(ele);
		dd.selectByIndex(index);
		//System.out.println("The Dropdown"+index+" has been selected");
		reportStep("The Dropdown"+index+" has been selected","pass");
		}catch(Exception e) {
		reportStep("The Dropdown"+index+" is not selected","fail");	
		}finally {
		takeSnap();
	}
	}
	public boolean verifyTitle(String expectedTitle) { 
		boolean bReturn =false;
		try{
		if(driver.getTitle().equals(expectedTitle)) {
			bReturn =true;
		reportStep("The title matches","pass");
		}
		else {
			//System.out.println("The Title didnot match");
			reportStep("The Title didnot match","fail");
		}
	
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return bReturn;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try{
			String text = ele.getText();
		if (expectedText.equals(text)){
			reportStep("the text is matching exactly","pass");
		}
		else {
			//System.out.println(" the text is not matching exactly");
			reportStep("the text is not matching exactly","fail");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
		String text=ele.getText();
		if(text.contains(expectedText))
			//System.out.println("The text has partial match");
			reportStep("The text has partial match","pass");
		else
			//System.out.println("The text does not have partial match");
			reportStep("the text did not match partially","fail");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
		if(ele.getAttribute(attribute).equals(value))
			//System.out.println("The value of the given attribute matches with expected value");
			reportStep("The value of the given attribute matches with expected value","pass");
		else
			//System.out.println("The value of the given attribute does not match with expected value");
			reportStep("The value of the given attribute does not match with expected value","fail");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
		if(ele.getAttribute(attribute).contains(value))
			//System.out.println("The attribute value matches partially");
			reportStep("The attribute value matches partially","pass");
		else
			//System.out.println("The attribute value does not match partially");
			reportStep("The attribute value does not match partially","fail");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void verifySelected(WebElement ele) {
		try {
		if(ele.isSelected())
			//System.out.println("The Element"+ele+"is selected");
			reportStep("The Element"+ele+"is selected","pass");
		else
			//System.out.println("The Element"+ele+"is not selected");
			reportStep("The Element"+ele+"is not selected","fail");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		try {
		Set<String> allWH=driver.getWindowHandles();
		List<String> listOfWH=new ArrayList<String>();
		listOfWH.addAll(allWH);
		driver.switchTo().window(listOfWH.get(index));
		reportStep("The window has been switched successfully","pass");
		}catch(Exception e) {
			reportStep("The window is not switched","fail");
			e.printStackTrace();
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
		driver.switchTo().frame(ele);
		reportStep("The frame has been switched successfully","pass");
		}catch(Exception e) {
			reportStep("The frameis not switched","fail");
			e.printStackTrace();
		}
	}

	public void acceptAlert() {
		try {
		//Alert myAlert=driver.switchTo().alert();
		//myAlert.accept();
		driver.switchTo().alert().accept();
		reportStep("The alert has been accepted","pass");
		}catch(Exception e) {
			reportStep("The alert is not accepted","fail");
			e.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
		driver.switchTo().alert().dismiss();
		reportStep("The alert has been dismissed","pass");
		}catch(Exception e) {
			reportStep("The alert is not dismissed","fail");
			e.printStackTrace();
		}
	}

	public String getAlertText() {
		try {
		String alertText=driver.switchTo().alert().getText();
		reportStep("The alert text has been received successfully","pass");
		return alertText;
		}catch(Exception e) {
			reportStep("The alert text is not received","fail");
			e.printStackTrace();
		}
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
			reportStep("Snapshot has been taken successfully","pass");
		} catch (IOException e) {
			reportStep("Snapshot not taken","fail");
			e.printStackTrace();
		}
		i++;
	}

	public void noSnap(WebElement ele) {
		try {
		ele.click();
		reportStep("The element"+ele+"is clicked successfully","pass");
		}catch(Exception e) {
			reportStep("The element"+ele+"is not clicked","fail");
			e.printStackTrace();
		}
	}
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
		driver.close();
		reportStep("The browser has been closed successfully","pass");
		}catch(Exception e) {
			reportStep("The browser is not closed","fail");
			e.printStackTrace();
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
		reportStep("All browser instances has been closed","pass");
	}
	
	public void loadObject() {
		try {
			Properties prop=new Properties();
			prop.load(new FileInputStream("H:/workspace/Sel/seljuly2018/src/main/resources/Object.Properties"));
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException has occured");
		} catch (IOException e) {
			System.err.println("IOException has occured");
		}
		
	}
}
		
	

