package dsalgo_stepdefinition;



import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgoHooks.DSalgoHooks;
import dsalgoPOM.ArrayPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.LoggerLoad;
import dsutilities.TestDataReadingWriting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSalgoArrayStepDefinition {
	
	HomePage hp=new HomePage();
	DSalgoHooks dsHooks= new DSalgoHooks();
	TreePage treePg=new TreePage();
	ArrayPage arrayPg=new ArrayPage();
	TestDataReadingWriting testData=new TestDataReadingWriting();
	String array_page;
	Actions action =new Actions(DriverManager.getDriver());
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

@When("The could see the number of links to practice")
public void the_could_see_the_number_of_links_to_practice() {
	System.out.println("There are " +arrayPg.practiceLinks.size()+" Practice links :");
	LoggerLoad.info("There are " +arrayPg.practiceLinks.size()+" Practice links : " );
	for (int i = 0; i < arrayPg.practiceLinks.size(); i++) {
	System.out.println(arrayPg.practiceLinks.get(i).getText());
}
}

@When("The User clicks on each links to Practice the code in tryEditor with a Submit button to test")
public void the_user_clicks_on_each_links_to_practice_the_code_in_try_editor_with_a_submit_button_to_test() {
	System.out.println(arrayPg.practiceLinks.size());
	for (int i = 0; i < arrayPg.practiceLinks.size()-1; i++) {
		System.out.println(arrayPg.practiceLinks.get(i).getText());
		
		arrayPg.questionclick(arrayPg.practiceLinks.get(i).getText());
		wait.until(ExpectedConditions.visibilityOf(arrayPg.submitBtn));
		Assert.assertEquals(true, arrayPg.submitBtn.isDisplayed());
		arrayPg.submitBtn.click();
		LoggerLoad.info(arrayPg.output.getText());
		wait.until(ExpectedConditions.visibilityOf(arrayPg.output));
		Assert.assertTrue(arrayPg.output.getText().contains("Error"));
		arrayPg.Texteditor1.click();
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
		testData.usingExcelSheetForTestData();
		arrayPg.runBtn.click();
		//wait.until(ExpectedConditions.visibilityOf(arrayPg.output));
		System.out.println("The output is :" +arrayPg.output.getText());
		LoggerLoad.info("The output is :" +arrayPg.output.getText());
		Assert.assertTrue(arrayPg.output.getText().contains("64 is Number is Not Found"));
		DriverManager.getDriver().navigate().back();
		wait.until(ExpectedConditions.visibilityOf(arrayPg.practiceLinks.get(i)));
		
	}
}

}

