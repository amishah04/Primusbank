package qedge.June30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		
		
		// capture specific row cell data in a table
		
		WebElement table1 = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[10]/td[1]"));
		System.out.println(table1.getText());
		
		WebElement table2 = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[2]/td[2]"));
		System.out.println(table2.getText());
		
		driver.close();
		
		
	}

}
