package dsutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.support.PageFactory;

import dsalgoPOM.ArrayPage;
import dsalgoPOM.Datastructures;
import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;

public class TestBase {

	
	public Properties prop;

	
	public void loadProperties() {
		prop=new Properties();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("/Users/anushakarthick/NumpyNinja/dsalgo/src/test/resources/config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DsalgoVariables.browser=prop.getProperty("browser");
		DsalgoVariables.URL=prop.getProperty("url");
		DsalgoVariables.username=prop.getProperty("username");
		DsalgoVariables.password=prop.getProperty("password");

	}
	
	public static void initElements() {
		//PageFactory.initElements(DriverManager.getDriver(),HomePage.class);
		//PageFactory.initElements(DriverManager.getDriver(),RegisterationLoginPage.class);
		PageFactory.initElements(DriverManager.getDriver(),Datastructures.class);
		//PageFactory.initElements(DriverManager.getDriver(),TreePage.class);
		PageFactory.initElements(DriverManager.getDriver(),ArrayPage.class);
	}

	
	
}