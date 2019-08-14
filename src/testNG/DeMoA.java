package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DeMoA extends BaseTest {
	@Test
	public void createUser()
	{
		Reporter.log("create user" ,true);
	}

}
