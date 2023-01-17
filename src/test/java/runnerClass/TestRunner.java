package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src/test/resources/Feature",
		glue= "stepDefinitions",
		plugin= {"pretty",
				"html:target/Cucumber.html",
                "json:target/Cucumber.json",
                 "rerun:target/failedScenarios.txt"})
	
public class TestRunner {

}
