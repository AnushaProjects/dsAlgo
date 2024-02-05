package dsalgoPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;
public class StackPage {

	public StackPage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(xpath = "//h4[text()='Stack']")
	public WebElement stack_page;
	@FindBy(xpath = "//a[@href='stack']")
	public WebElement stack_getStarted;
	@FindBy(xpath = "//a[@href='/stack/practice']")
	public WebElement stackPractice;
	
}
 	 	