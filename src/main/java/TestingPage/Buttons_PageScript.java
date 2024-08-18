package TestingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibraray_July.baseLibraray_July;

public class Buttons_PageScript extends baseLibraray_July
{
   
	 public Buttons_PageScript()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath = "//*[text()='×']")
     private WebElement closedbtn;
     
     @FindBy(xpath = "//*[text()='Practice']")
     private WebElement practicebtn;
     @FindBy(xpath = "//button[@data-target=\"#elements\"]")
     private WebElement elementsbtn;
     
     @FindBy(xpath = "//a[text()='buttons']")
     private WebElement buttons;
     @FindBy(xpath = "//button[@ondblclick=\"doubletext()\"]")
     private WebElement DoubleClickMe;
     
     @FindBy(xpath = "//button[@oncontextmenu=\"righttext()\"]")
     private WebElement RightClickMe;
     
     @FindBy(xpath = "//button[@onclick=\"clicktext()\"]")
     private WebElement clickMe;
     
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
	 public void ClickOnButtons()
	 {
		 buttons.click();
	 }
	 public void getClickButtons()
	 {
		//WebElement DoubleClickMe= driver.findElement(By.xpath("//button[@ondblclick=\"doubletext()\"]"));
		
		 doubleClick(DoubleClickMe);
		WebElement Expect_DoubleClick= driver.findElement(By.xpath("//*[@id=\"double-content\"]"));
		System.out.println(Expect_DoubleClick.getText());
		
		
		 
		 rightClick(RightClickMe);
		 WebElement Expect_RightClick= driver.findElement(By.xpath("//*[@id=\"right-content\"]"));
		 System.out.println(Expect_RightClick.getText());
		 
		 clickMe.click();
		
		 WebElement Expec_ClickMe=driver.findElement(By.xpath("//*[@id=\"click-content\"]"));
		 System.out.println(Expec_ClickMe.getText());
	 }
}
