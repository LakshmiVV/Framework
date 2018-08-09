package MergeLead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import MergeLead.Annotations;

public class ViewLeadsPage extends Annotations {
	
	public ViewLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	
	public ViewLeadsPage verifyFirstName() {
		verifyExactText(eleFirstName, "Bhuwaneshwaran");
		return this;
	}
}
