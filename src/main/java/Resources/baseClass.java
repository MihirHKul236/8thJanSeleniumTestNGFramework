package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class baseClass 
{
	  public WebDriver driver;
	  public Properties prop;
      public void intializeBrowser() throws IOException
      {
    	   FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
    	   
    	   prop = new Properties();
    	   
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
      
      @BeforeMethod
      public void urlLaunch() throws IOException, InterruptedException
      {
    	  Thread.sleep(2000);
    	  
    	  intializeBrowser();
    	  
    	  String URL =prop.getProperty("url");
    	  
    	  driver.get(URL);
    	  
      }
      
      @AfterClass
      public void quitBrowser() throws InterruptedException
      {
    	  Thread.sleep(3000);
    	  driver.quit();
      }
      
}
