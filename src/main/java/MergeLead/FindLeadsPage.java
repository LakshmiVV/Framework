package MergeLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MergeLead.Annotations;

public class FindLeadsPage extends Annotations{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement elefirstName;
	
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindLeads;
	
	@FindBy(xpath="//a[@class='linktext' and text()='10021']")
	WebElement elefirstlead; 

	
	public FindLeadsPage typeFirstName() {
		type(elefirstName,"Bhuwaneshwaran");
		return this;
	}
	
	public FindLeadsPage clickFindLeads() {
		click(eleFindLeads);
		return this;
	}
		
	public MergeLeadsPage clickFirstlead() {
		click(elefirstlead);
		return new MergeLeadsPage();

		
		
	}
		
	}

