package MergeLead;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MergeLead.Annotations;

public class MyLeadsPage extends Annotations{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Merge Lead")
	WebElement eleMergeLead;
	
	public  MergeLeadsPage clickMergeLead() {
		click(eleMergeLead);
		return new MergeLeadsPage();
		
	}

}

