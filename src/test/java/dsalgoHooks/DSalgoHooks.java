package dsalgoHooks;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.CommonUtilMethods;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import dsutilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DSalgoHooks {
	
	
	ConfigReader testbase=new ConfigReader();
	HomePage hp=new HomePage();
	CommonUtilMethods commonutil=new CommonUtilMethods();
	


	
	@Before
	
	public void beforeScenario() throws Throwable {
		LoggerLoad.info("Execution Started");
		try {
			LoggerLoad.info("Loading the Property File");
			testbase.loadProperties();
			String browser = ConfigReader.getBrowserType();
			DriverManager.launchBrowser(browser);
			
			ConfigReader.initElements();
				
			
		}
		 catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
		
		try {
			
			commonutil.launchURL();
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
	}

	
	
	
	

	
@After
public void driverClose() {
	
	if (DriverManager.getDriver() != null) {
		DriverManager.getDriver().quit();
	
}
	
}
}
