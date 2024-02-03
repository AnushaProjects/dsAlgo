package dsalgo_stepdefinition;



import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoHooks.DSalgoHooks;
import dsalgoPOM.ArrayPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoArrayStepDefinition {
	
	HomePage hp=new HomePage();
	DSalgoHooks dsHooks= new DSalgoHooks();
	TreePage treePg=new TreePage();
	ArrayPage arrayPg=new ArrayPage();
	String array_page;
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	
@When("The user clicks on Array Get Started button")
public void user_clicks_on_array_get_started_button() {
	wait.until(ExpectedConditions.visibilityOf(arrayPg.Getstarted));
	Assert.assertEquals(true, arrayPg.Getstarted.isDisplayed());
	arrayPg.Getstarted.click();
	LoggerLoad.info("Clicked the Array Page get started button");
    
}
@When("The user clicks Array Practice Questions link")
public void the_user_clicks_array_practice_questions_link() {
	Assert.assertEquals(true, arrayPg.arrayPractice.isDisplayed());
   arrayPg.arrayPractice.click();
    LoggerLoad.info("Clicked the Array practice link");
}

}



