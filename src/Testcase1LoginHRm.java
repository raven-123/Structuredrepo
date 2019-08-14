import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1LoginHRm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");		
		HRMLoginPOMPage hrmlp=new HRMLoginPOMPage(driver);
		hrmlp.detailsInput("Admin", "admin123");
		
		HrmLogutPOMPAGE hrmlogp=new HrmLogutPOMPAGE(driver);
		hrmlogp.dropdown();
		hrmlogp.hRmLogout();
		
		
		
		//driver.close();
	}

}
