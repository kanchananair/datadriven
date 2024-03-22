package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert2 {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void alertmsg()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		driver.switchTo().alert().accept();	
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick).perform();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
				
	}

}

