package qedge.june17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
	  String Expectedurl = "https://";
	  String actualurl = driver.getCurrentUrl();
	  if(actualurl.contains(Expectedurl))
	  {
		  System.out.println("url matched");
		  
	  }
	  else
	  {
		  System.out.println("url not matched");
	  }
	  
	}

}
