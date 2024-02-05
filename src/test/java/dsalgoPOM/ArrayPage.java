package dsalgoPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;

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

	@FindBy(xpath = "//div[@class='list-group']")
	public List<WebElement> practiceLinks;
	
	@FindBy(xpath="//pre[@role='presentation']")
	public  WebElement Texteditor1;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement submitBtn;
	
	@FindBy(xpath="//button[@type='button']")
	public  WebElement runBtn;
	
	@FindBy(id = "output")
	public  WebElement output;
	
	public void questionclick(String questions) {
		WebElement questionLink=DriverManager.getDriver().findElement(By.xpath("//a[text()='"+questions+"']"));
		questionLink.click();	
		
	}
}


