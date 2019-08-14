import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUPhandiling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");

		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='topMenuButton preventPanelsHiding'][2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='popup_menu_ul']/descendant::a[contains(.,'About')")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@id='aboutPopup']/descendant::a[contains(.,'About')")).click();
		Thread.sleep(3000);

		

		driver.findElement(By.xpath("//div[@id='aboutPopup']/descendant::td[@class='close-button']")).click();

	}

}
