import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POMFlipImaGES {
	@FindBys({@FindBy(xpath="//img")})
	List<WebElement> images;
	
	public POMFlipImaGES(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void count()
	{
		System.out.println(images.size());
	}

}
