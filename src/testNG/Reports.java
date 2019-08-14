package testNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {
	ExtentReports reports = new ExtentReports();
	 ExtentTest test=reports.createTest("dem");
	 @Test
	 public void demo() throws IOException
	 {
		 ExtentHtmlReporter rep=new ExtentHtmlReporter("C:\\Users\\Ravi\\eclipse-workspace\\selenium\\MYtest\\myreport.html");
		 rep.config().setDocumentTitle("Automation");
		 rep.config().setReportName("testing");
		 rep.config().setTheme(Theme.DARK);
		 test.addScreenCaptureFromPath("C:\\Users\\Ravi\\eclipse-workspace\\selenium\\screenshots\\a.png");   //attaching screenshot for the report
		 //settin the system information
		 reports.attachReporter(rep);
		 reports.setSystemInfo("ravi", "reddy");
		 reports.setSystemInfo("environmentname", "windows");
		 reports.setSystemInfo("project name", "Demoproject");
		// Assert.fail();
		 test.log(Status.INFO, "running extent report");
		 test.log(Status.PASS, "test is passed");
		 reports.flush();
	 }
	 @AfterMethod
	 public void afterMethod(ITestResult r)
	 {
		 System.out.println(r.getMethod().getMethodName());
		 System.out.println(r.getStatus());
		 if(r.getStatus()==ITestResult.SUCCESS)
		 {
			 test.log(Status.PASS, "test is passed");
		 }
		 else
		 {
			 test.log(Status.FAIL, "test is failed");
			 reports.flush();
		 }
	 }

}
