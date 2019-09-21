package Runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "src/main/java/Features", // Path of feature files
		glue = {"stepDefinitions"}, // Path of step definition files
		tags = {"~@Ignore"},
		format = { //to generate different types of reporting
				"pretty",
				"html:target/cucumber-reports/cucumber-pretty",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt"
		},
		monochrome = true, // Display the console output in a proper readable format
		strict = true, // It will check if any step is not defined in step definition file
		dryRun = false, // To check the mapping is proper between feature file and step def file
		plugin = "json:target/cucumber-reports/CucumberTestReport.json"
		)
public class TestRunner {
	private TestNGCucumberRunner runner;

	@BeforeClass(alwaysRun=true)
	public void setUpClass() {
		runner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Run Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		runner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features(){
		return runner.provideFeatures();
	}

	@AfterClass(alwaysRun=true)
	public void finish() {
		runner.finish();
	}
}
