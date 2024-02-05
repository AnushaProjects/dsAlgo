
package testrunner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	//	@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				features ={"src/test/resources/features/"},
				plugin = {"pretty","html:target/dsalgoproject.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},//reporting purpose
				
				glue= {"dsalgo_stepdefinition","dsalgoHooks"},
			
				tags = "not @Array",
				
						
//				dryRun = true,
				monochrome=true
				)//console output colour
				


		public class TestRunner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = true)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		}
		}