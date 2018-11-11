package StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/resources/",
glue = "StepDef/")

public class TestRunnerClass extends AbstractTestNGCucumberTests {

	
}
