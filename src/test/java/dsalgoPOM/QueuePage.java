package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
public class QueuePage {

	public QueuePage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(xpath = "//h4[text()='Queue']")
	public WebElement queue_page;
	@FindBy(xpath = "//a[@href='queue']")
	public WebElement queue_getStarted;
	@FindBy(xpath = "//a[@href='/queue/practice']")
	public WebElement queuePractice;
	
}
 	 	