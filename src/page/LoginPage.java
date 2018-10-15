package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	final String u="txtUsername";
	@FindBy(id=u)
    private WebElement unTB;
	
	final String p="txtPassword";
	@FindBy(name=p)
    private WebElement pwTB;
	
	final String log="btnLogin";
	@FindBy(id=log)
    private WebElement lb;
	
public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}

public	void setUN(String un) 
    {
		unTB.sendKeys(un);
	}

public	void setUPw(String pw)
    {
	pwTB.sendKeys(pw);
    }
	
public void clicklogin()
	{
		lb.click(); 
        
	}
}
