package dsalgoPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;

public class ArrayPage {

	public ArrayPage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@href='array']")
	public WebElement Getstarted;

	@FindBy(xpath = "//h4[text()='Array']")
	public WebElement array_page;
	
	@FindBy(xpath = "//a[@href='/array/practice']")
	public WebElement arrayPractice;

}


