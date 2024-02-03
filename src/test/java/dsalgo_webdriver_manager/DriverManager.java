package dsalgo_webdriver_manager;



import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;

public class DriverManager {
	

	//private static WebDriver driver;
	public static ChromeOptions co=new ChromeOptions();
	
	
	//private static final Logger LOGGER=LogManager.getLogger(DriverManager.class);
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


	
	public static void launchBrowser() {
		// TODO Auto-generated method stub
		
		switch (DsalgoVariables.browser) {
		case "chrome":
			LoggerLoad.info("Launching -" +DsalgoVariables.browser);
			co.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver.set(new ChromeDriver(co));
			break;
		case "firefox":
			LoggerLoad.info("Launching -" +DsalgoVariables.browser);
			driver.set(new FirefoxDriver());
			break;
		case "safari":
			LoggerLoad.info("Launching -" +DsalgoVariables.browser);
			driver.set(new SafariDriver()); ;
			break;	
		default:
			LoggerLoad.info("Launching -" +DsalgoVariables.browser);
			driver.set(new ChromeDriver());
			break;
		}
		
	}

	public static WebDriver getDriver() {
		return driver.get();
	}


	

	
}
