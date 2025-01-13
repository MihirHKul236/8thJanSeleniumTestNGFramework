package Resources;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listener extends extentManager implements ITestListener
{
    public void onTestStart(ITestResult result)
    {
    	test=extent.createTest(result.getName());
    }
    
    public void onTestSuccess(ITestResult result)
    {
    	if(result.getStatus()==ITestResult.SUCCESS)
    	{
    		test.log(Status.PASS, "Test Case Passed is " +result.getName());
    	}
    }
    
    public void onTestSkip(ITestResult result)
    {
    	if(result.getStatus()==ITestResult.SKIP)
    	{
    		test.log(Status.SKIP, "Test Case Skipped is" +result.getName());
    	}
    }
    
    
    public void onTestFailure(ITestResult result)
    {
    	if(result.getStatus()==ITestResult.FAILURE)
    	{
    		test.log(Status.FAIL,"Test Case Failed is" +result.getName());
    		test.log(Status.FAIL,"Test Case Failed is" +result.getThrowable());
    		
    		String screenshotPath=baseClass.screenShot(baseClass.driver, result.getName());
    		
    		test.addScreenCaptureFromBase64String(screenshotPath);
    	}
    }
}
