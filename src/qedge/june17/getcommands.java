package qedge.june17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String s = driver.getTitle();
		System.out.println(s);
		System.out.println(s.length());
		
		String WH = driver.getWindowHandle();
		System.out.println(WH);
		System.out.println(WH.length());
		

	}

}
