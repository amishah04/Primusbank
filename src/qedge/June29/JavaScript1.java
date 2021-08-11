package qedge.June29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable {
		
		try {
		
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// create javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//launch url usingjavascriptexe
		js.executeScript("window.location='https://snapdeal.com'");
		Thread.sleep(5000);
		
		//print title of the page & length of title
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		
		//print url of the page & length of url	
		String pageURL=js.executeScript("return document.URL").toString();
		System.out.println(pageURL);
		System.out.println(pageURL.length());
		
		//print domain name & length of domain
		
		String domain= js.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());
		
		Thread.sleep(5000);
		driver.close();
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
