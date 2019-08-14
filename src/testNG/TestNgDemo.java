package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;


	public class TestNgDemo {

		@Test
		public void testDemo()
		{
			Reporter.log("my test", true);
			System.out.println("my test print");
		}
	}



