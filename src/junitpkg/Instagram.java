package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	ChromeDriver driver;
	String baseurl="https://www.instagram.com";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test()
	{
		driver.get(baseurl);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("books",Keys.ENTER);
		//search.submit();
	}
	}
