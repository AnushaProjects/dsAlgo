
package testrunner;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import dsutilities.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	//	@RunWith(Cucumber.class) //Junit execution
	@CucumberOptions(
		features ={"src/test/resources/features/Array.feature"},
		plugin = {"pretty","html:target/dsalgoproject.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},//reporting purpose
		
		glue= {"dsalgo_stepdefinition","dsalgoHooks"},
	
//		tags = "not @Array",
		
				
//		dryRun = true,
		monochrome=true
		)//console output colour
				


		public class TestRunner2 extends AbstractTestNGCucumberTests{
			
		@BeforeTest

		@Parameters({ "Browser" })

		public void defineBrowser(String browser) throws Throwable {

			ConfigReader.setBrowserType(browser);


		}
		@Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	}
		}