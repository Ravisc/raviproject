package script;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;
import generic.BaseTest;

public class VerifyLoginLogout extends BaseTest{

	@Test
	
	public void testVerifyLoginLogout(){
		
		//enter valid username
	LoginPage l = new LoginPage(driver);
	
	l.SetUserName("admin");
	
	//enter valid password
	
	l.SetPassword("manager");
	
	//click on login
	
	l.ClickLogin();
	
	// verify home page is displayed
	
	EnterTimeTrackPage et = new EnterTimeTrackPage(driver);
	et.VerifyTitle("actiTIME -  Enter Time-Track");
	
	//click on logout
	
		et.ClickLogout();
		
		// verify login page displayed
		l.VerifyTitle("actiTIME -  Login");
	}
}
