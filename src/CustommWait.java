import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class CustommWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/Users/Ravi/Documents/test1.html");
		driver.findElement(By.id("r1")).sendKeys("TESTYANTRA");
		WebElement w1= driver.findElement(By.id("r1"));		
String value=	driver.findElement(By.name("r@vi")).getAttribute("value");


	
	
		driver.close();
		
//		FluentWait<WebDriver> fwait= new FluentWait<WebDriver>(driver);
//		fwait.pollingEvery(Duration.ofMillis(600).withNanos(10)).withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
//	boolean flag=	fwait.until(ExpectedConditions.textToBePresentInElementValue(w1, "TESTYANTRA"));
//	 while (flag)
//	 {
//		 try
//	 {
//		 driver.findElement(By.id("r2")).sendKeys("TY");
//		 break;
//	 }
//	 
//	 catch (Exception e) {
//System.out.println("exception found");	}
//		
//	 }		
//		
	}

}
