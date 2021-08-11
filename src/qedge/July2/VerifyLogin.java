package qedge.July2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("/Users/gauravsalkar/Desktop/Info_1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		while((str=br.readLine())!=null)
		{
			Thread.sleep(5000);
			// java date time
			Date date = new Date();
			DateFormat df = new SimpleDateFormat("YYYY_MM_DD mm_hh_ss");

			String datef = df.format(date);

			// split notepad data into array variable
			String login []= str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
			
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).submit();
			Thread.sleep(3000);
			
			// compare title url
			if (driver.getCurrentUrl().contains("dashboard"))
			{
				System.out.println("Login Success" + login[0]+ login[1]);
			}
			else
			{
			// take screen shot for fail
				
				File ss1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(ss1, new File ("/Users/gauravsalkar/Desktop/"+ datef+" "+ "LoginPage.png"));
				System.out.println("Login Fail" + login[0]+ login[1]);
			}
			driver.close();
		}
		
		
	}

}
