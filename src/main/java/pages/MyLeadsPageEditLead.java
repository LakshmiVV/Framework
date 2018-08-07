package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLeadsPageEditLead extends Annotations {
	public MyLeadsPageEditLead ()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText = "Find Leads")
WebElement eleFindLeadsLink;


public MyLeadsPageEditLead clickFindLeadsDel()
{
click(eleFindLeadsLink);
return new MyLeadsPageEditLead();
}
}
