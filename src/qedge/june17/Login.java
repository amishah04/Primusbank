package qedge.june17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		String s1 = driver.getWindowHandle();
		System.out.println(s1);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		String s2 = driver.getWindowHandle();
		System.out.println(s2);
		driver.getTitle();
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
        
		if (s1.equals(s2))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("not matched");
		}
	}

}
