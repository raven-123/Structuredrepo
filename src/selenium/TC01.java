package selenium;

import java.awt.Dimension;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");// to implement driver executables

	}

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.yatra.com");
		driver.get("https://demo.actitime.com/login.do");

		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		WebElement logintxt = driver.findElement(By.id("username"));
		logintxt.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		WebElement login = driver.findElement(By.id("loginButton"));
		login.click();
		Thread.sleep(3000);
		System.out.println("title of the page " + driver.getTitle());
		Thread.sleep(3000);
		System.out.println("current URL " + driver.getCurrentUrl());
		Thread.sleep(3000);
		String pagesoure = (driver.getPageSource());
		System.out.println("page source " + pagesoure);
		driver.close();

	}

}
