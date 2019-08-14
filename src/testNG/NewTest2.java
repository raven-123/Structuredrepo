package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() {
	  {
			Reporter.log("my test2",true);
			System.out.println("my test2 print");
		}
  }
}
