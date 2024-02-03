package dsalgo_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoHooks.DSalgoHooks;
import dsalgoPOM.Datastructures;
import dsalgoPOM.HomePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.LoggerLoad;
import dsutilities.TestDataReadingWriting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoDataStructuresDefinition {
	
	
	HomePage hp=new HomePage();
	DSalgoHooks dsHooks= new DSalgoHooks();
	TreePage treePg=new TreePage();
	Datastructures dsPg=new Datastructures();
	TestDataReadingWriting testData=new TestDataReadingWriting();
	
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	Actions action =new Actions(DriverManager.getDriver());
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	@When("The user clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		Assert.assertEquals(true, dsPg.getstarted.isDisplayed());
		dsPg.getstarted.click();
		LoggerLoad.info("Clicked the DSIntroduction get started button");
	}
	
	@When("The user clicks DS Practice Questions link")
	public void the_user_clicks_ds_practice_questions_link() {
		Assert.assertEquals(true, dsPg.dsPractice.isDisplayed());
	    dsPg.dsPractice.click();
	    LoggerLoad.info("Clicked the DS practice link");
	}
	
}
