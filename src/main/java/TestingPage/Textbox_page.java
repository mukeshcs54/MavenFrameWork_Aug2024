package TestingPage;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BaseLibraray_July.baseLibraray_July;

public class Textbox_page extends baseLibraray_July
{
	String path="C:\\Users\\dell\\eclipse-workspace\\Maven_Project_Testing_Mukesh_04July_2024\\testData\\NewExceldata.xlsx";
      public Textbox_page()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      @FindBy(xpath = "//*[text()='×']")
      private WebElement closedbtn;
      
      @FindBy(xpath = "//*[text()='Practice']")
      private WebElement practicebtn;
      @FindBy(xpath = "//button[@data-target=\"#elements\"]")
      private WebElement elementsbtn;
      
      @FindBy(xpath = "//a[text()='text box']")
      private WebElement textboxbtn;
      
      @FindBy(xpath = "//*[@id=\"fullname1\"]")
      private WebElement fullname;
      @FindBy(xpath = "//*[@id=\"fullemail1\"]")
      private WebElement email;
      
      @FindBy(xpath = "//*[@id=\"fulladdresh1\"]")
      private WebElement C_address;
      
      @FindBy(xpath = "//*[@id=\"paddresh1\"]")
      private WebElement p_address;
      
      @FindBy(xpath = "//*[@value=\"Submit\"]")
      private WebElement submittbtn;
      
      public void clickonclosed() 
      {
    	  closedbtn.click();
      }
      public void clickonpractice()
      {
    	  practicebtn.click();
      }
      public void clickonelements()
      {
    	  elementsbtn.click();
      }
      public void clickTextbox()
      {
    	  textboxbtn.click();
      }
      public void filldetails()
      {
    	  fullname.sendKeys(excelReaddata(path, 0, 1, 0));
    	  email.sendKeys(excelReaddata(path, 0, 1, 1));
    	  C_address.sendKeys(excelReaddata(path, 0, 1, 2));
    	  p_address.sendKeys(excelReaddata(path, 0, 1, 3));
    	  submittbtn.click();
      }
      public void getTextDetails()
      {
    	 List<WebElement> datalist=driver.findElements(By.xpath("//*[@class=\"col-md-6 mt-5\"]/label"));
    	  for(int i=1;i<=datalist.size()-1;i=i+2)
    	  {
    		  String UIdata=datalist.get(i).getText();
    		  System.out.println(UIdata);
    	  }
    		 
      }
      public void getVerify()	
   	{
  		 SoftAssert sf= new SoftAssert();
          
          ArrayList<String> actual=new  ArrayList<String>();
          actual.add(excelReaddata(path, 0, 1, 0));
          actual.add(excelReaddata(path, 0, 1, 1));
          actual.add(excelReaddata(path, 0, 1, 2));
          actual.add(excelReaddata(path, 0, 1, 3));
          ArrayList<String> expected= new ArrayList<String>();
         List<WebElement> datalist=driver.findElements(By.xpath("//*[@class=\"col-md-6 mt-5\"]/label"));
         for(int i=1;i<=datalist.size()-1;i=i+2)
   	     {
   		 
        	 expected.add(datalist.get(i).getText());
   		      
   	     }
         for(int j=0;j<=actual.size()-1;j++)
         {
        	String act=actual.get(j);
        	 String exp=expected.get(j);
        //	 Assert.assertEquals(act, exp);  //hard assert
        	 sf.assertEquals(act, exp);
        	 
         }
   		 sf.assertAll();
    	  
  	}
      
      
}

