import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotifcationpopups {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(co);
driver.manage().deleteAllCookies();
driver.get("https://www.irctc.co.in/nget/train-search");

	}

}


//FirefoxOptions options=new FirefoxOptions();  for firefox
//options.addPreference("geo.disable",true);
//WebDriver drivber=new FirefoxDriver(options);
