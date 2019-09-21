package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BasePage;

public class HomePage extends BasePage {
	// Initialization:----------------------------------------
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// OR:----------------------------------------------------
	@FindBy(xpath="//a[@href='/logout.do'][contains(.,'Logout')]")
	WebElement logOut;
	
	





	// Actions:-----------------------------------------------
	public String verify_login_homePage_title() {
		return driver. getTitle();
	}
	
	public boolean verify_logout_button_visibility() {
		return logOut.isDisplayed();
	}
	
	
}
