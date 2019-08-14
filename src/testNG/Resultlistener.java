package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Resultlistener implements ITestListener {
static int passcount=0;
static int  failcount=0;
	@Override
	public void onTestStart(ITestResult result) {
String nameOfTest=result.getName();	
Reporter.log("test "+nameOfTest+ " is started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
String succesTestName=result.getName();
Reporter.log("test "+ succesTestName +"is sucess",true);
passcount++;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failedTestName=result.getName();
		Reporter.log("test "+ failedTestName +"is failed",true);
		failcount++;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
String name=context.getClass().toString();
Reporter.log(name+ "started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
Reporter.log("pass: "+passcount,true);
Reporter.log("fail: " +failcount,true);
	}

}
