package ApplicationUtility;

import org.openqa.selenium.WebElement;

public interface Application_Utility 
{
	//Command Double click and Right click
   public void doubleClick(WebElement ele);
   public void rightClick(WebElement ele);
   
   public void changeWindow(int indexno);
   
}
