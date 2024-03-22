package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Fb{
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void fbLogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc#@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fsd");
		driver.findElement(By.xpath("//button[@name='login']")).click();	
		

	}
}
