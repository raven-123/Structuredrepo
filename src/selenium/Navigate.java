package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com");
		System.out.println("title of page " + driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		System.out.println("title of page after navigation " + driver.getTitle());
	}

}
