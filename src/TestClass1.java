import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		POMLoginPage pl=new POMLoginPage(driver);
		pl.setUsername("ravi");
		pl.setPwd("rwewe");
		pl.ClickLogin();		
		Thread.sleep(3000);
		pl.setUsername("admin");
		pl.setPwd("manager");
		pl.ClickLogin();
		driver.close();

	}

}
