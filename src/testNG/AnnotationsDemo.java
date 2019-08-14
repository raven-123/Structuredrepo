package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo {
@BeforeMethod
	public void login()
	{
	Reporter.log("login			--before method execution",true);
	}
@AfterMethod
public void logOut()
{
	Reporter.log("logout			-- After method execution",true);
}

@Test
public void deleteuser()
{
	Reporter.log("delete user		-- test class execution0", true);
}

}
