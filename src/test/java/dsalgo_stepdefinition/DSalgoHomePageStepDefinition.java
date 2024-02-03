package dsalgo_stepdefinition;



import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import dsalgoHooks.DSalgoHooks;
import dsalgoPOM.HomePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.CommonUtilMethods;
import dsutilities.LoggerLoad;
import dsutilities.TestDataReadingWriting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoHomePageStepDefinition {
	
	
	HomePage hp=new HomePage();
	DSalgoHooks dsHooks= new DSalgoHooks();
	TreePage treePg=new TreePage();
	TestDataReadingWriting testData=new TestDataReadingWriting();
	CommonUtilMethods commonUtil=new CommonUtilMethods();
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
	//HomePage//sigin
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		System.out.println("Hello");
		wait.until(ExpectedConditions.visibilityOf(hp.getSignin_link()));
		Assert.assertEquals(true, hp.getSignin_link().isDisplayed());
		LoggerLoad.info("Inside Home Page");
		
	}

	@When("The user clicks {string} drop down")
	public void the_user_clicks_drop_down(String string) {
		LoggerLoad.info("Inside HomePage");
		Assert.assertEquals(true, hp.getDS_link().isDisplayed());
		hp.getDS_link().click();
	}

	@Then("I shouls see {int} different data structure entries in that dropdown")
	public void i_shouls_see_different_data_structure_entries_in_that_dropdown(Integer int1) {
		System.out.println("The number of entries present is - "+hp.getDs_dropdown_entries().size());
		System.out.println("The number of entries present is - "+int1);
		Integer a=hp.getDs_dropdown_entries().size();
		Assert.assertEquals(a.toString(),int1.toString());
//		Assert.assertEquals(HomePage.ds_dropdown_entries.size(),"6");
	}

	@Then("The user clicks any of the {string} buttons below the data structures")
	public void the_user_clicks_any_of_the_get_started_buttons_below_the_data_structures(String string) {
		hp.getGet_started().click();
		wait.until(ExpectedConditions.visibilityOf(hp.getAlert_message()));
	}

	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String alertMsg) {
		Assert.assertEquals(hp.getAlert_message().getText(), "You are not logged in");
		LoggerLoad.info("The alert message - " +hp.getAlert_message().getText());
		
	}

	@When("The user selects any data structures item from the drop down without Sign in.")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
		hp.getDS_link().click();
		hp.getDs_dropdown_entries().get(1).click();
		LoggerLoad.info("The User selected random data");
	}
}
