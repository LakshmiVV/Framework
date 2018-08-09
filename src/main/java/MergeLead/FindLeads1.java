package MergeLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MergeLead.Annotations;

public class FindLeads1 extends Annotations {

	public FindLeads1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='firstName']")
	WebElement eletofindleadicon;

	@FindBy(xpath="//button[@type='button' and text()='Find Leads']")
	WebElement eleFindleads;

	@FindBy(xpath="//a[@class='linktext' and text()='10013']")
	WebElement elefirstlead;


	public  FindLeads1 typefirstname() {
		type(eletofindleadicon,"Bhuwaneshwaran");
		return this;
	}

	public  FindLeads1 clickfindlead() {
		click(eleFindleads); 
		return this;
	}	
	public MergeLeadsPage clickfirstlead() {
		click(elefirstlead); 
		return new MergeLeadsPage();	
	}
}

