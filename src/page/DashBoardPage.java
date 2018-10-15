package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	@FindBy(id="welcome")
	private WebElement welcome;
	
	@FindBy(linkText="Logout")
public WebElement logout;
	
public DashBoardPage(WebDriver driver)
{
    PageFactory.initElements(driver, this);
}

public void clickWelcome()
{
	welcome.click();
}
public void clickLogout()
{
	logout.click();
}
}
