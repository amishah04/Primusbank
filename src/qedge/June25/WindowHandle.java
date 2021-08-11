package qedge.June25;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
driver.findElement(By.xpath("(//label[text()='HOTELS'])[2]")).click();
driver.findElement(By.xpath("//label[text()='RAIL DRISHTI']")).click();

// collection of all windows



//give control to air ticket

	}

}
