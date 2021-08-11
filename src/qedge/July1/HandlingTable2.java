package qedge.July1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		 WebDriver driver = new ChromeDriver();
		
		String expcountry="canada";
		boolean countryexist =false;
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		
		WebElement table =driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement>row = table.findElements(By.tagName("tr"));
		System.out.println("No of rows:"+ row.size());
		Thread.sleep(5000);
		
		
		for(int r=1; r<+row.size();r++)
		{
		List<WebElement>column=	row.get(r).findElements(By.tagName("td"));
		for (int c = 0;c<=column.size();c++)
		{
			String col = column.get(c).getText();
			Thread.sleep(500);
			System.out.print("\n"+col);
			
			if(col.equalsIgnoreCase(expcountry))
			{
				countryexist = true;
				System.out.println(expcountry+"   "+"Found in Row::"+r+"   "+"In column::"+(c+1));
					
			}
		}
		System.out.println();
		System.out.println("=======================================================");
		}	
		if(countryexist)
		{
			System.out.println("County Found in table::"+expcountry);	
			
		}
		else
			
		{
			System.out.println("County Not Found in table::"+expcountry);
		}
		
		}
		
	}
				



