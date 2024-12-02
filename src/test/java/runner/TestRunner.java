package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = {"hooks", "stepDefinition"},
		plugin = {
				"pretty",
				"html:target/cucumber-reports/cucumber.html"
		}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}