package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import page.Fbsignup;

public class Signuptest extends Baseclass {
	

	@Test
	public void testSignup()
	
	{
		Fbsignup ob1=new Fbsignup(driver);
		ob1.createpg();
		
		String actualTitle=ob1.titleverification();
		Assert.assertEquals(actualTitle, "Facebook");
		ob1.signuppg();
		
	}

}


