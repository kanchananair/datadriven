package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();//To launch chrome browser,import library
		driver.get("https://www.google.com");//To load the URL,And enter complete web address
		String exp="Google";
		String actualtitle=driver.getTitle();
		if(exp.equals(actualtitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.quit();//entire browser close aavum
		driver.close();//per tab aayi close close cheyyaan
		

	}

}
