package dsalgo_stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoPOM.HomePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSTreeStepDefinition {
	
	
	HomePage hp=new HomePage();
	TreePage treePg=new TreePage();
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	@When("The user clicks the {string} button in Tree Pane or select Tree item from the drop down menu")
	public void the_user_clicks_the_button_in_tree_pane_or_select_tree_item_from_the_drop_down_menu(String getStarted) {
	   
		if(getStarted.equals("Tree Getting Started")) {
			LoggerLoad.info("Checking for Tree GetStarted Button");
			wait.until(ExpectedConditions.visibilityOf(treePg.tree_getStarted));
	    	Assert.assertEquals(true,treePg.tree_getStarted.isDisplayed());
	    	treePg.tree_getStarted.click();
		   LoggerLoad.info("Clicked on Get started of Tree");
	   }
		
	}
	@Given("The user is in the Tree page after logged in")
	public void the_user_is_in_the_tree_page_after_logged_in() {
		System.out.println(DsalgoVariables.tree_main_page);
		LoggerLoad.info("The URL captured from Tree main Page"+DsalgoVariables.tree_main_page);
		DriverManager.getDriver().navigate().to(DsalgoVariables.tree_main_page);
	    wait.until(ExpectedConditions.visibilityOf(treePg.tree_page));
	}


	
}
