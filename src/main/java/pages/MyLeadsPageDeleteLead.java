package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLeadsPageDeleteLead extends Annotations {
	public MyLeadsPageDeleteLead ()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(linkText = "Find Leads")
WebElement eleFindLeadsLink;


public MyLeadsPageDeleteLead clickFindLeadsDel()
{
click(eleFindLeadsLink);
return new MyLeadsPageDeleteLead();
}
}
