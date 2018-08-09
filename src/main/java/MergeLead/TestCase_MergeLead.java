package MergeLead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MergeLead.Annotations;

public class TestCase_MergeLead extends Annotations {

	
	@BeforeTest
	public void setvalues() {
		excelFileName="Book1";
		testName="Merge Lead";
		testDesc="Merging the lead";
		category="sanity";
		author="Lakshmi";
		moduleName="Lead";
}
	@Test
	public void Mergelead() {
		new MyHomePage()
		.clickLeads()
		.clickMergeLead()
		.clickFromLeadIcon()
		.clicktoleadicon()
		.acceptAlert();		
	}
}
