package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	
		ChromeDriver driver;
		String baseurl="https://demo.guru99.com/test/drag_drop.html";
		
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
		public void dragandDropMethod()
		{
			WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
			
			
			
			WebElement ac1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
			WebElement ac2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
			WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
			WebElement ac3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
			WebElement amount2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement ac4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
			
			Actions act=new Actions(driver);
			act.dragAndDrop(bank, ac1);
			act.dragAndDrop(amount, ac2);
			act.dragAndDrop(sales, ac3);
			act.dragAndDrop(amount2, ac4);			
			act.perform();
		
			
			boolean perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
			if(perfect)
			{
				System.out.println("Perfect button is present");
			}
			else
			{
				System.out.println("Perfect button is not present");
			}
				
			
		}
		

}
