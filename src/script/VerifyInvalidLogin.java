package script;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.LoginPage;
import generic.BasePage;
import generic.BaseTest;

public class VerifyInvalidLogin extends BaseTest{


	@Test
	
	public void testVerifyInvalidLogin(){
		
		SoftAssert s = new SoftAssert();
		 // enter invalid username
		LoginPage l = new LoginPage(driver);
		
		l.SetUserName("abc");
		
		//enter invalid password
		
		l.SetPassword("xyz");
		
		//click on login
		
		l.ClickLogin();
		
		// verify err msg is displayed
		
		l.VerifyErrIsPresent(s);
		
		s.assertAll();
	}

}
