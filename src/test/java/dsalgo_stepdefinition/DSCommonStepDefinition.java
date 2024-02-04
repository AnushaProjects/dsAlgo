package dsalgo_stepdefinition;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import dsalgoHooks.DSalgoHooks;
import dsalgoPOM.ArrayPage;
import dsalgoPOM.CommonPOM;
import dsalgoPOM.Datastructures;
import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.CommonUtilMethods;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import dsutilities.TestDataReadingWriting;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSCommonStepDefinition {
	
	
	HomePage hp=new HomePage();
	DSalgoHooks dsHooks= new DSalgoHooks();
	TreePage treePg=new TreePage();
	CommonPOM commonPg=new CommonPOM();
	Datastructures dsPg=new Datastructures();
	ArrayPage arrayPg=new ArrayPage();
	RegisterationLoginPage register=new RegisterationLoginPage();
	TestDataReadingWriting testData=new TestDataReadingWriting();
	CommonUtilMethods commonUtil=new CommonUtilMethods();
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	Actions action =new Actions(DriverManager.getDriver());
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	

@Given("The user is in the Home page after logged in")
public void the_user_is_in_the_home_page_after_logged_in() throws IOException {
	LoggerLoad.info("The user is in the Home page after logged in");
	wait.until(ExpectedConditions.visibilityOf(hp.getSignin_link()));
	commonUtil.Login();
	wait.until(ExpectedConditions.visibilityOf(hp.getSignout_link()));
}




@Then("The user should be directed to {string} Page")
public void the_user_should_be_directed_to_page(String new_page) {
	if(new_page.equals("Tree")) {
		wait.until(ExpectedConditions.visibilityOf(treePg.tree_page));
		System.out.println("User directed to Tree Page");
		LoggerLoad.info("User directed to Tree Page");
		DsalgoVariables.tree_main_page=DriverManager.getDriver().getCurrentUrl();
		System.out.println(DsalgoVariables.tree_main_page);
		Assert.assertEquals(DsalgoVariables.tree_main_page, "https://dsportalapp.herokuapp.com/tree/");
		LoggerLoad.info("Landed on to Tree Page - " +DsalgoVariables.tree_main_page);
		
	}
	if(new_page.equals("DataStructure")) {
		wait.until(ExpectedConditions.visibilityOf(dsPg.ds_page));
		System.out.println("User directed to DataStructure Introduction Page");
		LoggerLoad.info("User directed to DataStructure Introduction Page");	
	}
	if(new_page.equals("Array")) {
		wait.until(ExpectedConditions.visibilityOf(arrayPg.array_page));
		System.out.println("User directed to Array Page");
		LoggerLoad.info("User directed to Array Page");	
	}
	
	else if (new_page.equals("Overview of Trees")) {
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Overview of Trees")));
		System.out.println("User directed to OverviewTree Page");
		LoggerLoad.info("User directed to OverviewTree Page");
	}
	else if (new_page.equals("Terminologies")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Terminologies")));
		System.out.println("User directed to Terminologies Page");
		LoggerLoad.info("User directed to Terminologies Page");
	}
	else if (new_page.equals("Types of Trees")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Types of Trees")));
		System.out.println("User directed to Types of Trees Page");
		LoggerLoad.info("User directed to Types of Trees Page");
	}
	else if (new_page.equals("Tree Traversals")) {
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Tree Traversals")));
		System.out.println("User directed to Tree Traversals Page");
		LoggerLoad.info("User directed to Tree Traversals Page");
	}
	else if (new_page.equals("Traversals-Illustration")) {
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Traversals-Illustration")));
		System.out.println("User directed to Traversals-Illustration Page");
		LoggerLoad.info("User directed to Traversals-Illustration Page");
	}
	else if (new_page.equals("Binary Trees")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Binary Trees")));
		System.out.println("User directed to Binary Trees Page");
		LoggerLoad.info("User directed to Binary Trees Page");
	}
	else if (new_page.equals("Types of Binary Trees")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Types of Binary Trees")));
		System.out.println("User directed to Types of Binary Trees Page");
		LoggerLoad.info("User directed to Types of Binary Trees Page");
	}
	else if (new_page.equals("Implementation in Python")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Implementation in Python")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation in Python Page");
		LoggerLoad.info("User directed to Implementation in Python Page");
	}
	else if (new_page.equals("Binary Tree Traversals")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Binary Tree Traversals")));
		System.out.println("User directed to Binary Tree Traversals Page");
		LoggerLoad.info("User directed to Binary Tree Traversals Page");
	}
	else if (new_page.equals("Implementation of Binary Trees")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Implementation of Binary Trees")));
		js.executeScript("window.scrollBy(0,450)", "");
		System.out.println("User directed to Implementation of Binary Trees Page");
		LoggerLoad.info("User directed to Implementation of Binary Trees Page");
	}
	else if (new_page.equals("Applications of Binary trees")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Applications of Binary trees")));
		System.out.println("User directed to Applications of Binary trees Page");
		LoggerLoad.info("User directed to Applications of Binary trees Page");
	}
	else if (new_page.equals("Binary Search Trees")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Binary Search Trees")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Binary Search Trees Page");
		LoggerLoad.info("User directed to Binary Search Trees Page");
	}
	else if (new_page.equals("Implementation Of BST")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Implementation Of BST")));
		System.out.println("User directed to Implementation Of BST Page");
		LoggerLoad.info("User directed to Implementation Of BST Page");
	}
	else if (new_page.equals("Time complexity")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Time complexity")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Time complexity Page");
		LoggerLoad.info("User directed to Time complexity Page");
	}
	else if (new_page.equals("Arrays in Python")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Arrays in Python")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Arrays in Python Page");
		LoggerLoad.info("User directed to Arrays in Python");
	}
	else if (new_page.equals("Arrays Using List")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Arrays Using List")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Arrays Using List Page");
		LoggerLoad.info("User directed to Arrays Using List");
	}
	else if (new_page.equals("Basic Operations in Lists")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Basic Operations in Lists")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Basic Operations in Lists Page");
		LoggerLoad.info("User directed to Basic Operations in Lists");
	}
	else if (new_page.equals("Applications of Array")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Applications of Array")));
		
		System.out.println("User directed to Applications of Array Page");
		LoggerLoad.info("User directed to Applications of Array");
	}
	
    
}

