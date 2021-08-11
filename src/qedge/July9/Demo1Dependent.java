package qedge.July9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1Dependent {

	/*@Test(description = "message") // will print message into html
	@Test(prioity = 2) // will give priority 
	@Test(enable = "false")// if you want to skip/ignore the testmethod
	@Test(Invov ="") // repeat the test again n again
	@Test(dependson ="") */
	
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
	driver = new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/");
	
	Reporter.log("Running in setup ", true);
	Thread.sleep(3000);
	}
		
	@Test (description = "Verify pbanking", priority = 3, enabled = true)
		public void pbanking()throws InterruptedException
		{
			driver.findElement(By.xpath("//a[contains(@href,'personal')]")).click();
			Reporter.log("pbanking test case", true);
			Thread.sleep(3000);
		}
		
		@Test (description = "Verify cbanking", priority = 1, enabled = true)
		public void cbanking()throws InterruptedException
		{
			driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]")).click();;
			Reporter.log("cbanking test case", true);
			Thread.sleep(3000);
		}
		@Test (description = "Verify ibanking", priority = 2, enabled = false)
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
