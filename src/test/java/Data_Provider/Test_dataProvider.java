package Data_Provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_dataProvider
{   
	  @DataProvider(name="dataset")
      public Object[][] AddNumber()
      {
    	  Object arr[][] = {{1,4,6,5},
    			         {4,6,5,2},
    			         {2,5,6,3}};
		return arr;
		
		
    			       
	
    	  
		
    	  
      }

       @Test(dataProvider = "dataset")
      public void main (int a,int b,int c,int d)
      {
    	  int sum= a+b+c+d;
    	  
    	  System.out.println(sum);
      }
}
