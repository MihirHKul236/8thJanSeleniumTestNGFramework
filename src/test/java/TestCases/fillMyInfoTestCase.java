package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.loginPageObject;
import PageObjectModel.myInfoPageObject;
import Resources.baseClass;
import Resources.commonMethods;

public class fillMyInfoTestCase extends baseClass
{
	
	 @Test
     public void fillMyInfo() throws IOException, InterruptedException, AWTException
     {
          intializeBrowser();
    	 
    	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	 
    	 loginPageObject lpo= new loginPageObject(driver);
    	 
    	 Thread.sleep(2000);
    	 lpo.enterUsername().sendKeys("Admin");
    	 
    	 Thread.sleep(2000);
    	 lpo.enterPassword().sendKeys("admin123");
    	 
    	 Thread.sleep(3000);
    	 lpo.clickOnLoginButton().click();
    	 
    	 myInfoPageObject mipo = new myInfoPageObject(driver);
    	 
    	 Thread.sleep(2000);
    	 mipo.clickOnMyInfoTab().click();
    	 
    	 Thread.sleep(2000);
    	 mipo.enterFirstName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE)); 	 
    	 Thread.sleep(2000);
    	 mipo.enterFirstName().sendKeys("Sachin");
    	 
    	 Thread.sleep(2000);
    	 mipo.enterMiddleName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterMiddleName().sendKeys("Ramesh");
    	 
    	 Thread.sleep(2000);
    	 mipo.enterLastName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterLastName().sendKeys("Tendulkar");
    	 
    	 Thread.sleep(2000);
    	 mipo.enterEmployeeId().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterEmployeeId().sendKeys("Virtusa203");
    	 
    	 Thread.sleep(2000);
    	 mipo.enterOtherId().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterOtherId().sendKeys("SRT234");
    	 
    	 Thread.sleep(2000);
    	 mipo.enterDrivingLicenseNumber().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterDrivingLicenseNumber().sendKeys("MH15DK2345");
    	 
    	 Thread.sleep(2000);
    	 mipo.clickOnNationalityDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 commonMethods.handleDropdown(mipo.selectCountryFromDropdown(), "Indian");
    	
    	 
    	 Thread.sleep(2000);
    	 mipo.clickOnStatusDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 commonMethods.handleDropdown(mipo.selectStatusFromDropdown(), "Married");
    	
    	 
    	 Thread.sleep(3000);
    	 mipo.clickOnBloodGroupDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 commonMethods.handleDropdown(mipo.selectBloodGroupFromDropdown(), "B-");
    
    	 Thread.sleep(3000);
    	 mipo.clickOnAddButton().click();
    	 
    	 Thread.sleep(3000);
    	 mipo.clickOnBrowseButton().click();
    	 
    	 Thread.sleep(3000);
    	setClipboardData("C:\\Users\\hp\\Downloads\\Eclips IDE logo.jpg"); 	
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
    	Thread.sleep(3000);
    	commonMethods.handleAssertion(mipo.validationTextOnMyInfoPage().getText(), "PIM");
    	
     	 
    	 
     }
     
     public static void setClipboardData(String string) 
     {
    	   StringSelection stringSelection = new StringSelection(string);
    	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    	}
}
