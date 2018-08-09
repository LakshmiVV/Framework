package week7homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MergeLead.Annotations;



public class MyHomePage extends Annotations{
	//create constructor
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Leads")
	WebElement eleLeads;
	public MyLeadsPage clickLeads()
	{
		click(eleLeads);
		return new MyLeadsPage();
	}
}







