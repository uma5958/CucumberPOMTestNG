package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BasePage;

public class LoginPage extends BasePage {
	// Initialization:----------------------------------------
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// OR:----------------------------------------------------
	@FindBy(xpath="//input[contains(@id,'username')]")
	WebElement userName;
	
	@FindBy(xpath="//input[contains(@name,'pwd')]")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginBtn;
	
	
	
	
	
	
	
	// Actions:-----------------------------------------------
	public String verify_login_page_title() {
		return driver. getTitle();
	}
	
	public HomePage verify_login_with_valid_credentials(String un, String pw) throws Exception {
		userName.sendKeys(un);
		password.sendKeys(pw);
		loginBtn.click();
		Thread.sleep(2000);
		return new HomePage();
	}
	
	
	
	
	
	
	
	
}
