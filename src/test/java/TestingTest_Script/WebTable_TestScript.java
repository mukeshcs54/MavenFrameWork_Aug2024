package TestingTest_Script;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibraray_July.baseLibraray_July;
import TestingPage.WebTable_Page;

public class WebTable_TestScript extends baseLibraray_July
{
	WebTable_Page ob;
	@BeforeTest
	public void LaunchBrowser()
	{
		LaunchTestingbabaUrl("https://www.testingbaba.com/old/");
		ob= new WebTable_Page();
		
	}
	@Test(priority = 0)
	public void Clickonclosed()
	{
		ob.Clickonclosed();
	}
	@Test(priority = 1)
	public void ClickonPractice()
	{
		ob.ClickonPractice();
	}
	@Test(priority = 2)
	public void Clickonelement()
	{
		ob.ClickonElements();
	}
	@Test(priority = 3)
	public void ClickonWebtable()
	{
		ob.ClickonWebTable();
	}
	@Test(priority = 4)
	public void ClickongetDetails()
	{
		ob.getDetailsExcel();
	}
	@Test(priority = 5)
	public void ClickOngetUIData()
	{
		ob.getUIdata();
	}
	@Test(priority = 6)
	public void validationUIdata()
	{
		//ob.getVerifydata();
	}
	
	
	
	
}
