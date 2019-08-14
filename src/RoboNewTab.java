import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboNewTab {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String  Parent=driver.getWindowHandle();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(3000);
		
		

		Set<String> windows = driver.getWindowHandles();

		for (String Sx : windows) {
			System.out.println(driver.switchTo().window(Sx).getTitle());

		}

		driver.get("https://www.naukri.com/");

		Set<String> sz = driver.getWindowHandles();
		System.out.println(sz);
		for (String Sx : windows) {
			System.out.println(driver.switchTo().window(Sx).getTitle());
		}
		
	System.out.println(driver.switchTo().window(Parent).getTitle());

	driver.quit();
	}

}
