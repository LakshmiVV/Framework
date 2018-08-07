package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import readexcelpoi.Annotationspoi;

public class ViewLeadDelPage extends Annotationspoi{

	public ViewLeadDelPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Delete")
	WebElement eleDeleteLead;
	
	public VerifyDeleteLead clickDeleteLead()
	{
		click(eleDeleteLead);
		return new VerifyDeleteLead();
	}
}
