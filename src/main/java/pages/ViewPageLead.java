package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ViewPageLead extends Annotations{
	
	public ViewPageLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstName;
	
	public ViewPageLead verifyFirstName(String expText) {
		verifyExactText(eleFirstName, expText);
		return this;
	}

}
