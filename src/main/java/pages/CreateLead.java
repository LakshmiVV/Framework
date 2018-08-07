package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead extends Annotations{

	public CreateLead() {
		PageFactory.initElements(driver, this);
	}	
		@FindBy(id="createLeadForm_companyName")
		WebElement eleCName;
		
		@FindBy(id="createLeadForm_firstName")
		WebElement elefirstName;
		
		@FindBy(id="createLeadForm_lastName")
		WebElement elelastName;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement elecreateLead;
		
		public CreateLead typecompanyname(String cName) {
		type(eleCName,cName);
		return this;
		}
		
		public CreateLead typefirstname(String Fname) {
		type(elefirstName,Fname);
		return this;
		}
		
		public CreateLead typeLastname(String Lname) {
		type(elelastName,Lname);
		return this;
		
		}
	
		public ViewPageLead clickSubmit() {
		click(elecreateLead); 
		return new ViewPageLead();
			

	}

}
