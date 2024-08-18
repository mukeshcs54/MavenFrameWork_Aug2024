package TestingTest_Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibraray_July.baseLibraray_July;
import TestingPage.Buttons_PageScript;

public class Button_TestScript extends baseLibraray_July
{
	Buttons_PageScript ob;
	@BeforeTest
	public void Launch_Browser()
	{
		LaunchTestingbabaUrl("https://www.testingbaba.com/old/");
		ob= new Buttons_PageScript();
	}
	
	@Test(priority = 0)
	public void ClickClosedbtn()
	{
		ob.clickonclosed();
	}

	@Test(priority = 1)
	public void ClickPracticebtn()
	{
		ob.clickonpractice();
	}

	@Test(priority = 2)
	public void ClickElementbtn()
	{
		ob.clickonelements();
	}
	@Test(priority = 3)
	public void ClickOnButton()
	{
		ob.ClickOnButtons();
	}
	
	@Test(priority = 4)
	public void Buttons()
	{
		ob.getClickButtons();
	}
	
}
