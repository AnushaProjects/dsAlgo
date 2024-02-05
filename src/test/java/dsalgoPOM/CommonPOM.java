package dsalgoPOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgo_webdriver_manager.DriverManager;
import dsutilities.DsalgoVariables;

public class CommonPOM {

	public CommonPOM() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10));
	@FindBy(xpath = "//a[@href='/tryEditor']")
	public  WebElement tryHere_button;
	@FindBy(xpath="//*[@class='input']")
	public  WebElement Texteditor;
	@FindBy(xpath="//pre[@role='presentation']")
	public  WebElement Texteditor1;
	@FindBy(xpath = "//button[text()='Run']")
	public  WebElement run_button;
	@FindBy(id = "output")
	public  WebElement output;
	
	
	public void commonxpathclick(String pageLinks ) {
		WebElement commonLink=DriverManager.getDriver().findElement(By.xpath("//a[@href='"+pageLinks+"']"));
		wait.until(ExpectedConditions.visibilityOf(commonLink));
		DsalgoVariables.linkValidation=commonLink.getTagName();
		Assert.assertEquals(DsalgoVariables.linkValidation, "a");
		commonLink.click();
		
	}
	
	
	
	public WebElement commonxpathtext(String allpageCheck ) {
		WebElement pageCheck=DriverManager.getDriver().findElement(By.xpath("//p[text()='"+allpageCheck+"']"));
		return pageCheck;
	}
}
