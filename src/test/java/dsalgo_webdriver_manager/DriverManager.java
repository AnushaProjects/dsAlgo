package dsalgo_webdriver_manager;



import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import dsutilities.ConfigReader;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;

public class DriverManager {
	

	//private static WebDriver driver;
	public static ChromeOptions co=new ChromeOptions();
	//public static String browser;

	
	//private static final Logger LOGGER=LogManager.getLogger(DriverManager.class);
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
	
	public static void launchBrowser(@Optional("chrome") String browser) {
		// TODO Auto-generated method stub
		
		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			LoggerLoad.info("Testing on chrome -" +browser);
			co.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver.set(new ChromeDriver(co));	
		}
		else if(browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on edge -" +browser);
			driver.set(new EdgeDriver());	
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox -" +browser);
			driver.set(new FirefoxDriver());	
		}
		
	
//		switch (browser) {
//		case "chrome":
//			LoggerLoad.info("Testing on chrome -" +browser);
//			co.setPageLoadStrategy(PageLoadStrategy.EAGER);
//			driver.set(new ChromeDriver(co));
//			break;
//		case "firefox":
//			LoggerLoad.info("Testing on firefox -" +browser);
//			driver.set(new FirefoxDriver());
//			break;
//		case "edge":
//			LoggerLoad.info("Testing on edge -" +browser);
//			driver.set(new EdgeDriver()); ;
//			break;	
//		default:
//			LoggerLoad.info("Testing on chrome " +browser);
//			driver.set(new ChromeDriver());
//			break;
//		}
		
	}

	public static WebDriver getDriver() {
		return driver.get();
	}


	

	
}
