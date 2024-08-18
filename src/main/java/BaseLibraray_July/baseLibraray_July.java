package BaseLibraray_July;



import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ApplicationUtility.Application_Utility;
import ExcelUtilityScript.excelUtility_Script;
import Propertyfileutility.PropertyUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseLibraray_July implements excelUtility_Script,Application_Utility,PropertyUtility
{      
	//String path="C:\\Users\\dell\\eclipse-workspace\\Maven_Project_Testing_Mukesh_04July_2024\\testData\\NewExceldata.xlsx";
	String ConfigPathJuly="C:\\Users\\dell\\eclipse-workspace\\01_May_2024_NewAutomation_Mukesh\\TestData\\Config.propertiesJuly";
	  public static WebDriver driver;
	  public void LaunchTestingbabaUrl(String url)
	  {
		   WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   driver.get("https://www.testingbaba.com/old/");
		   driver.manage().window().maximize();
		   
	  }
	//  @AfterTest
	  public void teardown()
	  {
		 // driver.close();
	  }
	public int getRowCount(String path,int sheetno)
	{
		int rowcount=0;
		try 
		{
			FileInputStream fis= new FileInputStream(path);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(sheetno);
			rowcount=sheet.getLastRowNum()-1;
			
		} catch (Exception e) 
		{
			System.out.println("Issue in get read data from row");
		}
		return rowcount;
	}
	public String excelReaddata(String path, int sheetno, int rowno, int colnum)
	{
		String value="";
		try
		{ 
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colnum).getStringCellValue();
			
			XSSFRow row=sheet.getRow(rowno);
			int col=row.getLastCellNum();
		} 
		catch (Exception e)
		{
			System.out.println("Issue in get read data");
		}
		
		return value;
	}
	@Override
	public void doubleClick(WebElement ele)
	{
		Actions act= new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	@Override
	public void rightClick(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
	}
	@Override
	public String getReaddata(String key)
	{
		String value="";
		
		try 
		{
			FileInputStream fis = new FileInputStream(ConfigPathJuly);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} 
		catch (Exception e) 
		{
			System.out.println("Issue in get read data from property file");
		}
		return value;
	}
	@Override
	public void changeWindow(int indexno)
	{
		   Set<String> tabs=driver.getWindowHandles();
		   ArrayList<String>tabno= new ArrayList<String>(tabs);
		   driver.switchTo().window(tabno.get(indexno));
		   
		
	}
	
	  
	  
} 
