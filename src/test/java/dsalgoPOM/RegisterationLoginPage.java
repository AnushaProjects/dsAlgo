package dsalgoPOM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;


public class RegisterationLoginPage{


	public RegisterationLoginPage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	//Registeration
	@FindBy(name = "username")
	public WebElement username1;
	@FindBy(name = "password1")
	public WebElement password1;
	@FindBy(name = "password2")
	public WebElement password2;
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement submit_btn;
	//reuse alert_message
	
	//Login
	@FindBy(name = "username")
	public WebElement username;
	@FindBy(name = "password")
	public WebElement password;
	//reuse submit_btn
	//alert_message
}
