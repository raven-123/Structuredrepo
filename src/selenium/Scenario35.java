package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario35 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.findElement(By.xpath("//a[text()='Slider']")).click();
		WebElement slider= driver.findElement(By.xpath("//div[@id='slider']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 0, 100).perform();
	}

}
