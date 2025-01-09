package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.loginPageObject;
import Resources.baseClass;

public class loginTestCases extends baseClass
{
	  @Test(priority=0)
      public void verifyValidLogin() throws IOException, InterruptedException
      {
    	 intializeBrowser();
    	 
    	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	 
    	 loginPageObject lpo= new loginPageObject(driver);
    	 
    	 Thread.sleep(2000);
    	 lpo.enterUsername().sendKeys("Admin");
    	 
    	 Thread.sleep(2000);
    	 lpo.enterPassword().sendKeys("admin123");
    	 
    	 Thread.sleep(2000);
    	 lpo.clickOnLoginButton().click();
    	 
    	 Thread.sleep(3000);
    	 SoftAssert sa = new SoftAssert();
    	 String Actual_text=lpo.validationTextAfterLogin().getText();
    	 String Expected_text="Dashboard";
    	 
    	 Thread.sleep(3000);
    	 sa.assertEquals(Actual_text, Expected_text);
    	 sa.assertAll();
      }
	  
	  @Test(priority=1)
	  public void verifyInvalidLogin() throws IOException, InterruptedException
	  {
		    intializeBrowser();
	    	 
	    	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	 
	    	 loginPageObject lpo= new loginPageObject(driver);
	    	 
	    	 Thread.sleep(2000);
	    	 lpo.enterUsername().sendKeys("Admin");
	    	 
	    	 Thread.sleep(2000);
	    	 lpo.enterPassword().sendKeys("admin1555");
	    	 
	    	 Thread.sleep(2000);
	    	 lpo.clickOnLoginButton().click();
	    	 
	    	 Thread.sleep(3000);
	    	 SoftAssert sa= new SoftAssert();
	    	 String Actual_text=lpo.invalidTextAfterLogin().getText();
	    	 String Expected_text="Invalid credentials";
	    	 
	    	 Thread.sleep(3000);
	    	 sa.assertEquals(Actual_text,Expected_text);
	    	 sa.assertAll();
	  }
}
