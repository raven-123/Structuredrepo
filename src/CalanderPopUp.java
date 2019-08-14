import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderPopUp {

	public static void main(String[] args) throws InterruptedException  { 
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.starhealth.in/renewal");
		
		driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-6 formrhtpdng1 nopadding-left input-effect input racha']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='date-picker']/div[@class='month']/ul/span/i[@class='fa fa-arrow-circle-left fntcol']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='date-picker']/ul[@class='days']/li[contains(.,31)]")).click();
	}

}
