package script;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import generic.WebGeneric;
import page.DashBoardPage;
import page.LoginPage;
public class OrangeTC1 extends BaseTest {
	@Test(priority=1,groups= {"smoke"})
	public void testOrangeTC1() 
	{
		String un=Utility.getXLData(DATA_PATH,"sheet1",1,0);
		String pwd=Utility.getXLData(DATA_PATH,"sheet1",1,1);
		String dbpURL=Utility.getXLData(DATA_PATH,"sheet1",1,2);
		String lpURL=Utility.getXLData(DATA_PATH,"sheet1",1,3);
		
		//Enter the valid username and password and click login
		LoginPage l=new LoginPage(driver);
		l.setUN(un);
		l.setUPw(pwd);
		l.clicklogin();
		
		//verify that DB Page is displayed
		WebGeneric.verifyPageIsDisplayed(driver, lngETO, dbpURL);
		
		//Click welcome->logut
		DashBoardPage d=new DashBoardPage(driver);
		d.clickWelcome();
		d.clickLogout();
		
		//verify that Login Page is Displayed
		WebGeneric.verifyPageIsDisplayed(driver, lngITO, lpURL);
	}

}
