package au.com.ausregistry.homePageTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"Features"}
//			,tags = {"@about"}
			,glue= {"stepDefinition"}
			,plugin= {"json:target/report-json/index.json"}
)
	
public class Runner {
}