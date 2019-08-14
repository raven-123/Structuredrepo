import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandiling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Ravi\\Documents\\frame.html");
		
		driver.findElement(By.id("t1")).sendKeys("ty");
		driver.switchTo().frame("f1");
		System.out.println("switched to frame");
		driver.findElement(By.id("t2")).sendKeys("testyantrasoftware");
		driver.findElement(By.id("t3")).sendKeys("switched to frame");
		
		System.out.println("passing control to main  page");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("-SOFTWARE");
		

	}

}
