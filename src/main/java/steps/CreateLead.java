package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public ChromeDriver driver;
	@Given("open the browser")
 public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","D:\\Testleaf\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
    @And("maximize the window")
	 public void windowMaximize(){
			driver.manage().window().maximize();
    }
    
    @And("launch the url")
  	 public void launchUrl(){
    	 driver.get("http://leaftaps.com/opentaps");
      }
    
   

    @And("set the timeout")
  	 public void timeOut(){
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      }
    
    @And("Enter the username as (.*)")
 	 public void enterUsername(String uName){
    	driver.findElementById("username").sendKeys(uName);
     }
   
    @And("Enter the password as (.*)")
	 public void enterPassword(String pwd){
   	driver.findElementById("password").sendKeys(pwd);
    }
  
    @And("click the login")
  	 public void clickLogin(){
    	driver.findElementByClassName("decorativeSubmit").click();
      }
    @And("login failed")
 	 public void loginFailed(){
   	System.out.println("Login failed");
     }
    @And("click the crmsfa")
 	 public void clickCrmsfa(){
    	driver.findElementByLinkText("CRM/SFA").click();
     } 
    @And("click the Leads")
 	 public void clickLeads(){
    	driver.findElementByLinkText("Leads").click();
     } 
    @And("click on Find leads button")
	 public void clickFindLead(){
   	driver.findElementByLinkText("Find Leads").click();
    } 
      
//    @And("Enter the companyname as (.*)")
//	 public void enterCompanyname(String cName){
//   	driver.findElementById("createLeadForm_companyName").sendKeys(cName);
//    }
  
    @And("Enter the firstname as (.*)")
	 public void enterFirstname(String firstName){
  	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(firstName);
   }
//    @And("Enter the lastname as (.*)")
//	 public void enterLastname(String lName){
//  	driver.findElementById("createLeadForm_lastName").sendKeys(lName);
//  }
    @And("click on findLeads button")
	 public void clickFindLeadButton(){
  	driver.findElementByXPath("//button[text()='Find Leads']").click();
   } 
    @And("click the first resulting id")
  	 public void clickFirstLeadButton(){
    	driver.findElementByXPath("//a[text()='lakshmi'][1]").click();
     } 
    
    @And("click on edit button")
	 public void clickEditButton(){
 	driver.findElementByXPath("//a[@class='subMenuButton' and text()='Edit']").click();
  } 
    @And("change the Salutation as (.*)")
	 public void enterSalutationname(String salutationName){
 	driver.findElementById("updateLeadForm_personalTitle").sendKeys(salutationName);
  }
    @When("click on update button")
    public void clickupdateButton(){
    	driver.findElementByXPath("//input[@type='submit' and @name='submitButton'and @value='Update']").click();
     } 
   
    
    @Then("verify the Salution")
    public void verifysalutation() {
    	System.out.println("Salutation has been changed");
 }


}
