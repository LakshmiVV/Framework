package weekendhomework;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class merg extends SeMethods {
	@Test
	public void mergeLead()
	{
		//Launching the application
		startApp("chrome", "http://leaftaps.com/opentaps");
		//Finding the username
		WebElement eleUserName = locateElement("id", "username");
		//Entering the username
		type(eleUserName, "DemoSalesManager");
		//Finding the Password
		WebElement elePassword = locateElement("id","password");
		//Entering the Password
		type(elePassword, "crmsfa");
		//Locating the submit button
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		//Clicking on submit button
		click(eleLogin);
		// Locating "CRM/SFA"
		WebElement eleCrmLink = locateElement("linkText","CRM/SFA");
		//Clicking the link
		click(eleCrmLink);
		//Locating and clicking Leads Link
		click(locateElement("linkText","Leads"));
		//Locating and clicking on Merge Leads
		click(locateElement("linkText","Merge Leads"));
		//Locating and Clicking on icon near from lead
		click(locateElement("xpath","//input[@id='partyIdFrom']/following::a[1]"));
		//Moving to new window
		switchToWindow(1);
		//Inside new Window
		//Locating and typing Lead Id
		type(locateElement("name","id"),"10086");
		//Locating and clicking Find Leads Button
		click(locateElement("xpath","//td[@class='x-btn-center']"));
		//Locating and clicking  first resulting lead
		clickNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//switch back to primary window
		timeouts();
		switchToWindow(0);
		//Locating and Clicking on icon near To lead
		clickNoSnap(locateElement("xpath","//input[@id='partyIdTo']/following::a[1]"));
		//Moving to new window
		switchToWindow(1);
		//Inside new Window
		//Locating and typing Lead Id
		type(locateElement("name","id"),"10088");
		//Locating and clicking Find Leads Button
		click(locateElement("xpath","//td[@class='x-btn-center']"));
		//Locating and clicking  first resulting lead
		clickNoSnap(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		//switch back to primary window
		switchToWindow(0);
		//click Merge
        clickNoSnap(locateElement("linkText","Merge"));
        //Accept Alert
        acceptAlert();
        //timeout
        timeouts();
        //click find leads
        click(locateElement("linkText","Find Leads"));
        //Locate and enter from Lead id
        type(locateElement("name","id"),"10087");
        //click Find Leads Button
        click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
        //verify error message
        verifyExactText(locateElement("xpath","//div[contains(text(),'No records to display')]"),"No records to display");
        //close the browser
        closeBrowser();
	}

}

