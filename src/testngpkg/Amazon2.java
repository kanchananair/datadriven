package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon2 {

	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void amazonIn() throws InterruptedException
	{
		driver.get("https://www.amazon.in");
		String basewindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		String actualTitle=driver.getTitle();
		String expectedTitle="Amazon.in : mobilephones";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Title matches");
			
		}
		else
		{
			System.out.println("Title does not matching");
		}
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> allwindow=driver.getWindowHandles();
		for(String handle : allwindow)
		{
			if(!handle.equalsIgnoreCase(basewindow))
			{
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				
				driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();				
			}
		}		
	}
}
