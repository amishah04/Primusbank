package qedge.July7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2TestNG {

	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Throwable
	{
	driver = new ChromeDriver();
	driver.get("http://calc.qedgetech.com/");
	Reporter.log("Browser running in setup", true);
	}
	
	@Test
	public void addtion () throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("765");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btn'][6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("display")).sendKeys("73");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='btn'][20]")).click();
		String message = driver.findElement(By.xpath("//*[@type='text']")).getAttribute("value");
		Reporter.log(message, true);
		Reporter.log("Executing addition", true);
		driver.findElement(By.xpath("(//*[@id='btn'])[26]")).click();
	}
	
	@Test
	public void division() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("765");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='btn'])[21]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("display")).sendKeys("73");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='btn'][20]")).click();
		String message = driver.findElement(By.xpath("//*[@type='text']")).getAttribute("value");
		Reporter.log(message, true);
		Reporter.log("Executing division", true);
		driver.findElement(By.xpath("(//*[@id='btn'])[26]")).click();
	}
	

	@Test
	public void multiplication() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("765");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='btn'])[21]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("display")).sendKeys("73");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='btn'][16]")).click();
		String message = driver.findElement(By.xpath("//*[@type='text']")).getAttribute("value");
		Reporter.log(message, true);
		Reporter.log("Executing multiplication", true);
		driver.findElement(By.xpath("(//*[@id='btn'])[26]")).click();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		Reporter.log("Running in TearDown", true);
	}
	
}
