package cm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/main/java/com/features",
		glue="com.stepdef",
		plugin="html:target", //to generate report
		dryRun=false,//to compile feature file
		monochrome=true//redable output
		
		) 

public class TestRunner {

}
 