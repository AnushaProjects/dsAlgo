package dsalgoPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.DriverManager;


public class HomePage{
	
	public HomePage() {
	    PageFactory.initElements(DriverManager.getDriver(), this);
	}
	

		//HomePage
		@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
		private WebElement DS_link;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
		private List<WebElement> ds_dropdown_entries;
		@FindBy(xpath = "//a[text()='Get Started']")
		private WebElement get_started;
		@FindBy(xpath = "//div[@class='alert alert-primary']")
		private WebElement alert_message;
		
		//Registration
		@FindBy(xpath = "//a[text()=' Register ']")
		private WebElement register_link;
		
		
		//Sign in
		@FindBy(xpath = "//a[text()='Sign in']")
		private WebElement signin_link;
		
		
		//Sign Out
		@FindBy(xpath = "//a[text()='Sign out']")
		private WebElement signout_link;
		
		//Tree
		
		

		public WebElement getDS_link() {
			return DS_link;
		}

		public List<WebElement> getDs_dropdown_entries() {
			return ds_dropdown_entries;
		}

		public WebElement getGet_started() {
			return get_started;
		}

		public WebElement getAlert_message() {
			return alert_message;
		}

		public WebElement getRegister_link() {
			return register_link;
		}

		public WebElement getSignin_link() {
			return signin_link;
		}

		public WebElement getSignout_link() {
			return signout_link;
		}

		

	
}
