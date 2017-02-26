package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class EnterTimeTrackPage extends BasePage {
	

	@FindBy(id="logoutLink")
	private WebElement logoutlink;
	
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
	}

	
	public void ClickLogout(){
		logoutlink.click();
	}
}