@When("The user clicks {string} link")
public void the_user_clicks_link(String common_link) {
    if(common_link.equals("Overview of Trees")) {
    	commonPg.commonxpathclick("overview-of-trees");
    	System.out.println(DsalgoVariables.linkValidation);
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
    }
   
    else if (common_link.equals("Terminologies")) {
    	commonPg.commonxpathclick("terminologies");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Types of Trees")) {
    	commonPg.commonxpathclick("types-of-trees");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Tree Traversals")) {
    	commonPg.commonxpathclick("tree-traversals");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Traversals-Illustration")) {
    	commonPg.commonxpathclick("traversals-illustration");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Binary Trees")) {
    	commonPg.commonxpathclick("binary-trees");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Types of Binary Trees")) {
    	commonPg.commonxpathclick("types-of-binary-trees");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Implementation in Python")) {
    	commonPg.commonxpathclick("implementation-in-python");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Binary Tree Traversals")) {
    	commonPg.commonxpathclick("binary-tree-traversals");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Implementation of Binary Trees")) {
    	commonPg.commonxpathclick("implementation-of-binary-trees");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Applications of Binary trees")) {
    	commonPg.commonxpathclick("applications-of-binary-trees");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Binary Search Trees")) {
    	commonPg.commonxpathclick("binary-search-trees");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Implementation Of BST")) {
    	commonPg.commonxpathclick("implementation-of-bst");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Practice Questions")) {
    	DriverManager.getDriver().navigate().back();
    	commonPg.commonxpathclick("/tree/practice");
	}
    else if (common_link.equals("Time Complexity")) {
    	
    	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
    	commonPg.commonxpathclick("time-complexity");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Arrays in Python")) {
    	
    	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
    	commonPg.commonxpathclick("arrays-in-python");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Arrays Using List")) {
    	
    	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
    	commonPg.commonxpathclick("arrays-using-list");
    	Assert.assertEquals(DsalgoVariables.linkValidation, "a");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Basic Operations in Lists")) {
	
	//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
		commonPg.commonxpathclick("basic-operations-in-lists");
		Assert.assertEquals(DsalgoVariables.linkValidation, "a");
		LoggerLoad.info("Clicked on "+common_link + "link");
    }
    else if (common_link.equals("Applications of Array")) {
	
		//UtilityMethods.wait.until(ExpectedConditions.visibilityOf(TreePage.commonxpathtext("Implementation Of BST")));
		commonPg.commonxpathclick("applications-of-array");
		Assert.assertEquals(DsalgoVariables.linkValidation, "a");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
  
}

//common
@When("The user clicks {string} button")
public void the_user_clicks_button(String try_button) {
	wait.until(ExpectedConditions.visibilityOf(commonPg.tryHere_button));
	Assert.assertEquals(commonPg.tryHere_button.getTagName(), "a");
	commonPg.tryHere_button.click();
	
}

//common
@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	wait.until(ExpectedConditions.visibilityOf(commonPg.run_button));
	if(commonPg.run_button.isDisplayed()) {
	System.out.println("tryEditor with a Run button is displayed");
	LoggerLoad.info("tryEditor with a Run button is displayed");
	}
	else {
		LoggerLoad.error("tryEditor with a Run button is not displayed");
	}

}
@When("The user enters Wrong Python code in the tryEditor and clicks on Run button")
public void the_user_enters_wrong_input_in_the_try_editor_and_clicks_on_run_button() {
	wait.until(ExpectedConditions.visibilityOf(commonPg.Texteditor));
	System.out.println("User directed to TextEditor Page");
	LoggerLoad.info("User directed to TextEditor Page");
	
	commonPg.Texteditor.click();
	
	
	action.sendKeys("pri('Hello')").build().perform();
	
	commonPg.run_button.click();
}

@Then("It throws an Alert")
public void it_throws_an_alert() {
   try {
	   wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println("Python code is incorrect---Enter Correctly");
		LoggerLoad.info("Python code is incorrect---Enter Correctly");
		Alert alert=DriverManager.getDriver().switchTo().alert();
		alert.accept();
		
} catch (Exception e) {
	
}
}

@When("The user enters Valid Python code in the tryEditor and clicks on Run button")
public void the_user_enters_valid_input_in_the_try_editor_and_clicks_on_run_button() {
	commonPg.Texteditor1.click();
	action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();
	action.sendKeys("print('Hello')").build().perform();
	//testData.usingExcelSheetForTestData();
	commonPg.run_button.click();
	
}

@Then("The Output displays in Console")
public void the_output_displays_in_console() {
	System.out.println("The output is :" +commonPg.output.getText());
	LoggerLoad.info("The output is :" +commonPg.output.getText());
	Assert.assertTrue(commonPg.output.getText().contains("Hello"));
	
}
@Then("The user should be redirected to {string} page")
public void the_user_should_be_redirected_to_page(String string) {
	DsalgoVariables.practice_page=DriverManager.getDriver().getCurrentUrl();
	Assert.assertTrue(DsalgoVariables.practice_page.contains("practice"));
	LoggerLoad.info("In Practice Question Page - "+DsalgoVariables.practice_page);

}


}
