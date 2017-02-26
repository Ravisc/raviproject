package script;

import generic.BaseTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testdemo extends BaseTest {
	@Test
	public void demo(){
		Reporter.log("hi",true);
	}

}
