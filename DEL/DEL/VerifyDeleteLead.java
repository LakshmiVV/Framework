package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import readexcelpoi.Annotationspoi;

public class VerifyDeleteLead extends Annotationspoi{
	public VerifyDeleteLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Find Leads")
	WebElement eleverfyFindLeads;
	
	public MyLeadsFindLeads2 clickverfyFindLeads()
	{
		click(eleverfyFindLeads);
		return new MyLeadsFindLeads2();
	}

}
