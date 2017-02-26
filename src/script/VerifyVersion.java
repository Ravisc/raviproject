package script;

import org.testng.annotations.Test;

import pom.LoginPage;
import generic.BaseTest;

public class VerifyVersion extends BaseTest{

	@Test
	
	public void testVerifyVersion(){
		
		LoginPage l = new LoginPage(driver);
		l.VerifyVersion("actiTIME 2015.2");
	}
}
