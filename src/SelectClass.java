import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/Users/Ravi/Documents/select.html");
		WebElement wb = driver.findElement(By.id("sss"));
		Select sel = new Select(wb);
		List<WebElement> listofElements = sel.getOptions();
		// Collections.sort( listofElements);
		ArrayList a = new ArrayList();
		System.out.println("list of options " + listofElements.size());

		for (int i = 0; i < listofElements.size(); i++) {
			a.add((listofElements.get(i).getText()));
		}
		
		System.out.println("before sorting "+a);
		Collections.sort(a);
		System.out.println("after sorting "+a);
		
		//
		// sel.selectByIndex(2);
		// System.out.println("*******************************");
		// WebElement text=sel.getFirstSelectedOption();
		// System.out.println(text.getText());
		//

	}

}
