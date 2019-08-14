package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
	@Test(priority=1,groups= {"user"})
	public void createUSER()
	{
		Reporter.log("create user",true);
		
	}
	
	@Test(priority=-1,groups= {"user1"},enabled=false)
	public void editUser()
	{
		Reporter.log("editUSer",true);
	}
	@Test(priority=2,groups= {"product","smoke"})
	public void createUser2()
	{
		Reporter.log("create user2",true);
	}
	
	@Test(priority=3,groups= {"products"},dependsOnGroups= {"user"})
	public void dependecnyTest()
	{
		Reporter.log("dependeny test case",true);
	}

}
