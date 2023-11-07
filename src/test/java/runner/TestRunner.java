package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",plugin = {"pretty","json:target/cucumber-report/cucumber.json","html:target/cucumber-report/cucumber1.html"},glue={"stepDefinition","base"},tags="@pack")
public class TestRunner {
	
	
	
	
	

}