package qedge.June19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com/admin_banker_master.aspx");
		List <WebElement>linkname =driver.findElements(By.tagName("a"));
		System.out.println("Nos. of links :" + linkname.size());
	
		for(int i = 0;i<linkname.size();i++)
		{
			String name = linkname.get(i).getText();
			String link = linkname.get(i).getAttribute("href");
			System.out.println(name+"\n"+link);
		}
		
		// or use enhanced forloop
		/*for (WebElement a:linkname)
		{
			System.out.println(a.getText());
			System.out.println(a.getAttribute("href"));
			
		}*/
		
		
		
	}

}
