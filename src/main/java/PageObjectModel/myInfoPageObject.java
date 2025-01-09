package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObject 
{
     public WebDriver driver;
     
     private By myinfotab= By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]");
     
     private By firstname= By.xpath("//input[@name='firstName']");
     
     private By middlename= By.xpath("//input[@name='middleName']");
     
     private By lastname= By.xpath("//input[@name='lastName']");
     
     private By employeeid= By.xpath("(//input[@data-v-1f99f73c=''])[5]");
     
     private By otherid=By.xpath("(//input[@data-v-1f99f73c=''])[6]");
     
     private By drivinglicensenumber= By.xpath("(//input[@data-v-1f99f73c=''])[7]");
     
     private By nationalitydropdown= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
     
     private By countryselection=By.xpath("//div[@class='oxd-select-option']");
     
     private By statusdropdown= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
     
     private By statusselection= By.xpath("//div[@class='oxd-select-option']");
     
     private By bloodgroupdropdown= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
     
     private By bloodgroupselection = By.xpath("//div[@class='oxd-select-option']");
     
     private By textonmyinfopage= By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
     
     private By addbutton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']");
     
     private By browsebutton = By.xpath("//div[@class='oxd-file-button']");
    		 
     public myInfoPageObject(WebDriver driver3)
     {
		this.driver=driver3;
     }
 
	public WebElement clickOnMyInfoTab()
     {
    	 return driver.findElement(myinfotab);
     }
     
     public WebElement enterFirstName()
     {
    	 return driver.findElement(firstname);
     }
     
     public WebElement enterMiddleName()
     {
    	 return driver.findElement(middlename);
     }
     
     public WebElement enterLastName()
     {
    	 return driver.findElement(lastname);
     }
    
     
     public WebElement enterEmployeeId()
     {
    	 return driver.findElement(employeeid);
     }
     
     public WebElement enterOtherId()
     {
    	 return driver.findElement(otherid);
     }
     
     public WebElement enterDrivingLicenseNumber()
     {
    	 return driver.findElement(drivinglicensenumber);
     }
     
     public WebElement clickOnNationalityDropdown()
     {
    	 return driver.findElement(nationalitydropdown);
     }
     
     public List<WebElement> selectCountryFromDropdown()
     {
    	 return driver.findElements(countryselection);
     }
     
     public WebElement clickOnStatusDropdown()
     {
    	 return driver.findElement(statusdropdown);
     }
     
     public List<WebElement> selectStatusFromDropdown()
     {
    	 return driver.findElements(statusselection);
     }
     
     public WebElement clickOnBloodGroupDropdown()
     {
    	 return driver.findElement(bloodgroupdropdown);
     }
     
     public List<WebElement> selectBloodGroupFromDropdown()
     {
    	 return driver.findElements(bloodgroupselection);
     }
     
     public WebElement validationTextOnMyInfoPage()
     {
    	 return driver.findElement(textonmyinfopage);
     }
     
     public WebElement clickOnAddButton()
     {
    	 return driver.findElement(addbutton);
     }
     
    public WebElement clickOnBrowseButton()
    {
    	return driver.findElement(browsebutton);
    }
     
}
