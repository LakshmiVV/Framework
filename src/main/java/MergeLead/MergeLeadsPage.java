package MergeLead;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MergeLeadsPage extends Annotations {

	public MergeLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="xpath\",\"//img[@alt='Lookup']")
	WebElement elefromleadicon; 
	
	@FindBy(xpath="//input[@name='partyIdTo']/following::a[1]")
	WebElement eletoleadicon;

	public MergeLeadsPage clickFromLeadIcon() {
		click(elefromleadicon);
		switchToWindow(1);
		switchToWindow(0);
		return this;

	}
	
	public MergeLeadsPage clicktoleadicon() {
		click(eletoleadicon);
		switchToWindow(1);
		switchToWindow(0);
		return this;
	}
	
	public void acceptAlert() {
		acceptAlert();
	
		
	}
}



