package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
public class GraphPage {

	public GraphPage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(xpath = "//h4[text()='Graph']")
	public WebElement Graph_page;
	@FindBy(xpath = "//a[@href='graph']")
	public WebElement graph_getStarted;
	@FindBy(xpath = "//a[@href='/graph/practice']")
	public WebElement graphPractice;
	
}
 	 	