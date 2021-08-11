package qedge.July19;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
WebDriver driver;
// declare object property
Properties config;

@BeforeTest 
public void setup() throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
// property file create object method to initiate property file 
	config = new Properties();
	
// load and access path of property file // give path of the property file
	config.load( new FileInputStream ("/Users/gauravsalkar/eclipse-workspace/PrimusBank/OR.properties"));
	driver = new ChromeDriver();
	
	
	driver.get(config.getProperty("url"));
	
	
}


@Test
public void verifyLogin() throws Throwable
{
	driver.findElement(By.xpath(config.getProperty("objuser"))).sendKeys("Admin");
	driver.findElement(By.xpath(config.getProperty("objpass"))).sendKeys("Admin");
	driver.findElement(By.xpath(config.getProperty("objLogin"))).click();
	Thread.sleep(5000);
}

@AfterTest
public void TearDown()throws Throwable
{
driver.close();	
}
}
