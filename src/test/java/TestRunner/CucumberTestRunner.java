package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features= {"src/test/resources/Features"},
	glue= {"StepDefinitions"},
	tags = "@tag",
	plugin= {
			"pretty","html:target/htmlreport.html"
			}
		)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
	 

}
