package dsalgo_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoPOM.GraphPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.QueuePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSGraphStepDefinition {
	
	
	GraphPage graphpg=new GraphPage();
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	
	@When("The user clicks on Graph Get Started button")
	public void user_clicks_on_graph_get_started_button() {
		wait.until(ExpectedConditions.visibilityOf(graphpg.graph_getStarted));
		Assert.assertEquals(true, graphpg.graph_getStarted.isDisplayed());
		Assert.assertEquals(graphpg.graph_getStarted.getText(),"Get Started");
		graphpg.graph_getStarted.click();
		LoggerLoad.info("Clicked the Graph Page get started button");
	    
	}
	@When("The user clicks Graph Practice Questions link")
	public void the_user_clicks_graph_practice_questions_link() {
		Assert.assertEquals(true,graphpg.graphPractice.isDisplayed());
		graphpg.graphPractice.click();
	    LoggerLoad.info("Clicked the Graph practice link");
	}
	
}
