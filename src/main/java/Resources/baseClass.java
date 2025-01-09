package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass 
{
	  public WebDriver driver;
      public void intializeBrowser() throws IOException
      {
    	   FileInputStream fis = new FileInputStream("E:\\SeleniumTestNGFrameworkProject\\Selenium8thJanTestNGProject\\src\\main\\java\\Resources\\data.properties");
    	   
    	   Properties prop = new Properties();
    	   
    	   prop.load(fis);
    	   
    	   String browserName= prop.getProperty("browser");
    	   
    	   if(browserName.equalsIgnoreCase("chrome"))
    	   {
    		    driver = new ChromeDriver();
    		    driver.manage().window().maximize();
    		    		
    	   }
    	   
    	   else if(browserName.equalsIgnoreCase("firefox"))
    	   {
    		   driver = new FirefoxDriver();
    		   driver.manage().window().maximize();
    	   }
    	   
    	   else if(browserName.equalsIgnoreCase("edge"))
    	   {
    		   driver = new EdgeDriver();
    		   driver.manage().window().maximize();
    	   }
    	   
    	   else
    	   {
    		   System.out.println("Please select the correcr browser");
    	   }
    	   
    	   
    	   
      }
}
