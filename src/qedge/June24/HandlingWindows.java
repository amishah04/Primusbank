package qedge.June24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
	Set<String> child =	driver.getWindowHandles();
	System.out.println(child);
	System.out.println(parent);
	// iterate all window
	
	for(String s:child)
	{
		if(!parent.equals(s)) // if parent id not equal to child
		{
			// switch to each child window and get title
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
			Thread.sleep(5000);
			driver.close();
		}
		
		
	}
		
	// switch to parent window
	 driver.switchTo().window(parent);
	 Thread.sleep(5000);
	 // click on register for free
	
	 driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
	 driver.findElement(By.xpath("//input[@type='text'][1] ")).sendKeys("Ami");
	 Thread.sleep(5000);
	 driver.quit();
	 
	}

}
