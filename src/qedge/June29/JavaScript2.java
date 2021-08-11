package qedge.June29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//launch url
		js.executeScript("window.location='https://amazon.in'");

		
		// scroll top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//scroll  bottom to top vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		//scroll to certain pixel vertically
		
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(5000);
		
		//store sign button into webelement
		
		WebElement signin=driver.findElement(By.xpath("(//span[text()='Sign in'] )[3]"));
		
		//scroll to signin id button
		
		js.executeScript("document.scrollIntoView", signin);
		signin.click();
		
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
