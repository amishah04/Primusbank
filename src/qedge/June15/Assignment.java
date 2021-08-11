package qedge.June15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		
			driver.get("http://primusbank.qedgetech.com/");
			driver.findElement(By.id("txtuId")).sendKeys("Admin");
			driver.findElement(By.id("txtPword")).sendKeys("Admin");
			driver.findElement(By.name("login")).click();
			String actual = driver.getTitle();
			String expected = "Primus BANK";
			if (actual.equals(expected))
			{
				System.out.println("Ttile Matched");
			}
			else
			{
				System.out.println("ttile not Matched");
			}
			driver.close();
			
			
			
	}

}
