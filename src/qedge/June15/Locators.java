package qedge.June15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.driver.chromedriver", "//Users//gauravsalkar//chromedriver");
WebDriver driver = new ChromeDriver();

driver.findElement(By.id(null));
driver.findElement(By.name(null));
driver.findElement(By.className("className"));
driver.findElement(By.linkText(null));
driver.findElement(By.partialLinkText(null));
 driver.findElement(By.tagName("null")); 
driver.findElement(By.xpath(null));
driver.findElement(By.cssSelector(""));


	}

}
