
	package junitpkg;

	import java.util.List;

	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Janasya {
		ChromeDriver driver;
		String baseurl="https://www.janasya.com";
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
		public void janasyaLogin()
		{
			List <WebElement> linklist =driver.findElements(By.tagName("a"));
			
			System.out.println(linklist.size());
			driver.findElement(By.xpath("//sticky-header/div/div/div/div/div[@id='HeaderNavigation']/nav/ul/li/a/span")).click();
			driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div/div/h3")).click();
			driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div/div[2]/div/ul/li/a/span")).click();
			
			
			WebElement search=driver.findElement(By.xpath("//form/div/input[@id='Search-In-Modal']"));
			search.sendKeys("Kurta Set",Keys.ENTER);
			//driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div/div/h3")).click();
			
			
			
			
			
			
			
			
			

		}

	}


