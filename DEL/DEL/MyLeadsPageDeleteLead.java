package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import readexcelpoi.Annotationspoi;

public class MyLeadsPageDeleteLead extends Annotationspoi {
	public MyLeadsPageDeleteLead ()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText = "Find Leads")
WebElement eleFindLeadsLink;


public MyLeadsFindLeadsDel clickFindLeadsDel()
{
click(eleFindLeadsLink);
return new MyLeadsFindLeadsDel();
}
}

