package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fileUploadspgm(String p)
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileUpload("C:\\Kanchana\\AI.docx");
	}
	
		
	

	
	

}
