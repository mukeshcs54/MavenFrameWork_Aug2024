package TestingTest_Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibraray_July.baseLibraray_July;
import TestingPage.Login_pageScript;

public class Login_TestScript extends baseLibraray_July
{
	Login_pageScript ob;
	@BeforeTest
	public void getLaunchBrowserTest()
	{
		LaunchTestingbabaUrl("https://www.testingbaba.com/old/");
		ob= new Login_pageScript();
		
	}
	@Test(priority = 0)
	public void getTitleURL()
	
	{
		ob.getTitle();
	}
	
	@Test(priority = 1)
	public void VeriryURL()
	{
		ob.verifyUrl();
	}
}
