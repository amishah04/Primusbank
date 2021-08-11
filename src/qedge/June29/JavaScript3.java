package qedge.June29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript3 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// launch url
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		
		
		// send values - sendkeys using javascript
		
		
		js.executeScript("document.querySelector('#txtUsername').value='Admin5'");
		js.executeScript("document.querySelector('#txtPassword').value='Qedge123!@#'");
		js.executeScript("document.querySelector('#btnLogin').click()");
		Thread.sleep(5000);
		
		// match title
		String expectedtitle = "dashboard";
		
		String actualtitle = js.executeScript("return document.URL").toString();
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("Login success::"+ expectedtitle +"     "+ actualtitle );
		}
		
		else
		{
		// capture error message
			String message =js.executeScript("return document.querySelector('#spanMessage').innerHTML").toString();
			System.out.println(message + "    "+expectedtitle	+"    "+actualtitle);
			
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
