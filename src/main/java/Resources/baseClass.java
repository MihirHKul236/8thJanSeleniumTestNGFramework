package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseClass 
{
	  public static WebDriver driver;
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
      
      @BeforeTest
      public void ExtentReport()
      {
    	  extentManager.setup();
      }
      
      @AfterTest
      public void EndReport()
      {
    	  extentManager.endReport();
      }
      
      // To take screenshot and store in folder
      public static String screenShot(WebDriver driver,String filename)
      {
    	  String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    	  
    	  TakesScreenshot takesscreenshot=(TakesScreenshot) driver;
    	  File source=takesscreenshot.getScreenshotAs(OutputType.FILE);
    	  String Destination=System.getProperty("user.dir")+"\\ScreenShot\\" + filename + "_" + dateName + ".png";
    	  File finalDestination= new File(Destination);
    	  try
    	  {
    		  FileUtils.copyDirectory(source, finalDestination);
    	  }
    	  catch(Exception e)
    	  {
    		  e.getMessage();
    	  }
    	  return Destination;
      }
      
      @BeforeMethod
      public void urlLaunch() throws IOException, InterruptedException
      {
    	  Thread.sleep(2000);
    	  
    	  intializeBrowser();
    	  
    	  String URL =prop.getProperty("url");
    	  
    	  driver.get(URL);
    	  
      }
      
      @AfterMethod
      public void quitBrowser() throws InterruptedException
      {
    	  Thread.sleep(3000);
    	  driver.quit();
      }
      
}
