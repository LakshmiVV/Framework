package week7homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MergeLead.Annotations;






public class ViewLeadsPage extends  Annotations {
	//create constructor
	public ViewLeadsPage() {
		PageFactory.initElements(driver, this);
	}	@FindBy(id="viewLead_firstName_sp")
	WebElement eleViewLeads;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement eleClickEditLeads;
	
	
public EditLeadPage eleClickEdit()
	{
		click(eleClickEditLeads);
		return new EditLeadPage();
	}

	
	

}
