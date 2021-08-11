package qedge.July9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UsingDepends {
	WebDriver driver;
	@BeforeTest
	public void adminLogin()
	{
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");

		driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		
	}
	@Test(groups = "Primus")
	public void branches () throws Throwable
	{
		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods = "branches")
	public void roles()throws Throwable
	{

		driver.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = "roles")
	public void users()throws Throwable
	{
		driver.findElement(By.xpath("//tbody/tr[6]/td[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = "users")
	public void Employee()throws Throwable
	{
		driver.findElement(By.xpath("//tbody/tr[8]/td[1]/a[1]/img[1]")).click();
		Thread.sleep(3000);
	}
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}
