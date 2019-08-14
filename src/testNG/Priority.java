package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void test()
	{
		Reporter.log("test1 with priority1",true);
		
	}

	@Test(priority=-1)
	public void negativePriority()
	{
		Reporter.log(" test case with priority -1", true);
	}
	@Test(priority=0)
	public void AeROPriority()
	{
		Reporter.log("zero priority",true);
	}
	
	@Test(invocationCount=2)
	public void invocationCount()
	{
		Reporter.log("invocation count  twice",true);
	}
	
}
