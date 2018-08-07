package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import readexcelpoi.Annotationspoi;

public class VerifyChange extends Annotationspoi {
	
	public VerifyChange()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(id ="viewLead_companyName_sp")
WebElement eleverifyCname;

public void VerifyCname(String expectedText)
{
verifyExactText(eleverifyCname, expectedText);
closeAllBrowsers();
}
}
