package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/Documents/BrokenLinks.html");
List<WebElement>elements=driver.findElements(By.tagName("a"));
for(WebElement e:elements)
{
	URL u=new URL(e.getAttribute("href"));
	HttpURLConnection connection=(HttpURLConnection)u.openConnection();
	int response=connection.getResponseCode();
	System.out.println(response);
	if(response==200)
	{
		System.out.println("link is not broken "+response);
		System.out.println(connection.getResponseMessage());
	}
	else
	{
		System.out.println("link is broken and code is "+response);
		System.out.println(connection.getResponseMessage());
	}
}

		

	}

}
