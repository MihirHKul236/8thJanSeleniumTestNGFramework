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
import Resources.constant;

public class fillMyInfoTestCase extends baseClass
{
	
	 @Test
     public void fillMyInfo() throws IOException, InterruptedException, AWTException
     {
    	 
    	 loginPageObject lpo= new loginPageObject(driver);
    	 
    	 Thread.sleep(2000);
    	 lpo.enterUsername().sendKeys(constant.validusername);
    	 
    	 Thread.sleep(2000);
    	 lpo.enterPassword().sendKeys(constant.validpassword);
    	 
    	 Thread.sleep(3000);
    	 lpo.clickOnLoginButton().click();
    	 
    	 myInfoPageObject mipo = new myInfoPageObject(driver);
    	 
    	 Thread.sleep(2000);
    	 mipo.clickOnMyInfoTab().click();
    	 
    	 Thread.sleep(2000);
    	 mipo.enterFirstName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE)); 	 
    	 Thread.sleep(2000);
    	 mipo.enterFirstName().sendKeys(constant.firstname);
    	 
    	 Thread.sleep(2000);
    	 mipo.enterMiddleName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterMiddleName().sendKeys(constant.middlename);
    	 
    	 Thread.sleep(2000);
    	 mipo.enterLastName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterLastName().sendKeys(constant.lastname);
    	 
    	 Thread.sleep(2000);
    	 mipo.enterEmployeeId().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterEmployeeId().sendKeys(constant.employeeid);
    	 
    	 Thread.sleep(2000);
    	 mipo.enterOtherId().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterOtherId().sendKeys(constant.otherid);
    	 
    	 Thread.sleep(2000);
    	 mipo.enterDrivingLicenseNumber().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
    	 Thread.sleep(2000);
    	 mipo.enterDrivingLicenseNumber().sendKeys(constant.drivinglicensenumber);
    	 
    	 Thread.sleep(2000);
    	 mipo.clickOnNationalityDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 commonMethods.handleDropdown(mipo.selectCountryFromDropdown(), constant.nationdropdowntext);
    	
    	 
    	 Thread.sleep(2000);
    	 mipo.clickOnStatusDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 commonMethods.handleDropdown(mipo.selectStatusFromDropdown(), constant.statusdropdowntext);
    	
    	 
    	 Thread.sleep(3000);
    	 mipo.clickOnBloodGroupDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 commonMethods.handleDropdown(mipo.selectBloodGroupFromDropdown(), constant.bloodgroupdropdowntext);
    
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
    	//commonMethods.explictWait(driver, mipo.validationTextOnMyInfoPage(), 10);
    	commonMethods.handleAssertion(mipo.validationTextOnMyInfoPage().getText(),constant.myinfopagetext );
    	
     	 
    	 
     }
     
     public static void setClipboardData(String string) 
     {
    	   StringSelection stringSelection = new StringSelection(string);
    	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    	}
}
