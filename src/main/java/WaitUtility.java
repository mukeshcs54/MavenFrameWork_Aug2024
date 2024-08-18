import org.openqa.selenium.WebElement;

public interface WaitUtility 
{
     public void visibilityOfElement(WebElement ele,int time);
     public void elementToBeClikabe(WebElement ele,int time);
     public void alertisPresent(int time);
}
