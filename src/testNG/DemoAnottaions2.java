package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAnottaions2  extends BaseTestAllAnnotations{
	@Test
	public void createUser()
	{
		Reporter.log("create User",true);
	}

}
