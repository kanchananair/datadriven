package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationExcersice {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void automation()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("kanchana");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("atdfg@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		WebElement title=driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		WebElement title1=driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		title1.click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc1234");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		Select day=new Select (driver.findElement(By.xpath("//*[@id=\"days\"]")));
		day.selectByValue("18");
		Select month=new Select (driver.findElement(By.xpath("//*[@id=\"months\"]")));
		month.selectByValue("5");
		Select year=new Select (driver.findElement(By.xpath("//*[@id=\"years\"]")));
		year.selectByValue("2001");

		
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Kanchana");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("S Nair");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Luminar");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Kottayam,Kerala");
		js.executeScript("window.scrollBy(250,750)");
		
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Luminar Technolab Cochin");
		
		
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Kottayam,Pala");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("649839");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("6484983984");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		
	}

}
