package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_EditLead extends Annotations{
	@BeforeTest
	public void setvalues() {
		excelFileName="Book1";
		testName="Create Lead";
		testDesc=" Deleting lead";
		category="smoke";
		author="Lakshmi";
		moduleName="Lead";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName, String fName, String lName) {
		new MyHomePage()
		.clickLeads()
		.clickcreateLeads()
		.typecompanyname(cName)
		.typefirstname(fName)
		.typeLastname(lName)
		.clickSubmit()
		.verifyFirstName(fName);

	}
}