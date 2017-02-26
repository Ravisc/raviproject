package script;

import org.testng.annotations.Test;

import pom.LoginPage;
import generic.BaseTest;

public class VerifyLoginPage extends BaseTest{

	@Test
	
	public void testVerifyLoginPage(){
		//verify loginpage is displayed
		
		LoginPage l = new LoginPage(driver);
		l.VerifyTitle("actiTIME -  Login");
	}
	
	
}
