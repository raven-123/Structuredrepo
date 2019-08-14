package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeMethod
public void login()
{
		Reporter.log("login to web page",true);
}
	
	@AfterMethod
	public void logOut()
	{
		Reporter.log("logout",true);
	}

}
