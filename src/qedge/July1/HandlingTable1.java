package qedge.July1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		 WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		
		//capture specific row cell data in a table
		
		driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		WebElement tablevalue = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]"));
		System.out.println(tablevalue);
		
		//get collection of rows in a table
		WebElement table = driver.findElement(By.tagName("table"));
		
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		int rowsize = row.size();
		System.out.println(rowsize);
		System.out.println("No of rows are::"+rowsize);
		Thread.sleep(5000);
		
		// //iterate all rows
		for(WebElement eachrow:row)
		{
			//get collection of cells from eachrow /column
			List<WebElement>column = eachrow.findElements(By.tagName("td"));
			
			//iterate all cells
			
		for(WebElement eachcolumn:column)
		{
			String columntext = eachcolumn.getText();
			Thread.sleep(500);
			System.out.print(columntext+"\n");
			
		}
		}
		System.out.println();
		System.out.println("=================================================================");
		}

	}

