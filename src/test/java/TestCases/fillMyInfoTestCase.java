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
    	 List<WebElement> country= mipo.selectCountryFromDropdown();
    	 int Size= country.size();
    	 for(int i=0;i<Size;i++)
    	 {
    		 if(country.get(i).getText().equalsIgnoreCase("Indian"))
    		 {
    			 Thread.sleep(3000);
    			 country.get(i).click();
    			 break;
    		 }
    	 }
    	 
    	 Thread.sleep(2000);
    	 mipo.clickOnStatusDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 List<WebElement> status= mipo.selectStatusFromDropdown();
    	 int Size1= status.size();
    	 for(int i=0;i<Size1;i++)
    	 {
    		 if(status.get(i).getText().equalsIgnoreCase("Married"))
    		 {
    			 Thread.sleep(3000);
    			 status.get(i).click();
    			 break;
    		 }
    	 }
    	 
    	 Thread.sleep(3000);
    	 mipo.clickOnBloodGroupDropdown().click();
    	 
    	 Thread.sleep(2000);
    	 List<WebElement> bloodgroup= mipo.selectBloodGroupFromDropdown();
    	 int Size2= bloodgroup.size();
    	 for(int i=0;i<Size2;i++)
    	 {
    		 if(bloodgroup.get(i).getText().equalsIgnoreCase("B-"))
    		 {
    			 Thread.sleep(3000);
    			 bloodgroup.get(i).click();
    			 break;
    		 }
    	 }
    	 
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
    	SoftAssert sa= new SoftAssert();
    	String Actual_text= mipo.validationTextOnMyInfoPage().getText();
    	String Expected_text="PIM";
    	
    	Thread.sleep(3000);
    	sa.assertEquals(Actual_text,Expected_text);
    	sa.assertAll();
     	 
    	 
     }
     
     public static void setClipboardData(String string) 
     {
    	   StringSelection stringSelection = new StringSelection(string);
    	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    	}
}
