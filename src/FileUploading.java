import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ravi/Documents/FileUpload.html");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Ravi\\Documents\\ravi.rtf");
	}
}
