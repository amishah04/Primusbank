package qedge.June16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://primusbank.qedgetech.com/admin_banker_master.aspx");
		 Thread.sleep(3000);
		 // String method
		 String title=driver.getTitle();
		
		 String S1 = "Automate";
		 Thread.sleep(3000);
		 
		 System.out.println(title);
		 System.out.println(title.length());
		 System.out.println("-----------");
		 System.out.println(title.concat(S1));
		 System.out.println(title.trim());
		 System.out.println(title.charAt(4));
		 System.out.println(title.contains("BANK")); // T 
		 System.out.println(title.equals(S1));
		 System.out.println(title.equalsIgnoreCase(S1));
		 System.out.println(title.replace('M', 'C')); // ? 
		 
		 String Str1=driver.getCurrentUrl();
		 System.out.println(Str1.length());
		Thread.sleep(3000);
		 driver.quit();
		 
	}

}
