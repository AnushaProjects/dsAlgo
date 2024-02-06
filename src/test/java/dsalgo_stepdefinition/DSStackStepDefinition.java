package dsalgo_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoPOM.HomePage;
import dsalgoPOM.QueuePage;
import dsalgoPOM.StackPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSStackStepDefinition {
	
	
	StackPage stackpg=new StackPage();
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	
	@When("The user clicks on Stack Get Started button")
	public void user_clicks_on_stack_get_started_button() {
		wait.until(ExpectedConditions.visibilityOf(stackpg.stack_getStarted));
		Assert.assertEquals(true, stackpg.stack_getStarted.isDisplayed());
		Assert.assertEquals(stackpg.stack_getStarted.getText(),"Get Started");
		stackpg.stack_getStarted.click();
		LoggerLoad.info("Clicked the Stack Page get started button");
	    
	}
	@When("The user clicks Stack Practice Questions link")
	public void the_user_clicks_stack_practice_questions_link() {
		Assert.assertEquals(true, stackpg.stackPractice.isDisplayed());
		stackpg.stackPractice.click();
	    LoggerLoad.info("Clicked the Stack practice link");
	}

	
}
