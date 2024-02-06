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
import dsalgoPOM.GraphPage;
import dsalgoPOM.HomePage;
import dsalgoPOM.LinkListPage;
import dsalgoPOM.QueuePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgoPOM.StackPage;
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
	LinkListPage linkedpg=new LinkListPage();
	StackPage stackpg=new StackPage();
	QueuePage queuepg=new QueuePage();
	GraphPage graphpg=new GraphPage();
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
		Assert.assertEquals(DsalgoVariables.tree_main_page, "https://dsportalapp.herokuapp.com/tre/");
		LoggerLoad.info("Landed on to Tree Page - " +DsalgoVariables.tree_main_page);
		
	}
	else if(new_page.equals("DataStructure")) {
		wait.until(ExpectedConditions.visibilityOf(dsPg.ds_page));
		System.out.println("User directed to DataStructure Introduction Page");
		LoggerLoad.info("User directed to DataStructure Introduction Page");	
	}
	else if(new_page.equals("Array")) {
		wait.until(ExpectedConditions.visibilityOf(arrayPg.array_page));
		System.out.println("User directed to Array Page");
		LoggerLoad.info("User directed to Array Page");	
	}
	
	else if(new_page.equals("Linked List")) {
		wait.until(ExpectedConditions.visibilityOf(linkedpg.linked_page));
		System.out.println("User directed to Linked List Page");
		LoggerLoad.info("User directed to Linked List Page");	
	}
	else if(new_page.equals("Stack")) {
		wait.until(ExpectedConditions.visibilityOf(stackpg.stack_page));
		System.out.println("User directed to Stack Page");
		LoggerLoad.info("User directed to Stack Page");	
	}
	else if(new_page.equals("Queue")) {
		wait.until(ExpectedConditions.visibilityOf(queuepg.queue_page));
		System.out.println("User directed to Queue Page");
		LoggerLoad.info("User directed to Queue Page");	
	}
	else if(new_page.equals("Graph")) {
		wait.until(ExpectedConditions.visibilityOf(graphpg.Graph_page));
		System.out.println("User directed to Graph Page");
		LoggerLoad.info("User directed to Graph Page");	
	}
	
	//Tree
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
	//DSIntro
	else if (new_page.equals("Time complexity")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Time complexity")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Time complexity Page");
		LoggerLoad.info("User directed to Time complexity Page");
	}
	
	//Array
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
	//Linked List
	
	else if (new_page.equals("Introduction")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Introduction")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Introduction Page");
		LoggerLoad.info("User directed to Introduction Page");
	}
	else if (new_page.equals("Creating Linked LIst")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Creating Linked LIst")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Creating Linked LIst Page");
		LoggerLoad.info("User directed to Creating Linked LIst Page");
	}
	else if (new_page.equals("Types of Linked List")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Types of Linked List")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Types of Linked List Page");
		LoggerLoad.info("User directed to Types of Linked List Page");
	}
	else if (new_page.equals("Implement Linked List in Python")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Implement Linked List in Python")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implement Linked List in Python Page");
		LoggerLoad.info("User directed to Implement Linked List in Python Page");
	}
	else if (new_page.equals("Traversal")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Traversal")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Traversal Page");
		LoggerLoad.info("User directed to Traversal Page");
	}
	else if (new_page.equals("Insertion")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Insertion")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Insertion Page");
		LoggerLoad.info("User directed to Insertion Page");
	}
	else if (new_page.equals("Deletion")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Deletion")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Deletion Page");
		LoggerLoad.info("User directed to Deletion Page");
	}
	
	//Stack
	else if (new_page.equals("Operations in Stack")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Operations in Stack")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Operations in Stack Page");
		LoggerLoad.info("User directed to Operations in Stack Page");
	}
	else if (new_page.equals("Implementation")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Implementation")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation Page");
		LoggerLoad.info("User directed to Implementation Page");
	}
	else if (new_page.equals("Applications")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Applications")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Applications Page");
		LoggerLoad.info("User directed to Applications Page");
	}
	
	
	//Queue
	else if (new_page.equals("Implementation of Queue in Python")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Implementation of Queue in Python")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation of Queue in Python Page");
		LoggerLoad.info("User directed to Implementation of Queue in Python Page");
	}
	else if (new_page.equals("mplementation using collections.deque")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("mplementation using collections.deque")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to mplementation using collections.deque Page");
		LoggerLoad.info("User directed to mplementation using collections.deque Page");
	}
	else if (new_page.equals("Implementation using array")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Implementation using array")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Implementation using array Page");
		LoggerLoad.info("User directed to Implementation using array Page");
	}
	else if (new_page.equals("Queue Operations")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Queue Operations")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Queue Operations Page");
		LoggerLoad.info("User directed to Queue Operations Page");
	}
	
	//Graph
	else if (new_page.equals("GraphIntro")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Graph")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Graph Page");
		LoggerLoad.info("User directed to Graph Page");
	}
	else if (new_page.equals("Graph Representations")) {
		wait.until(ExpectedConditions.visibilityOf(commonPg.commonxpathtext("Graph Representations")));
		js.executeScript("window.scrollBy(0,250)", "");
		System.out.println("User directed to Graph Representations Page");
		LoggerLoad.info("User directed to Graph Representations Page");
	}
	
	
	
    
}


