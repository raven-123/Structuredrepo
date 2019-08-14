import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateOtpion {

	public static void main(String[] args) {
		int count=0;
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/Users/Ravi/Documents/select.html");
		WebElement wb = driver.findElement(By.id("sss"));
		Select sel = new Select(wb);
		List<WebElement> listofElements = sel.getOptions();
		ArrayList a = new ArrayList();		
		
		String array[]=new String[a.size()];
		System.out.println("list of options " + listofElements.size());

		for (int i = 0; i < listofElements.size(); i++) {
			a.add((listofElements.get(i).getText()));
		}
		Collections.sort(a);     //sorting list of elements
		System.out.println(a);    //printing sorted elements/options
		
		for(int g=0;g<a.size();g++)
		{
		array[g]=	(String) a.get(g);                          //  converting array list elements to string array for content comparison
		}
		
		System.out.println(array);
		
		
//		for(int k=0;k<a.size();k++)
//		{
//			for(int f=k+1;f<a.size();f++)
//			{
//				if(a.get(k).equals(a.get(f)))
//					
//				{
//					System.out.println("duplicate element is "+a.get(k));
//					count++;
//				}
//				
//			}
//		}

	}

}
