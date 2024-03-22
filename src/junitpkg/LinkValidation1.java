package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class LinkValidation1 {
	String link="https://www.google.com";
	
	@Test
	public void test()
	{
		try {
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			System.out.println(code);
			if(code==200)
			{
				System.out.println("Response code is "+code);
			}
			else
			{
				System.out.println("Not the expected result");
			}
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
