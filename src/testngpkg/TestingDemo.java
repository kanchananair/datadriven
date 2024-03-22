package testngpkg;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingDemo {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlLoading()
	{
		driver.get(baseurl);
	}
	
	@Test(priority=2,groups={"sanity"})
	public void titleVerification()
	{
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Rediff mail";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Title matching");
		}
		else
		{
			System.out.println("Title does not matching");
		}
		
		
	}
	@Test(enabled=true,priority=1,groups = {"smoke"})
	public void enableAc()
	{
		boolean e=driver.findElement(By.xpath("//input[@id='Register']")).isEnabled();
		if(e)
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is not enabled");
		}
	}
	@Test(priority=3,groups = {"regression"})
	public void logoVerification()
	{
		boolean logo=driver.findElement(By.xpath("//div[@id='wrapper']/table/tbody/tr/td/img")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
		
	}
	@Test(priority=4)
	public void contentVerification()
	{
		String s=driver.getPageSource();
		
		if(s.contains("Create a Rediffmail account"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
	}
	@Test(priority=5,groups =  {"sanity"})
	public void buttonTextVerification()
	{
		String buttontext= driver.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
		if(buttontext.equals("Create my account >>"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	
	
	
 
}
