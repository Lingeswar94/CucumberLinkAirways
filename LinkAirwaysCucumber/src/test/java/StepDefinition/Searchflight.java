package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import DriverManager.BrowserChoose;
import TestPage.SearchPage;
import Ultity.CommonFunction;
import Ultity.DataDriven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchflight {
	DataDriven dataDriven = new DataDriven();

	@Given("I want to saerchflight with Oneway trip")
	public void i_want_to_saerchflight_with_oneway_trip() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.Tripselection(dataDriven.getStringData("Route", 0, 1));
		// page.departureroute("BNE");
		// page.arrivalroute("OAG");

	}

	@When("I want to select departurecity and Arrivalcity")
	public void i_want_to_select_departurecity_and_arrivalcity() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		
		page.departureroute(dataDriven.getStringData("Route", 1, 1));

		page.arrivalroute(dataDriven.getStringData("Route", 2, 1));

	}

	@When("I want to select departuretime")
	public void i_want_to_select_departuretime() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.DateSelection(dataDriven.getStringData("Route", 3, 1),dataDriven.getStringData("Route", 4, 1));
	}

	@When("I want to select how many pax")
	public void i_want_to_select_how_many_pax() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.Adultcount(dataDriven.getStringData("Route", 7, 1));
		page.childpax(dataDriven.getStringData("Route", 8, 1));
		page.infantpax(dataDriven.getStringData("Route", 9, 1));
	}

	@Then("I want to click summitbutton")
	public void i_want_to_click_summitbutton() {
		SearchPage page = PageFactory.initElements(BrowserChoose.getDriver(), SearchPage.class);
		page.Searchbutton();
	}

}
