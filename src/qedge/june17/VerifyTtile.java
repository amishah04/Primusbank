package qedge.june17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTtile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
		WebDriver driver = new ChromeDriver();
		
		//equalsIgnoreCase : it compares two strings if both strings are equal returns true
		//it not eqaul returns false
		
		driver.get("https://google.com");
		// driver.get("https://gmail.com");
		//store expected title 
		
		String expected = "gmail";
		String actual = driver.getTitle();
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Ttile Matched");
		}
		else
		{
			System.out.println("Title Not Matched");
		}

	}

}
