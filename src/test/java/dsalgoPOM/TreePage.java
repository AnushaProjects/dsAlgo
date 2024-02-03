package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
public class TreePage {

	public TreePage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(xpath = "//h4[text()='Tree']")
	public WebElement tree_page;
	@FindBy(xpath = "//a[@href='tree']")
	public WebElement tree_getStarted;
	
}
 	 	