package dsalgo_stepdefinition;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.LoggerLoad;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsalgoRegisterStepDefinition{

	
	HomePage hp=new HomePage();
	RegisterationLoginPage register=new RegisterationLoginPage();
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));

//Register
@When("The user clicks {string}")
public void the_user_clicks(String link) {
	//System.out.println("inside page");
	if(link.equals("Register")) {
		Assert.assertEquals(true,hp.getRegister_link().isDisplayed());
		hp.getRegister_link().click();
		LoggerLoad.info("User clicked on Register");
	}
	else if(link.equals("Sign in")) {
		Assert.assertEquals(true,hp.getSignin_link().isDisplayed());
		hp.getSignin_link().click();
		LoggerLoad.info("User clicked on Sign in");
	}
	else if(link.equals("Sign out")) {
		Assert.assertEquals(true,hp.getSignout_link().isDisplayed());
		hp.getSignout_link().click();
		LoggerLoad.info("User clicked on signout");
	}
	
}

@Then("The user should be redirected to Register form")
public void the_user_should_be_redirected_to_register_form() {
	wait.until(ExpectedConditions.visibilityOf(register.password1));
	Assert.assertEquals(true,register.password1.isDisplayed());
	System.out.println("User redirected to Register form ");
	LoggerLoad.info("User redirected to Register form ");
}

@When("The user clicks {string} button with all fields empty")
public void the_user_clicks_button_with_all_fields_empty(String string) {
	LoggerLoad.info("Inside register page");
	Assert.assertEquals(true,register.submit_btn.isDisplayed());
	register.submit_btn.click();
}

@Then("It should display an error {string} below Username textbox")
public void it_should_display_an_error_below_username_textbox(String string) {
  System.out.println(string);
}

@When("The user clicks {string} button after entering Username with other fields empty")
public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string) {
	LoggerLoad.info("Entering the Username and Submiting");
	register.username1.sendKeys("sample");
	register.submit_btn.click();
}

@Then("It should display an error {string} below Password textbox")
public void it_should_display_an_error_below_password_textbox(String string) {
	System.out.println(string);
	LoggerLoad.info(string);
}

@When("The user clicks {string} button after entering Username and password with Password Confirmation field empty")
public void the_user_clicks_button_after_entering_username_and_password_with_password_confirmation_field_empty(String string) {
	register.password1.sendKeys("sample");
	register.submit_btn.click();
   
}

@Then("It should display an error {string} below Password Confirmation textbox")
public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
	System.out.println(string);
}



@Then("It should display an error message {string}")
public void it_should_display_an_error_message(String errorMsg) {
	if (errorMsg.equals("Invalid Username and Password")) {
		Assert.assertEquals(hp.getAlert_message().getText(),"Invalid Username and Password");
		LoggerLoad.info(hp.getAlert_message().getText());
	}
	else {
		System.out.println(errorMsg);
		 LoggerLoad.info(errorMsg);
	}
		
	
//	if (HomePage.alert_message.isDisplayed()) {
	 
	
 
}

@When("The user clicks {string} button after entering {string} {string} in username and password field and different password in Password Confirmation fields")
public void the_user_clicks_button_after_entering_in_username_and_password_field_and_different_password_in_password_confirmation_fields(String string, String userName, String passwordReg) {
	register.username1.sendKeys(userName);
	register.password1.sendKeys(passwordReg);
	register.password2.sendKeys("12345");
	register.submit_btn.click();
}
@When("The user clicks {string} button after entering {string} and {string} in text fields")
public void the_user_clicks_button_after_entering_and_in_text_fields(String string, String userName, String passwordReg) {
	register.username1.clear();
	register.password1.clear();
	register.username1.sendKeys(userName);
	register.password1.sendKeys(passwordReg);
	register.password2.sendKeys(passwordReg);
	register.submit_btn.click();
 
}

@Then("It should redirected to homepage.")
public void it_should_redirected_to_homepage() {
 System.out.println("Redirected to HomePage");
 wait.until(ExpectedConditions.visibilityOf(hp.getSignout_link()));
 
}



}
