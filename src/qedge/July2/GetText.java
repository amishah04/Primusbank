package qedge.July2;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		
		 File f = new File("/Users/gauravsalkar/Desktop/gettext.txt");
		
		// File f = new File("/Users/gauravsalkar/gettext.doc");

		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/admin_banker_master.aspx");
		Thread.sleep(5000);
		String para1 = driver.findElement(By.xpath("(//p[@class='style7'])[2]")).getText();
		String para2 = driver.findElement(By.xpath("(//p[@class='style7'])[3]")).getText();
		
		bw.write(para1);
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		
		driver.close();
		
	}

}
