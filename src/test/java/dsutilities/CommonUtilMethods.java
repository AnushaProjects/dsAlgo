package dsutilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;


import dsalgoPOM.HomePage;
import dsalgoPOM.RegisterationLoginPage;
import dsalgoPOM.TreePage;
import dsalgo_webdriver_manager.DriverManager;

public class CommonUtilMethods {

	
	HomePage hp=new HomePage();

	TreePage treePg=new TreePage();
	TestDataReadingWriting testData=new TestDataReadingWriting();
	
	RegisterationLoginPage register=new RegisterationLoginPage();
	
	
	public void Login() throws IOException {
		hp.getSignin_link().click();
		testData.loginCred();
		register.username.sendKeys(DsalgoVariables.username);
		register.password.sendKeys(DsalgoVariables.password);
		register.submit_btn.click();
		
	}
	public void launchURL() {
		DriverManager.getDriver().get(DsalgoVariables.URL);
		DriverManager.getDriver().manage().window().maximize();
		System.out.println("Launched the DSalgo website");
		
	}
}
