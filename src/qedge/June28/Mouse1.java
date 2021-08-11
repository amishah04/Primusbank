package qedge.June28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		// scroll down page
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames);
		
		driver.switchTo().frame(0);
		
		WebElement S1 = driver.findElement(By.id("draggable"));
		WebElement T1 = driver.findElement(By.id("droppable"));
		
	// 	act.dragAndDrop(S1, T1).build().perform();
	//	act.clickAndHold(S1).moveToElement(T1).release().build().perform();
	int x = T1.getLocation().getX();
	int y = T1.getLocation().getY();
		
	
	System.out.println(x+ "   "+ y);
	act.dragAndDropBy(S1, x, y).build().perform();
	
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Button")).click();
		act.sendKeys(Keys.PAGE_DOWN);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
