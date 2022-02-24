package MyRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
	//@RunWith(Cucumber.class)
	@CucumberOptions(features="../BDDCUCUMBER/src/test/java/Feature/Amazon.feature",
	dryRun= false,   // 
	glue = {"StepDefinitions"}, //it represents Where our steps implemented
	monochrome = true,  //Display the console output in proper readable format
	plugin = { "pretty",  "html:Reports/cucumber-pretty" } //Print the O/P clearly and generate a report

	//tags = {"@SmokeTest"}
	// tags = {"@SmokeTest" , "@End2End"} => AND
	// tags = {"@SmokeTest, @End2End"} => OR




		)


	public class Runner extends AbstractTestNGCucumberTests {

}
