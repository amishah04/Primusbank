package qedge.July23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculator {

	String inputpath = "/Users/gauravsalkar/Desktop/Ami/percentage.xlsx";
		String outputpath = "/Users/gauravsalkar/Desktop/Ami/percentage.xlsx";
		WebDriver driver;
		FileInputStream fi;
		FileOutputStream fo;
		Workbook wb;
		Sheet ws;
		
		@BeforeTest
		public void setUP() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
			driver = new ChromeDriver();
			driver.get("https://www.calculator.net/percent-calculator.html");
			Thread.sleep(50000);
		}
		
		@Test
		public void verifypercentage() throws Throwable
		{
		
		fi = new FileInputStream(inputpath);
		wb = WorkbookFactory.create(fi);
		ws = wb.getSheetAt(0);
		
		int rowcount = ws.getLastRowNum();
		Reporter.log("Nos of rows are:" + rowcount);
		// multiple iteration
		
		for(int i = 1; i <=rowcount; i++)
		{
			if(wb.getSheet("Sheet1").getRow(i).getCell(0).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata1= (int)wb.getSheet("Sheet1").getRow(i).getCell(0).getNumericCellValue();
				
				String percentage = String.valueOf(celldata1);
				
			if (wb.getSheet("Sheet1").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata2 = (int)wb.getSheet("Sheet1").getRow(i).getCell(1).getNumericCellValue();
			
				String Amount = String.valueOf(celldata2);
			
			driver.findElement(By.name("cpar1")).sendKeys(percentage);
			Thread.sleep(50000);
			driver.findElement(By.name("cpar2")).sendKeys(Amount);
			Thread.sleep(50000);
			driver.findElement(By.xpath("(//*[@value ='Calculate'])[1]")).click();
			Thread.sleep(50000);
			// capture text
			String interesttext = driver.findElement(By.xpath("//p[@class = 'verybigtext']")).getText();
			ws.getRow(i).createCell(2).setCellValue(interesttext);
			}
			}
			}
		
		fi.close();
		fo = new FileOutputStream(outputpath);
		wb.write(fo);
		fo.close();
		wb.close();
		}
	
	@AfterTest
	
	public void tearDown()
	{
		driver.close();
	}
}
