package TestingPage;


import org.testng.Assert;

import BaseLibraray_July.baseLibraray_July;

public class Login_pageScript extends baseLibraray_July
{
	
	public void getTitle()
	{
       String title=driver.getTitle();
		
		System.out.println(title);
	}
	
	 public void verifyUrl() 
	 {
		 String actualUrl="https://www.testingbaba.com/old/";
		 String expectedURl=driver.getCurrentUrl();
		 Assert.assertEquals(actualUrl, expectedURl);
	 }
}
