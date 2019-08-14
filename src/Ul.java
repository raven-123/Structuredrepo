import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ul {
	static {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();  //closing the tab
		List<WebElement> lst=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li/span"));
		for(WebElement wb:lst) {
			System.out.println(wb.getText());
			String compare1=wb.getText();
			Actions act=new Actions(driver);
			act.moveToElement(wb).perform();				
			List<WebElement>lst2=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li/span[contains(text(),'"+compare1+"')]/../div/div/ul/li"));
			System.out.println(lst2.size());
//			for(int i=0;i<lst2.size();i++)
//			{
//			System.out.println(lst2.get(i).getText());
//			}
		}
	}

}
