package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import DriverManager.BrowserChoose;
import TestPage.SearchPage;
import Ultity.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchflight {

	
	
	@Given("I want to saerchflight with Oneway trip")
	public void i_want_to_saerchflight_with_oneway_trip() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.Tripselection("One Way ");
		//page.departureroute("BNE");
		//page.arrivalroute("OAG");
		
		
	}

	@When("I want to select departurecity and Arrivalcity")
	public void i_want_to_select_departurecity_and_arrivalcity() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.departureroute("BNE");
		page.arrivalroute("OAG");
		
	}

	@When("I want to select departuretime")
	public void i_want_to_select_departuretime() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.DateSelection("September 2024", "22");
	}

	@When("I want to select how many pax")
	public void i_want_to_select_how_many_pax() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.Adultcount("1");
		page.childpax("1");
		page.infantpax("1");
	}

	@Then("I want to click summitbutton")
	public void i_want_to_click_summitbutton() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.Searchbutton();
	}

}
