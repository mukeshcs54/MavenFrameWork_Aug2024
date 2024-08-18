package TestingPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseLibraray_July.baseLibraray_July;

public class WebTable_Page extends baseLibraray_July
{
	String path="C:\\Users\\dell\\eclipse-workspace\\Maven_Project_Testing_Mukesh_04July_2024\\testData\\NewExceldata.xlsx";
     public WebTable_Page()
     {
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath = "//*[text()='×']")
     private WebElement closedbtn;
     
     @FindBy(xpath = "//*[text()='Practice']")
     private WebElement practicebtn;
     @FindBy(xpath = "//button[@data-target=\"#elements\"]")
     private WebElement elementsbtn;
     
     @FindBy(xpath = "//a[text()='web tables']")
     private WebElement webtablebtn;
     
     
     @FindBy(xpath = "//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
     private WebElement name;
     @FindBy(xpath = "//input[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")
     private WebElement email;
     @FindBy(xpath ="//button[text()='Save']")
     private WebElement savebtn;
     
     @FindBy(xpath = "//*[@id=\"tab_4\"]/div/iframe")
     private WebElement iframeloc;
     
     @FindBy(xpath ="//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[1]" )
     private List<WebElement> ColumName;
     @FindBy(xpath = "//*[@class=\"table table-bordered data-table\"]/thead/following::tbody/tr/td[2]")
     private List<WebElement> ColumEmail;
     
     public void Clickonclosed()
     {
    	 closedbtn.click();
     }
     public void ClickonPractice()
     {
    	 practicebtn.click();
     }
     public void ClickonElements()
     {
    	 elementsbtn.click();
     }
     public void ClickonWebTable()
     {
    	 webtablebtn.click();
     }
     public void getDetailsExcel()
     {
    	    driver.switchTo().frame(iframeloc);
    	    
    	    for(int i=1;i<=9;i++)
    	    {
    	    	name.sendKeys(excelReaddata(path, 3, i, 0));
    	    	email.sendKeys(excelReaddata(path, 3, i, 1));
    	    	savebtn.click();
    	    }
    	    
     }
     public void getUIdata()
     {
    	 for(WebElement col1: ColumName)
    	 {
    		 System.out.println(col1.getText());
    	 }
    	 for(WebElement cole2: ColumEmail)
    	 {
    		 System.out.println(cole2.getText());
    	 }
     }
     public void getVerifydata()
     {
    	ArrayList<String> actualname= new ArrayList<String>();
    	for(int i=1;i<=9;i++)
    	{
    		actualname.add(excelReaddata(path, 3, i, 0));
    	}
    	 for(WebElement ExpectCol_Name:ColumName)
    	 {
    		 String expectedName= ExpectCol_Name.getText();
    		 
    		 for(String actual_name:actualname)
    		 {
    			 Assert.assertEquals(actual_name, expectedName);
    		 }
    	 }
    	
    	 ArrayList<String> actualEmail= new ArrayList<String>();
    	 
    	 for(int i=1;i<=9;i++)
    	 {
    		 actualEmail.add(excelReaddata(path, 3, i, 1));
    	 }
    	 for(WebElement ExpectEmail:ColumEmail)
    	 {
    		 String expectedEmail= ExpectEmail.getText();
    		 for(String actEmail:actualEmail)
    		 {
    			 Assert.assertEquals(actualEmail, expectedEmail);
    		 }
    	 }
    	 
    	 
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
