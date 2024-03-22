package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAllValidation2 {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkValidation()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total link count "+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
	}
	private void verify(String link) {
		try {
			
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Response code is Succesful");
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Response code is Succesful");
			}
			else
			{
				System.out.println("Not Expected");
			}
	
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}
}
