package stepDefinitions;

import org.testng.Assert;
import org.testng.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.BasePage;

public class LoginStepDefinition extends BasePage {
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^Open browser and navigate to url$")
	public void open_browser_and_navigate_to_url() throws Throwable {
	    BasePage.initialization();
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
		loginPage = new LoginPage();
	   String loginTitle = loginPage.verify_login_page_title();
	   Assert.assertEquals(loginTitle, "actiTIME - Login", "Login page title not matched");
	   Reporter.log("Login page title not matched", true);
	   homePage = loginPage.verify_login_with_valid_credentials(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	   String homeTile = homePage.verify_login_homePage_title();
	   Assert.assertEquals(homeTile, "actiTIME - Enter Time-Track", "Homepage title not matched");
	   Reporter.log("Homepage title matched", true);
	   boolean logOutBtn = homePage.verify_logout_button_visibility();
	   Assert.assertTrue(logOutBtn, "Logout button not displayed and login in unsuccessful");
	   Reporter.log("Logout button displayed and login in successful", true);
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	   driver.quit();
	}

	
	
}
