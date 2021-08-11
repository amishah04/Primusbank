package qedgeJune23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Ami");
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_2')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("Ami");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("Shah");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("ami.sfh@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("ami.sfh@gmail.com");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("Ami");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByIndex(7);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByIndex(3);
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByVisibleText("1983");
		driver.findElement(By.xpath("//form[@id='reg']//following::input[11]")).click();
		new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[4]"))).selectByIndex(2);
		driver.findElement(By.xpath("//form[@id='reg']//following::input[12]")).sendKeys("Ami");
		
		
	}

}
