package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Parameters {
@org.testng.annotations.Parameters({"username","password"})
	@Test
	public void mytest(String s1,String s2)
	{
		Reporter.log(s1,true);
		Reporter.log(s2,true);
	}

}
