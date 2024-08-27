package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import DriverManager.BrowserChoose;
import TestPage.FlightResultPage;
import Ultity.DataDriven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlightResult {

	DataDriven dataDriven=new DataDriven();
	
	@Given("I want to select fare with cabin")
	public void i_want_to_select_fare_with_cabin() {
		FlightResultPage page =PageFactory.initElements(BrowserChoose.getDriver(), FlightResultPage.class);
		page.Fareselecting(dataDriven.getStringData("Route", 11, 1));
	}

	@When("I want to give continue button")
	public void i_want_to_give_continue_button() {
		FlightResultPage page =PageFactory.initElements(BrowserChoose.getDriver(), FlightResultPage.class);
		page.FlightContiune();
	}
}
