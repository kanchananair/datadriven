package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	ChromeDriver driver;
	String baseurl="https://www.amazon.in";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void amazonLogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc#@gmail.com");
	}
}
