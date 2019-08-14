import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrmLogutPOMPAGE {
	
	@FindBy(xpath="//a[text()='Welcome Admin']")
	private WebElement dropdown;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogOut;
	 public HrmLogutPOMPAGE(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		  }
	 
	 public void dropdown()
	 {
		 dropdown.click();
	 }
	public void hRmLogout()
	{
		LogOut.click();
	}

}
