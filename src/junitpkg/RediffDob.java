package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDob {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void rediffDob()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("02");
		WebElement moonth=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthdetails=new Select(moonth);
		WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select yeardetails=new Select(year);
		
	}
	

}
