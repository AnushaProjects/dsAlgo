package dsalgoPOM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;


public class Datastructures {
	
	public Datastructures() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@href=\'data-structures-introduction\']")
	public WebElement getstarted;
	
	@FindBy(xpath = "//h4[text()='Data Structures-Introduction']")
	public WebElement ds_page;
	

	@FindBy(xpath = "//a[@href='/data-structures-introduction/practice']")
	public WebElement dsPractice;
	
}