import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginPOMPage {
	
	@FindBy(id="txtUsername")
	private WebElement USErName;
	
	@FindBy(xpath="//input[@name='txtPassword']")
	private WebElement PassWORD;
	
	@FindBy(xpath="//div[@id='divLoginButton']/input[@id='btnLogin']")
	private WebElement LoginButton;

	
 public HRMLoginPOMPage(WebDriver driver) {
PageFactory.initElements(driver, this);
 }
 public void detailsInput(String username ,String Pwd)
 {
	 USErName.sendKeys(username);
	 PassWORD.sendKeys(Pwd);
	LoginButton.click();
 }
  

}
