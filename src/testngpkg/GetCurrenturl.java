package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetCurrenturl {
	ChromeDriver driver;
	String baseurl="https://www.automationexercise.com/";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void geturl() 
	{
		//driver.getCurrentUrl();
		driver.get(baseurl);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		driver.getCurrentUrl();
		String expected="https://www.automationexercise.com";
		if()
	}
		

}
