package week7homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MergeLead.Annotations;




public class MyLeadsPage extends Annotations{
	//create constructor
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Find Leads")
	WebElement eleFindLeads;
	
	public FindLeadPage eleFindLeadsPage()
	{
		click(eleFindLeads);
		return new FindLeadPage();
		
	}
	

}




