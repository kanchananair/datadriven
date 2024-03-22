package junitpkg;



	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class RediffButton {
		
			
		ChromeDriver driver;
		String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test
		public void Log()
		{
			boolean l=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).isSelected();
			if(l)
			{
				System.out.println("selected");
			}
			else
			{
				System.out.println(" not selected");
			}
			
		}

	}


