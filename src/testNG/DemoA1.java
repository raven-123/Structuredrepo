package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA1 {
	@Test
	public void deleteUser()
	{
		Reporter.log("delete user",true);
	}

}
