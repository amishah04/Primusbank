package qedge.July19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 {
	WebDriver driver;

	@Test
	public void verifyTitle() throws Throwable {

	System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
	driver = new ChromeDriver();
	// driver.get("https://www.google.com/");
	
	driver.get("https://www.gmail.com/");
	Thread.sleep(5000);
	String expected = "Google";
	String actual = driver.getTitle();
	
	try {
		Assert.assertTrue(expected.equalsIgnoreCase(actual),"Title Not Matched");
		}
	catch (Throwable t)
	{
	
System.out.println(t.getMessage());

}
	driver.close();

	}
}
