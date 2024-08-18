package TestingTest_Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibraray_July.baseLibraray_July;
import TestingPage.CheckBox_Page;

public class CheckBox_Test extends baseLibraray_July
{
	 CheckBox_Page ob;
     @BeforeTest
     public void LaunchBrowser()
     {
    	 LaunchTestingbabaUrl("https://www.testingbaba.com/old/");
    	 ob= new CheckBox_Page();
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
     public void ClickonCheckbox()
     {
    	 ob.ClickonCheckBoxbtn();
     }
     @Test(priority = 4)
     public void getdetails()
     {
    	// ob.ClickonButtons();
     }
    @Test (priority = 5)
    public void readexceldata()
    {
    	ob.getReadExcelData();
    }
    @Test(priority =  6)
    public void getVerify()
    {
    	ob.verifydata();
    }
    
    
    
    
    
}
