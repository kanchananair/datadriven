package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.FbLoginPage;
import page.Fbsignup;

public class FbLoginTest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testLogin()
	
	{
		FbLoginPage ob=new FbLoginPage(driver);
		ob.setValues("bv@gmail.com", "adadc");
		ob.login();
	}
	
}
