package dsalgo_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoPOM.HomePage;
import dsalgoPOM.LinkListPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSLinkedListStepDefinition {
	
	LinkListPage linkedpg=new LinkListPage();
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	
	@When("The user clicks on LinkedList Get Started button")
	public void user_clicks_on_linkedlist_get_started_button() {
		wait.until(ExpectedConditions.visibilityOf(linkedpg.linked_getStarted));
		Assert.assertEquals(true, linkedpg.linked_getStarted.isDisplayed());
		Assert.assertEquals(linkedpg.linked_getStarted.getText(),"Get Started");
		linkedpg.linked_getStarted.click();
		LoggerLoad.info("Clicked the Linked List Page get started button");
	}
	
	@When("The user clicks LinkedList Practice Questions link")
	public void the_user_clicks_linkedlist_practice_questions_link() {
		Assert.assertEquals(true,linkedpg.linkedPractice.isDisplayed());
	   linkedpg.linkedPractice.click();
	    LoggerLoad.info("Clicked the Linked List practice link");
	}
	
}
