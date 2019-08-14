import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenimDownload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		String s1=driver.findElement(By.xpath("//td[text()='Java']/parent::tr/td[2]")).getText();
		 
	//System.out.println(driver.findElement(By.xpath("//td[text()='Java']/../td[2]")).getText());
		System.out.println("java version "+ s1);
		
		//String s2=driver.findElement(By.xpath("//td[text()='Python']/parent::tr/td[2]")).getText();
		//System.out.println(s2);
		System.out.println("Python Version "+driver.findElement(By.xpath("//td[text()='Python']/../td[2]")).getText());

		
	}

}
