package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features" , monochrome = true ,glue = {"StepDefinition"} ,plugin = {"html:src/test/resources/HTMLReport/FC.html"} ,dryRun = false)


public class FCRunner {

}
