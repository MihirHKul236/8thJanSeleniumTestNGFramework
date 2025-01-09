package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject 
{
    public WebDriver driver;
    
    private By username= By.xpath("//input[@name='username']");
    
    private By password= By.xpath("//input[@name='password']");
    
    private By loginbutton= By.xpath("//button[@type='submit']");
    
    private By validlogintext= By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
    
    private By invalidlogintext= By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
    
    public loginPageObject(WebDriver driver2)
    {
		this.driver=driver2;
	}

	public WebElement enterUsername()
    {
    	return driver.findElement(username);
    }
    
    public WebElement enterPassword()
    {
    	return driver.findElement(password);
    }
    
    public WebElement clickOnLoginButton()
    {
    	return driver.findElement(loginbutton);
    }
    
    public WebElement validationTextAfterLogin()
    {
    	return driver.findElement(validlogintext);
    }
    
    public WebElement invalidTextAfterLogin()
    {
    	return driver.findElement(invalidlogintext);
    }
}
