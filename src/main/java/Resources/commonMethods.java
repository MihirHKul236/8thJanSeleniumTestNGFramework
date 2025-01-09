package Resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods 
{
    public static void handleAssertion(String actual, String expected) throws InterruptedException
    {
    	 SoftAssert sa = new SoftAssert();
    	 String Actual_text=actual;
    	 String Expected_text=expected;
    	 
    	 Thread.sleep(3000);
    	 sa.assertEquals(Actual_text, Expected_text);
    	 sa.assertAll();
    }
    
    public static void handleDropdown(List<WebElement> xpath, String text) throws InterruptedException
    {
    	List<WebElement> country= xpath;
   	    int Size= country.size();
   	    for(int i=0;i<Size;i++)
   	    {
   		   if(country.get(i).getText().equalsIgnoreCase(text))
   		   {
   			   Thread.sleep(3000);
   			   country.get(i).click();
   			    break;
   		   }
   	    }
    }
    
   public static void explictWait(WebDriver driver,WebElement xpath , int timeout)
   {
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	   wait.until(ExpectedConditions.visibilityOf(xpath));
   }
}
