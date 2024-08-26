package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import DriverManager.BrowserChoose;
import TestPage.FlightResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlightResult {

	
	
	@Given("I want to select fare with cabin")
	public void i_want_to_select_fare_with_cabin() {
		FlightResultPage page =PageFactory.initElements(BrowserChoose.getDriver(), FlightResultPage.class);
		page.Fareselecting("pro select_out");
	}

	@When("I want to give continue button")
	public void i_want_to_give_continue_button() {
		FlightResultPage page =PageFactory.initElements(BrowserChoose.getDriver(), FlightResultPage.class);
		page.FlightContiune();
	}
}
