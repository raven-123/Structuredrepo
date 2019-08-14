import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebElement logout = driver.findElement(By.id("logoutLink"));
		
org.openqa.selenium.support.ui.FluentWait<WebDriver> wait= new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver);
wait.pollingEvery(Duration.ofMillis(600).withNanos(10)).withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
	wait.until(ExpectedConditions.elementToBeClickable(logout));
	}

}
