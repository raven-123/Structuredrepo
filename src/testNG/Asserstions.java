package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserstions {
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actualvalue = driver.getTitle();
		String expectedvalue = "invalid";
		Assert.assertEquals(actualvalue, expectedvalue, "failed");
		driver.close();
	}
@Test

	public void test2()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actualvalue1 = driver.getTitle();
		String expectedvalue1 = "invalid";
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(actualvalue1, expectedvalue1);
		driver.close();
		sa.assertAll();
	}
}
