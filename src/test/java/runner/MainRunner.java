package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"}, glue={"stepDefinitions", "hooks"},
monochrome = false,dryRun = false, plugin = {"pretty","html: target/cucumber.html"})
public class MainRunner extends AbstractTestNGCucumberTests {


}
