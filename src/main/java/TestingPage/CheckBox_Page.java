package TestingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import BaseLibraray_July.baseLibraray_July;

public class CheckBox_Page extends baseLibraray_July
{
	String path="C:\\Users\\dell\\eclipse-workspace\\Maven_Project_Testing_Mukesh_04July_2024\\testData\\NewExceldata.xlsx";
    public CheckBox_Page()
    {
    	PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//button[text()='×']")
    private WebElement closedbtn;
    @FindBy(xpath = "//a[text()='Practice']")
    private WebElement practicebtn;
    @FindBy(xpath = "//button[@data-target=\"#elements\"]")
    private WebElement elementbtn;
    @FindBy(xpath ="//a[text()='check box']" )
    private WebElement checkboxbtn;
    
    
    @FindBy(xpath = "//*[@id=\"myCheck\"]")
    private WebElement mobilebtn;
    @FindBy(xpath = "//*[@id=\"mylaptop\"]")
    private WebElement laptopbtn;
    @FindBy(xpath = "//*[@id=\"mydesktop\"]")
    private WebElement desktopbtn;
    
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
    public void ClickonCheckBoxbtn()
    {
    	checkboxbtn.click();
    }
    public void ClickonButtons()
    {
    //	WebElement framloc=driver.findElement(By.xpath("//*[@src=\"Checkbox.html\"]"));
    //	driver.switchTo().frame(0);
    //	mobilebtn.click();
    //	laptopbtn.click();
    //	desktopbtn.click();
    	
    //	driver.switchTo().defaultContent();
    }
    public void getReadExcelData()
    {
    	WebElement framloc=driver.findElement(By.xpath("//*[@src=\"Checkbox.html\"]"));
    	driver.switchTo().frame(0);
    	mobilebtn.sendKeys(excelReaddata(path, 1, 1, 1));
    	mobilebtn.click();
    	laptopbtn.sendKeys(excelReaddata(path, 1, 2, 1));
    	laptopbtn.click();
    	desktopbtn.sendKeys(excelReaddata(path, 1, 3, 1));
    	desktopbtn.click();
    	
    	driver.switchTo().defaultContent();
    	
    }
    public void verifydata()
    {
    	WebElement framloc=driver.findElement(By.xpath("//*[@src=\"Checkbox.html\"]"));
    	
    	
    	driver.switchTo().frame(0);
    	
    	SoftAssert sf= new SoftAssert();
    	
    	mobilebtn.click();
    
    	System.out.println(mobilebtn.getText());
    	Assert.assertTrue(mobilebtn.isSelected(), "Mobile checkbox should be selected but is not");
    	
    	laptopbtn.click();
    	Assert.assertTrue(laptopbtn.isSelected(), "Laptop checkbox should be selected but is not");
    	desktopbtn.click();
    	Assert.assertTrue(desktopbtn.isSelected(), "Desktop checkbox should be selected but is not.");
    	
    	
    	sf.assertAll();
    	
    	driver.switchTo().defaultContent();
    	
    }
    
    
    
}
