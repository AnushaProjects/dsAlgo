package dsalgoHooks;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgo_webdriver_manager.DriverManager;
import dsutilities.CommonUtilMethods;
import dsutilities.DsalgoVariables;
import dsutilities.LoggerLoad;
import dsutilities.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DSalgoHooks {
	
	
	TestBase testbase=new TestBase();
	//HomePage hp=new HomePage();
	CommonUtilMethods commonutil=new CommonUtilMethods();
	
	
	@Before
	public void beforeScenario() {
		LoggerLoad.info("Execution Started");
		try {
			LoggerLoad.info("Loading the Property File");
			testbase.loadProperties();
			
			DriverManager.launchBrowser();
			TestBase.initElements();
				
			
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
