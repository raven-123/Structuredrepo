import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPage {
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement unPWD;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;
	
	public POMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String username)
	{
		unTB.sendKeys(username);
	}
public void setPwd(String password)
{
	unPWD.sendKeys(password);
}

public void ClickLogin()
{
	loginButton.click();
}
}
