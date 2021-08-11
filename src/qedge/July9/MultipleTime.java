package qedge.July9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTime {
WebDriver driver;

	// when you want to invoke/exe test method/testcase more than 1 time
	@Test (invocationCount = 3) 
	public void verifylogin()
	{
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");

		driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Admin");
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}
}
