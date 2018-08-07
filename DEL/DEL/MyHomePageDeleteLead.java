package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import readexcelpoi.Annotationspoi;

public class MyHomePageDeleteLead extends Annotationspoi {
	public MyHomePageDeleteLead()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Leads")
	WebElement eleLeadslink;
	
	public MyLeadsPageDeleteLead clickLeadsDel()
	{
	click(eleLeadslink)	;
	return new MyLeadsPageDeleteLead();
	}
}
