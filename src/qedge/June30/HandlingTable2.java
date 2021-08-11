package qedge.June30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		
		// store table intowebelement 
		
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
		
		// get collection or rows in a table
		List<WebElement>rows = table.findElements(By.tagName("tr"));
		System.out.println("Nos of rows: "+rows.size());
		
		int rowcount=rows.size();
		
		// get collection for columns
		
		for (int i = 0; i<= rows.size();i++)
		{
			List<WebElement>column =rows.get(i).findElements(By.tagName("td"));
			 // System.out.println("Nos of row:" + i + "No of column"+ column.size());
			
			int columncount = column.size();
			
			for(int j=0; j<columncount; j++)
			{
				String coltext = column.get(j).getText();
				System.out.println(coltext);
			}
			
		}
		
		
			
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
