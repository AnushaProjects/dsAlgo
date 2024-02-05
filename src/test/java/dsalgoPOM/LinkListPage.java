package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
public class LinkListPage {

	public LinkListPage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(xpath = "//h4[text()='Linked List']")
	public WebElement linked_page;
	@FindBy(xpath = "//a[@href='linked-list']")
	public WebElement linked_getStarted;
	@FindBy(xpath = "//a[@href='/linked-list/practice']")
	public WebElement linkedPractice;
}
 	 	