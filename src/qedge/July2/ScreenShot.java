package qedge.July2;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
Thread.sleep(5000);
// java date time
Date date = new Date();
DateFormat df = new SimpleDateFormat("YYYY_MM_DD mm_hh_ss");

String datef = df.format(date);


// take screen shot
File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// copy screenshot into local system

FileUtils.copyFile(screen, new File("/Users/gauravsalkar/Desktop/"+datef+"  "+ "homepage.png"));


	}

}
