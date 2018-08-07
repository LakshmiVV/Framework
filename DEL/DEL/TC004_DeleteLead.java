package pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import readexcelpoi.Annotationspoi;

public class TC004_DeleteLead extends Annotationspoi {
	@BeforeTest
	 public void setValues()
	 {
		excelFName = "DeleteLead";
		 testcaseid = "TC004";
		 tescasedesc = "Delete a Lead";
		 category = "sanity";
		 author = "Pavi";
		 module = "Leads";
		 
	 }
	@Test(dataProvider="fetchdata")
	public void createLead(String PhCtryCd ,String PhAreaCd,String PhNum, String delLeadid)
	{
		new MyHomePageDeleteLead()
		.clickLeadsDel()
		.clickFindLeadsDel()
		.clickPhone()
		.EnterElePhCtryCode(PhCtryCd)
		.EnterPhAreaCd(PhAreaCd)
		.EnterPhNum(PhNum)
		.clicksrchDel()
		.clickFirstLeadDel()
		.clickDeleteLead()
		.clickverfyFindLeads()
		.EnterDelFindLeads(delLeadid)
		.clickVerfySubmit()
		.verifyDelRecord();
		}
}
