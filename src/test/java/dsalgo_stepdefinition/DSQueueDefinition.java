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

public class DSQueueDefinition {
	
	QueuePage queuepg=new QueuePage();
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	
	@When("The user clicks on Queue Get Started button")
	public void user_clicks_on_queue_get_started_button() {
		wait.until(ExpectedConditions.visibilityOf(queuepg.queue_getStarted));
		Assert.assertEquals(true, queuepg.queue_getStarted.isDisplayed());
		Assert.assertEquals(queuepg.queue_getStarted.getText(),"Get Started");
		queuepg.queue_getStarted.click();
		LoggerLoad.info("Clicked the Queue Page get started button");
	    
	}
	@When("The user clicks Queue Practice Questions link")
	public void the_user_clicks_queue_practice_questions_link() {
		Assert.assertEquals(true,queuepg.queuePractice.isDisplayed());
		queuepg.queuePractice.click();
	    LoggerLoad.info("Clicked the Queue practice link");
	}
	
	
	
}
