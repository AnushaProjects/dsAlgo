package dsalgo_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import dsalgoHooks.DSalgoHooks;
import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import dsutilities.TestDataReadingWriting;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSAlgoSignInStepDefinition {
	
	
	HomePage hp=new HomePage();
	RegisterationLoginPage register=new RegisterationLoginPage();
	DSalgoHooks dsHooks= new DSalgoHooks();
	TreePage treePg=new TreePage();
	TestDataReadingWriting testData=new TestDataReadingWriting();
	
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	Actions action =new Actions(DriverManager.getDriver());
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	@Then("The user land on Login Page")
	public void the_user_land_on_login_page() {
		wait.until(ExpectedConditions.visibilityOf(register.password));
		Assert.assertEquals(true,register.password.isDisplayed() );
		System.out.println("Inside Login Page");
		LoggerLoad.info("Inside Login Page");
	}

	@When("The user clicks {string} button with {string} Username and password fields empty")
	public void the_user_clicks_button_with_username_and_password_fields_empty(String string, String loginUsername) {
		register.username.sendKeys(loginUsername);
		Assert.assertEquals(true,register.submit_btn.isDisplayed() );
		register.submit_btn.click();
	}

	@When("The user clicks {string} button after entering {string} and {string} in username and password fields")
	public void the_user_clicks_button_after_entering_and_in_username_and_password_fields(String string, String invalidUsr, String invalidPwd) {
		register.username.clear();
		register.username.sendKeys(invalidUsr);
		register.password.sendKeys(invalidPwd);
		register.submit_btn.click();
	  
	}

	@When("The user clicks {string} button after entering ValidUsername and ValidPassword in username and password fields")
	public void the_user_clicks_button_after_entering_in_username_and_password_fields(String string) {
		register.username.sendKeys(DsalgoVariables.username);
		register.password.sendKeys(DsalgoVariables.password);
		register.submit_btn.click();
	}


}
