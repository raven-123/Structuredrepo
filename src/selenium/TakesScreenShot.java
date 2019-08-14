package selenium;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		TakesScreenshot image = (TakesScreenshot) driver; // type casting driver to TakeScreenshot

		File src = image.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/a.png");
		FileUtils.copyFile(src, dest);

		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);

		System.out.println(s1.size());
		int count = 1;
		for (String obj : s1) {
			count++;
			if (count == 2) {
				driver.switchTo().window(obj);
				TakesScreenshot image2 = (TakesScreenshot) driver;
				File src1 = image2.getScreenshotAs(OutputType.FILE);
				File dest1 = new File("./screenshots/obj.png");
				System.out.println("second windo screenshot taken");
				FileUtils.copyFile(src1, dest1);
			} else {
				driver.switchTo().window(obj);
			}
		}
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());

		driver.quit();
	}

}
