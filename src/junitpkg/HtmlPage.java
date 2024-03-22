package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlPage {
	
	ChromeDriver driver;
	String baseurl="file:///C:/Users/lenovo/Desktop/alert_example.html";
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
		
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("Alert_Text="+alerttext);
		a.accept();
		//a.dismiss();//To cancel alert
		//oru windownn veroru window povaan switchTo();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("kanchana");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("s nair");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
		
		
	}
	

}
