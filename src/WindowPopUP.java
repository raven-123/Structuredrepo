import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUP {

	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/");
Set<String> windows=driver.getWindowHandles();
System.out.println("before removing parent window "+windows.size());

String parent= driver.getWindowHandle();

windows.remove(parent);    //removing parent window

System.out.println("after removing parent window "+windows.size()); //after removing parent window

driver.close();      

System.out.println("parent window closed");

for(String ss:windows)
{
	System.out.println(driver.switchTo().window(ss).getTitle());
	driver.close();
	
}


	}

}
