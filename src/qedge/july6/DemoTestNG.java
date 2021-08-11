package qedge.july6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoTestNG {
  @Test
  public void login() {
	  Reporter.log("Executing login testcase", true); // to print message in console tab write true , reporter is like sysln
  }
  @Test
  public void compose () {
	  Reporter.log("Executing compose testcase", true);
	  
  }
  
  @Test
  public void reply () {
	  Reporter.log("Executing reply testcase", true);
  }
  
   
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("running in beforemethod", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("running in after method", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("running in before class", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("running in after class", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("running in before test", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("running in after test", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("running in before suite", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("running in after suite", true);
  }
 

}
