package testngpkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentedReports {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void beftest()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("fubctional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Hostname", "localhost");
		extent.setSystemInfo("OS", "windows11");
		extent.setSystemInfo("Testername", "kanchana");
		extent.setSystemInfo("Browser Name", "chrome");
		driver=new ChromeDriver();
		
		
	}
	@BeforeTest
	public void setUp()
	{
		driver.get(baseurl);
	}
	@Test
	public void fbTitleVerifiication()
	{
		test=extent.createTest("Fbtitleverifiication");
		String exp="Facebook – log in or sign up";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, exp);
		
		System.out.println("test1");
		
	}
	@AfterTest
	public void tearDown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void broswerclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			
		}else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "test case passed is"+result.getName());
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
