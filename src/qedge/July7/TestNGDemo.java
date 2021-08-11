package qedge.July7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
WebDriver driver;
@BeforeMethod
public void setUp() throws InterruptedException
{
driver = new ChromeDriver();
driver.get("http://primusbank.qedgetech.com/");
Reporter.log("Running in setup ", true);
Thread.sleep(3000);
}
	
	@Test
	public void pbanking()throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(@href,'personal')]")).click();
		Reporter.log("pbanking test case", true);
		Thread.sleep(3000);
	}
	
	@Test
	public void cbanking()throws InterruptedException
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]")).click();;
		Reporter.log("cbanking test case", true);
		Thread.sleep(3000);
	}
	@Test
	public void ibanking() throws InterruptedException
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]/img[1]")).click();;
		Reporter.log("ibanking test case", true);
		Thread.sleep(3000);
	}
	
	@AfterTest
	
	public void close()
	{
	driver.close();
	Reporter.log("Running in tear Down", true);
	}
}
