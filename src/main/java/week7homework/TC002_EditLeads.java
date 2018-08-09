package week7homework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MergeLead.Annotations;




public class TC002_EditLeads extends Annotations {
	@BeforeTest
	public void setvalues() {
		excelFileName="Editlead";
		testName="Edit Lead";
		testDesc="Editting An existing lead";
		category="sanity";
		author="raji";
		moduleName="Lead";
	}
	@Test/*(dataProvider="fetchData")*/
	public void EditLead() throws InterruptedException
	{
		new MyHomePage()
		.clickLeads()
		.eleFindLeadsPage()
		.eleFindPage()
		.eleClickEdit()
		.eleEditLeadsPage();
		
		
	}
}
