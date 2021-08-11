package qedge.June19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;



public class DropDrown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//gauravsalkar//chromedriver"); 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/admin_banker_master.aspx");
		
		String expecteditem = "deals";
	Boolean	itemexist= false;
		
		
		
		Select ddname = new Select(driver.findElement(By.name("drlist")));
		
		System.out.println(ddname.getOptions().size());
		
		ddname.selectByIndex(2);
		ddname.selectByVisibleText("patny12");
		ddname.isMultiple();
		
		
		List<WebElement> branchname = ddname.getOptions();
		//System.out.println(branchname.size());

		for(WebElement a:branchname)
			
		{
			String actualitem = a.getText();
			System.out.println(a.getText());
			if(actualitem.equalsIgnoreCase(expecteditem))
			{
				itemexist = true;
				break;
				
			}
			else
			{
				System.out.println("item does not exist" + expecteditem);
			}
		}
		System.out.println("item exist" + expecteditem);
		
		

	}

}
