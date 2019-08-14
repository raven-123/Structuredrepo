import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragNDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
 WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Actions act=new Actions(driver);
	WebElement draggable=	driver.findElement(By.id("draggable"));
	WebElement dropatarget=driver.findElement(By.id("droppable"));	
	act.dragAndDrop(draggable, dropatarget).build().perform();
	
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Slider']")).click();
	driver.switchTo().frame("slider");
	
	WebElement slider=driver.findElement(By.xpath("//div[@id='slider']/span"));
	
act.clickAndHold(slider);//.moveByOffset(0, 32);  //need to complete the program
	}

}
