package qedge.July20;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting {

	
	ExtentReports report; // detailed HTML report abt exe status 
	ExtentTest test; // generate logs in report

	@BeforeTest
	public void setUp() {
		// specify path for html
	report = new ExtentReports("./Reports/Demo.html");
	//Users/gauravsalkar/eclipse-workspace/PrimusBank
	}

	@Test
	public void passTest() {
		
		test = report.startTest("Pass Test"); // starts current test  and give message
		test.log(LogStatus.PASS, "My Test Case Pass"); // print reports abt tc pass, fail or skip
	}

	@Test
	public void failTest() {
		test = report.startTest("Fail Test"); // 
		test.log(LogStatus.FAIL, "My Test Case Fail");
	}

	@Test
	public void skipTest() {
		test = report.startTest("skip Test");
		test.log(LogStatus.SKIP, "My Test Case skip");
	}

	@AfterMethod
	public void tearDown() {
		report.endTest(test);
		report.flush(); // push everything in report - 
	}
}
