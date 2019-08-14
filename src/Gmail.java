import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("ravindra.reddy619@gmail.com");
		email.submit();
		Thread.sleep(3000);
		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		next.click();
		Thread.sleep(3000);
		System.out.println("entering password");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Murali88");
		password.submit();
		WebElement next1 = driver.findElement(By.xpath("//span[text()='Next']"));
		Thread.sleep(4000);
		next1.click();
		driver.manage().window().maximize();
		Thread.sleep(4000);
	WebElement ww1 = driver.findElement(By.xpath("//a [@class='gb_z']"));
	ww1.click();
		//	driver.findElement(By.linkText("https://mail.google.com/mail/?tab=km")).click();
		
//		WebElement wx=driver.findElement(By.xpath("//div[@aria-label='Google apps']/ul/li[7]/a[@href='https://mail.google.com/mail/?tab=km']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(wx).click().perform();
	WebElement wx=driver.findElement(By.xpath("//div[@aria-label='Google apps']/ul/li[7]/a[@href='https://mail.google.com/mail/?tab=km']"));
	
	wx.click();
	System.out.println("clicking gmail icon");
		// driver.close();

	}

}
