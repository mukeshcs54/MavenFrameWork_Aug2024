package TestingTest_Script;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibraray_July.baseLibraray_July;
import TestingPage.Links_PageScript;

public class Link_TestScript extends baseLibraray_July
{
	Links_PageScript ob;
	@BeforeTest
	public void Launch_Browser()
	{
		LaunchTestingbabaUrl(getReaddata("url"));
		ob= new Links_PageScript();
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
	 public void Linksbtn()
	 {
		 ob.ClickonLinks();
	 }
	 @Test(priority = 4)
	 public void ClickDemoPage()
	 {
		 ob.ClickonDemoPage();
	 }
	 @Test(priority = 5)
	 public void ClickOnCreatedbtn()
	 {
		 ob.ClickOnCreated();
	 }
	 @Test(priority = 6)
	 public void ClickOnNoContent()
	 {
		 ob.ClickOnNoContent();
	 }
	 @Test(priority = 7)
	 public void ClickOnMovedbtn()
	 {
		 ob.ClickOnMovedbtn();
	 }
	 @Test(priority = 8)
	 public void ClickOnBadrequest()
	 {
		 ob.ClickOnBadRequest();;
	 }
	 @Test(priority = 9)
	 public void ClickOnUnauthorizedbtn()
	 {
		 ob.ClickOnUnauthorized();
	 }
	 @Test(priority = 10)
	 public void ClickOnNoForbiddenbtn()
	 {
		 ob.ClickOnForbidden();
	 }
	 @Test(priority = 11)
	 public void ClickOnNotFoundbtn()
	 {
		 ob.ClickOnNotFound();
	 }
	 
}
