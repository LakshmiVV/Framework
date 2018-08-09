package MergeLead;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Annotations extends SeMethods{
	public String excelFileName,testName,testDesc,category,author,moduleName; 
	@BeforeSuite
	public void startSuite() {
		beginResult();
		//loadObject();
	}
	@BeforeClass
	public void createNode() {
		startTest(testName, testDesc);
	}
	@Parameters({"url","uName","pwd"})
	@BeforeMethod
	public void login(String url,String uName,String pwd){
		startTestIteration(moduleName, author, category);
		startApp("chrome",url);
		WebElement userName = locateElement("username");
		type(userName,uName);
		WebElement password = locateElement("password");
		type(password,pwd);
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);
	}
	@AfterMethod
	public void logout() {
		closeBrowser();
	}
	@AfterSuite
	public void stopSuite() {
		endResult();
	}

//	@DataProvider(name="passData", indices= {0})
//	public Object[][] passData() throws IOException{
//		ReadExcel1 excel=new ReadExcel1();
//		return excel.readExcel(excelFileName);
//		
//	}


}




