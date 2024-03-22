package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowHandles {
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void getPage()
	{
		driver.get("https://demo.guru99.com/popup.php");
		String basewindow=driver.getWindowHandle();
		System.out.println("Parent Window Title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindow=driver.getWindowHandles();
		
		for(String handle : allwindow)
		{
			if(!handle.equalsIgnoreCase(basewindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("h@gmail.com");
				//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
				
			}
			driver.switchTo().window(basewindow);
		}
		
		
	}

}
