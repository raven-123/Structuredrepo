package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestAllAnnotations {
	@BeforeSuite
	public void beforeSutie()
	{
		Reporter.log("Before suite execution",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before test execution",true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("before class execution",true);
	}
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before Method execution",true);		
	}
	
@AfterSuite
public void afterSuite()
{
	Reporter.log("after suite execution",true);
}

@AfterTest
public void AfterTest()
{
	Reporter.log("After test execution",true);
}
@AfterClass
public void bEforeClass()
{
	Reporter.log("After class execution",true);
}

@AfterMethod
public void beforMethod()
{
	Reporter.log("After Method Execution",true);
}


}
