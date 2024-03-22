package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbsignup {
	WebDriver driver;

	By fbcreatepage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fbsignup(WebDriver driver) {
		this.driver=driver;
	}
	public void createpg()
	{
		driver.findElement(fbcreatepage).click();
		
	}
	
	public String titleverification()
	{
		String title=driver.getTitle();
		return title;
		
		
	}
	public void signuppg()
	{
		driver.findElement(fbsignup).click();
	}
	
}
