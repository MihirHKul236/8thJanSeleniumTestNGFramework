package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.loginPageObject;
import Resources.baseClass;
import Resources.commonMethods;

public class loginTestCases extends baseClass
{
	  @Test(priority=0)
      public void verifyValidLogin() throws IOException, InterruptedException
      {	 
    	 loginPageObject lpo= new loginPageObject(driver);
    	 
    	 Thread.sleep(2000);
    	 lpo.enterUsername().sendKeys("Admin");
    	 
    	 Thread.sleep(2000);
    	 lpo.enterPassword().sendKeys("admin123");
    	 
    	 Thread.sleep(2000);
    	 lpo.clickOnLoginButton().click();
    	 
    	 Thread.sleep(3000);
    	 commonMethods.handleAssertion(lpo.validationTextAfterLogin().getText(), "Dashboard");
    	
      }
	  
	  @Test(priority=1)
	  public void verifyInvalidLogin() throws IOException, InterruptedException
	  {
		  
	    	 loginPageObject lpo= new loginPageObject(driver);
	    	 
	    	 Thread.sleep(2000);
	    	 lpo.enterUsername().sendKeys("Admin");
	    	 
	    	 Thread.sleep(2000);
	    	 lpo.enterPassword().sendKeys("admin1555");
	    	 
	    	 Thread.sleep(2000);
	    	 lpo.clickOnLoginButton().click();
	    	 
	    	 Thread.sleep(3000);
	    	 commonMethods.handleAssertion(lpo.invalidTextAfterLogin().getText(), "Invalid credentials");
	    	 
	  }
}
