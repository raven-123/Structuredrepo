import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Ravi/Documents/tbale.html");
			String s1 = driver.findElement(By.xpath("//td[text()=' sql']/../td[2]")).getText();
			System.out.println(s1);
			String s2 = driver.findElement(By.xpath("//td[text()='unix']/../td[2]")).getText();
			System.out.println(s2);

	}

}
