package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentManager 
{
     public static ExtentSparkReporter htmlreoprter;
     public static ExtentReports extent;
     public static ExtentTest test;
     
     
     public static void setup()
     {
    	 ExtentSparkReporter htmlreporter= new ExtentSparkReporter(System.getProperty("user.dir")+ "/test-output/myReport.html");
    	 htmlreporter.config().setDocumentTitle("Automation Report");
    	 htmlreporter.config().setReportName("Functional Report");
    	 htmlreporter.config().setTheme(Theme.DARK);
    	 
    	 
    	 extent= new ExtentReports();
    	 extent.attachReporter(htmlreporter);
    	 extent.setSystemInfo("Hostname", "LocalHost");
    	 extent.setSystemInfo("OS", "Windows11");
    	 extent.setSystemInfo("Browser", "Chrome");
    	 extent.setSystemInfo("Testername", "Mihir");
    	 
     }
     
     
     public static void endReport()
     {
    	 extent.flush();
     }
}
