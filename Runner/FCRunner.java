package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features" , monochrome = true ,glue = {"StepDefinition"} ,plugin = {"html:HTMLReport/FC.html"} )


public class FCRunner {

}