//list of Links
//Tree
@When("The user clicks {string} link")
public void the_user_clicks_link(String common_link) {
    if(common_link.equals("Overview of Trees")) {
    	System.out.println(DsalgoVariables.linkValidation);    	
    	commonPg.commonxpathclick("overview-of-trees");
    	LoggerLoad.info("Clicked on "+common_link + "link");
    }
   
    else if (common_link.equals("Terminologies")) {
    	commonPg.commonxpathclick("terminologies");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Types of Trees")) {
    	commonPg.commonxpathclick("types-of-trees");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Tree Traversals")) {
    	
    	commonPg.commonxpathclick("tree-traversals");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Traversals-Illustration")) {
    	
    	commonPg.commonxpathclick("traversals-illustration");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Binary Trees")) {
    	
    	commonPg.commonxpathclick("binary-trees");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Types of Binary Trees")) {
    	
    	commonPg.commonxpathclick("types-of-binary-trees");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Implementation in Python")) {
    	
    	commonPg.commonxpathclick("implementation-in-python");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Binary Tree Traversals")) {
    	
    	commonPg.commonxpathclick("binary-tree-traversals");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Implementation of Binary Trees")) {
    	
    	commonPg.commonxpathclick("implementation-of-binary-trees");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Applications of Binary trees")) {
    	
    	commonPg.commonxpathclick("applications-of-binary-trees");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Binary Search Trees")) {
    	
    	commonPg.commonxpathclick("binary-search-trees");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Implementation Of BST")) {
    	
    	commonPg.commonxpathclick("implementation-of-bst");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
	
    else if (common_link.equals("Practice Questions")) {
    	DriverManager.getDriver().navigate().back();
    	commonPg.commonxpathclick("/tree/practice");
	}
    //DSIntro
    else if (common_link.equals("Time Complexity")) {
    	
    	commonPg.commonxpathclick("time-complexity");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    //Array
    else if (common_link.equals("Arrays in Python")) {
    	
    	commonPg.commonxpathclick("arrays-in-python");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Arrays Using List")) {
    	
    	commonPg.commonxpathclick("arrays-using-list");
    	LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Basic Operations in Lists")) {
    	
		commonPg.commonxpathclick("basic-operations-in-lists");
		LoggerLoad.info("Clicked on "+common_link + "link");
    }
    else if (common_link.equals("Applications of Array")) {
    	
		commonPg.commonxpathclick("applications-of-array");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    //LinkedList
    else if (common_link.equals("Introduction")) {
    	
		commonPg.commonxpathclick("introduction");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Creating Linked LIst")) {
    	
		commonPg.commonxpathclick("creating-linked-list");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Types of Linked List")) {
    	
		commonPg.commonxpathclick("types-of-linked-list");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Implement Linked List in Python")) {
    	
		commonPg.commonxpathclick("implement-linked-list-in-python");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Traversal")) {
    	
		commonPg.commonxpathclick("traversal");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Insertion")) {
    	
		commonPg.commonxpathclick("insertion-in-linked-list");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Deletion")) {
    	
		commonPg.commonxpathclick("deletion-in-linked-list");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
   
    //Stack
    else if (common_link.equals("Operations in Stack")) {
    	
		commonPg.commonxpathclick("operations-in-stack");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Implementation")) {
    	
		commonPg.commonxpathclick("implementation");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Applications")) {
    	
		commonPg.commonxpathclick("stack-applications");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    
    
  //Queue
    else if (common_link.equals("Implementation of Queue in Python")) {
    	
		commonPg.commonxpathclick("implementation-lists");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Implementation using collections.deque")) {
    	
		commonPg.commonxpathclick("implementation-collections");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Implementation using array")) {
    	
		commonPg.commonxpathclick("Implementation-array");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Queue Operations")) {
    	
		commonPg.commonxpathclick("QueueOp");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    
    //Graph
    else if (common_link.equals("Graph")) {
    	
		commonPg.commonxpathclick("graph");
		LoggerLoad.info("Clicked on "+common_link + "link");
	}
    else if (common_link.equals("Graph Representations")) {
	
		commonPg.commonxpathclick("graph-representations");
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
@When("The user clicks on the {string}")
public void the_user_clicks_on_the(String link) {
	DriverManager.getDriver().navigate().back();
	Assert.assertEquals(true,hp.getSignout_link().isDisplayed());
	hp.getSignout_link().click();
	LoggerLoad.info("User clicked on signout");
}


}
