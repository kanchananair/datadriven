package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	ChromeDriver driver;
	String baseurl="https://www.ebay.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void ebayy()
	{
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		WebElement l=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		act.moveToElement(l).perform();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
		
		
	}
	
	
	

}
