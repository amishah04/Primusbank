package qedge.June19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		System.out.println("Ttile of the page 1:" + driver.getTitle());
		Thread.sleep(3000);
		
		// click on gmail link
		
		driver.findElement(By.partialLinkText("Gmail")).click();
		System.out.println("Ttile of the page 2: "+ driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		
		System.out.println("Ttile of the page 3: "+ driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().forward();
		
		System.out.println("Ttile of the page 4: "+ driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		
		
		
		
	}

}
