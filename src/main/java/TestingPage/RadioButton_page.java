package TestingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import BaseLibraray_July.baseLibraray_July;

public class RadioButton_page extends baseLibraray_July
{
	String path="C:\\Users\\dell\\eclipse-workspace\\Maven_Project_Testing_Mukesh_04July_2024\\testData\\NewExceldata.xlsx";
    public RadioButton_page()
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[text()='×']")
    private WebElement closedbtn;
    @FindBy(xpath = "//a[text()='Practice']")
    private WebElement practicebtn;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    private WebElement elementbtn;
   
     @FindBy(xpath = "//a[text()='radio buttons']")
     private WebElement radiobutton;
     
     @FindBy(xpath ="//input[@id=\"yes\"]" )
     private WebElement yesbtn;
     
     @FindBy(xpath = "//input[@id=\"impressive\"]")
     private WebElement impressivebtn;
     @FindBy(xpath ="//input[@id=\"no\"]" )
     private WebElement nobtn;
     
    public void Clickonclosedbtn()
    {
    	closedbtn.click();
    }
    public void ClickonPracticebtn()
    {
    	practicebtn.click();
    }
    public void ClickonElementbtn()
    {
    	elementbtn.click();
    }
    public void clickonRadiobutton()
    {
    	radiobutton.click();
    }
    
    public void ClickActionOnButton()
    {
    	//yesbtn.click();
    	//impressivebtn.click();
    	//nobtn.click();
    }
    public void getdetailsexcel()
    {
    	yesbtn.sendKeys(excelReaddata(path, 2, 1, 0));
    	impressivebtn.sendKeys(excelReaddata(path, 2, 2, 0));
    	nobtn.sendKeys(excelReaddata(path, 2, 3, 0));
    	
    	
    }
    
    public void VerifyRadiobutton()
    {
    	SoftAssert sf= new SoftAssert();
    	yesbtn.click();
    	//After click
    	System.out.println(yesbtn.isDisplayed());
    	
    	Assert.assertTrue(yesbtn.isEnabled(), "Yes button is enabled after click ,is selected");
    	
    	impressivebtn.click();
    	System.out.println(impressivebtn.isDisplayed());
    	Assert.assertTrue(impressivebtn.isEnabled(), "Impressive button is selected after click");
    	
    	nobtn.click();
    	System.out.println(nobtn.isDisplayed());
    	
    	Assert.assertTrue(nobtn.isEnabled(), "No button is selected after click");
         
    	sf.assertAll();
    }     
           
        
}
        		   
           
  
