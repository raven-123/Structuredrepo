import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadPOPUP {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
System.setProperty("webdriver.gecko.driver", "path of gecko drivers");
WebDriver driver= new FirefoxDriver();
driver.get("https://www.seleniumhq.org/download/");
driver.findElement(By.xpath("//td[text()='Java']/parent::tr/td[contains(.,'')"));
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(3000);
r.keyPress(KeyEvent.VK_ENTER);
	}

}
