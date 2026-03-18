package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\blogSpotAutomation\\guiElements.feature"},
		glue = {"blogSpotAutomation"},
		plugin = {"pretty", "html:target/cucumber_report/blogSpotAutomation.html"},
		publish = true
		)
public class RunnerClass extends AbstractTestNGCucumberTests{

	
}
