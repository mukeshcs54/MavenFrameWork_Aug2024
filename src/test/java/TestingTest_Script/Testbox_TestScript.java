package TestingTest_Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibraray_July.baseLibraray_July;
import TestingPage.Textbox_page;

public class Testbox_TestScript extends baseLibraray_July
{  
	 Textbox_page ob;
	 @BeforeTest
     public void LaunchUrl()
     {
    	 LaunchTestingbabaUrl("https://www.testingbaba.com/old/");
    	 ob= new Textbox_page();
     }
	 @Test(priority = 0)
	 public void closedbtn()
	 {
		 ob.clickonclosed();
	 }
	 @Test(priority = 1)
	 public void practicebtn()
	 {
		 ob.clickonpractice();
	 }
	 @Test(priority = 2)
	 public void elementsbtn()
	 {
		 ob.clickonelements();
	 }
	 @Test(priority = 3)
	 public void textboxbtn()
	 {
		 ob.clickTextbox();
	 }
	 @Test(priority = 4)
	 public void getfilldetails()
	 {
		 ob.filldetails();
	 }
	 @Test(priority = 5)
	 public void getUIDetails()
	 {
		 ob.getTextDetails();
	 }
	 @Test(priority = 6)
	 public void getValidation()
	 {
		 ob.getVerify();
	 }
}
