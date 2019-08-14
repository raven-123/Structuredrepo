import static org.testng.Assert.expectThrows;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ULLL {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		WebElement wv=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		wv.click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(wv));
//	WebElement Sale=	driver.findElement(By.xpath("//div[@class='navigation_wrapper']/nav/div/ul/li/span[contains(text(),'Sale')]")); 
//	Sale.click();	
		
	List<WebElement> Categoriestab=driver.findElements(By.xpath("//div[@class='navigation_wrapper']/nav/div/ul/li/span"));  //total 10 items in menu bar
	System.out.println("size of the categories menu "+Categoriestab.size());
	
//	for(WebElement wb:Categoriestab)
//	{
//		wait.until(ExpectedConditions.visibilityOfAllElements(wb));
//		System.out.println(" main menu Category  "+wb.getText());
//		String menu;
//		Actions act=new Actions(driver);
//		act.moveToElement(wb).perform();
//
//	}
//	
WebElement wx1=	driver.findElement(By.xpath("//div[@class='navigation_wrapper']/nav/div/ul/li/span[contains(text(),'Living')]"));

	Actions act=new Actions(driver);
	System.out.println("performing");
	act.moveToElement(wx1).click().perform();
	
	//driver.findElement(By.xpath("//div[@class='navigation_wrapper']/nav/div/ul/li/span[contains(text(),'Living')]/../../../ul/li/div/div/ul/li/div/a"));

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//List<WebElement>SaleMenu=driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/div/div/ul/li/ul/li"));
//List<WebElement>SaleMenu=driver.findElements(By.xpath("//li[@class='topnav_item saleunit']/div/div/ul/li/ul/li/a"));
//System.out.println(SaleMenu.size());

//wait.until(ExpectedConditions.visibilityOfAllElements(SaleMenu));


//for(int i=0;i<SaleMenu.size();i++)
//{
//	wait.until(ExpectedConditions.visibilityOfAllElements(SaleMenu));
//
//	System.out.println(SaleMenu.get(i).getText());
//	
//}	


	
	
	
//	for(int k=0;k<Categoriestab.size();k++)
//	{
//		int i=1;
//		//driver.findElement(By.xpath("//div[@class='navigation_wrapper']/nav/div/ul/li[]/span")).getText();
//		Thread.sleep(3000);
//		Categoriestab.get(k).getText();
//	}
//		
//List<WebElement> SaleMenu=driver.findElements(By.xpath("li[@class='topnav_item saleunit']/div/div/ul/li/ul/li")); 
//System.out.println(SaleMenu.size());
//for(int i=0;i<SaleMenu.size();i++)
//{
//	SaleMenu.get(i).getText();
//}

	}

}
