package TestingTest_Script;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibraray_July.baseLibraray_July;
import TestingPage.RadioButton_page;

public class RadioButton_TestScript extends baseLibraray_July
{
  
	RadioButton_page ob;
	@BeforeTest
	public void LaunchBrowser()
	{
		LaunchTestingbabaUrl("https://www.testingbaba.com/old/");
		ob= new RadioButton_page();
	}
	   @Test(priority = 0)
	    public void ClickonClosed()
	    {
	    	ob.Clickonclosedbtn();
	    }
	    @Test(priority = 1)
	    public void ClickonPractice()
	    {
	    	ob.ClickonPracticebtn();
	    }
	     @Test(priority = 2)
	     public void ClickonElements()
	     {
	    	 ob.ClickonElementbtn();
	     }
	  @Test(priority = 3)
	  public void ClickonRadioButtons()
	  {
		  ob.clickonRadiobutton();
	  }
	 @Test(priority = 4)
	 public void ClickOnbutton()
	 {
		// ob.ClickActionOnButton();
		 ob.getdetailsexcel();
		 
	 }
	 @Test(priority = 5)
	 public void getVerifyRadiobutton()
	 {
		 ob.VerifyRadiobutton();
	 }
	 
}
