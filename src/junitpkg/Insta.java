package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {

	
		
		ChromeDriver driver;
		String baseurl="https://www.instagram.com";
		
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test
		public void instaLogin() throws InterruptedException
		{
			Thread.sleep(1000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
			//driver.findElement(By.name("//input[@type='password']")).sendKeys("fsd");
			//driver.findElement(By.name("//button[@name='login']")).click();	
		
			
		}
		
		
		

	

}
