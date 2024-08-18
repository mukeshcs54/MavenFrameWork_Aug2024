package TestingPage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseLibraray_July.baseLibraray_July;

public class Links_PageScript extends baseLibraray_July
{
  public Links_PageScript()
  {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath = "//*[text()='×']")
  private WebElement closedbtn;
  
  @FindBy(xpath = "//*[text()='Practice']")
  private WebElement practicebtn;
  @FindBy(xpath = "//button[@data-target=\"#elements\"]")
  private WebElement elementsbtn;
  @FindBy(xpath = "//*[text()='links']")
  private WebElement Linksbtn;
  
  @FindBy(xpath = "//*[text()='Demo Page']")
  private WebElement demopagebtn;
  @FindBy(xpath = "//*[text()='Created']")
  private WebElement Createdbtn;
  
  @FindBy(xpath = "//*[text()='No Content']")
  private WebElement NoContentBtn;
  
  @FindBy(xpath = "//*[text()='Moved']")
  private WebElement MovedBtn;
  
  @FindBy(xpath = "//*[text()='Bad Request']")
  private WebElement BadRequestbtn;
  
  @FindBy(xpath = "//*[text()='Unauthorized']")
  private WebElement Unauthorizedbtn;
  @FindBy(xpath ="//*[text()='Forbidden']" )
  private WebElement Forbiddenbtn;
  @FindBy(xpath = "//*[text()='Not Found']")
  private WebElement NotFoundbtn;
  
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
  public void ClickonLinks()
  {
	  Linksbtn.click();
  }
  public void ClickonDemoPage()
  {
	  demopagebtn.click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 Set<String> tab= driver.getWindowHandles();
	 ArrayList<String> listtab= new ArrayList<String>(tab);
	 driver.switchTo().window(listtab.get(1));
	  
	  String expected= driver.getCurrentUrl();
	  String actual=getReaddata("demopage");
	  Assert.assertEquals(actual, expected);
	 
	
	  driver.close();
  }
  public void ClickOnCreated()
  {
	  changeWindow(0);
	  Createdbtn.click();
	  String actual=getReaddata("Created");
	  String expected=  driver.findElement(By.xpath("//*[@id=\"link-result\"]/b[1]")).getText();
	 
	  System.out.println(expected);
	  
	  Assert.assertEquals(actual, expected);
  }
  public void ClickOnNoContent()
  {
	  NoContentBtn.click();
	  String actual= getReaddata("NoContent");
	  String expected=  driver.findElement(By.xpath("//*[@id=\"link-result\"]/b[1]")).getText();
      System.out.println(expected);
	  
	  Assert.assertEquals(actual, expected);
  }
  
  public void ClickOnMovedbtn()
  {
	  MovedBtn.click();
	  String actual= getReaddata("Moved");
	  String expected=  driver.findElement(By.xpath("//*[@id=\"link-result\"]/b[1]")).getText();
      System.out.println(expected);
	  
	  Assert.assertEquals(actual, expected);
  }
  public void ClickOnBadRequest()
  {
	  BadRequestbtn.click();
	  String actual= getReaddata("BadRequest");
	  String expected=  driver.findElement(By.xpath("//*[@id=\"link-result\"]/b[1]")).getText();
      System.out.println(expected);
	  
	  Assert.assertEquals(actual, expected);
  }
  public void ClickOnUnauthorized()
  {
	  Unauthorizedbtn.click();
	  String actual= getReaddata("Unauthorized");
	  String expected=  driver.findElement(By.xpath("//*[@id=\"link-result\"]/b[1]")).getText();
      System.out.println(expected);
	  
	  Assert.assertEquals(actual, expected);
  }
  public void ClickOnForbidden()
  {
	  Forbiddenbtn.click();
	  String actual= getReaddata("Forbidden");
	  String expected=  driver.findElement(By.xpath("//*[@id=\"link-result\"]/b[1]")).getText();
      System.out.println(expected);
	  
	  Assert.assertEquals(actual, expected);
	  
	  
  }
  public void ClickOnNotFound()
  {
	  NotFoundbtn.click();
	  String actual= getReaddata("NotFound");
	  String expected=  driver.findElement(By.xpath("//*[@id=\"link-result\"]/b[1]")).getText();
      System.out.println(expected);
	  
	  Assert.assertEquals(actual, expected);
  }
  
}
