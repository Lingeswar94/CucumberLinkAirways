package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverManager.BrowserChoose;
import TestPage.PassengerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Passenger {

	
	
	
	@Given("I want to write Main passenger details")
	public void i_want_to_write_main_passenger_details() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		page.MainPassenger( "Tamil", "GQ", "9874563210", "lingeswar@twai.com", "lingeswar@twai.com", "2000-BARANGAROO,NSW");
		
	}

	@When("I want to write Child passenger details")
	public void i_want_to_write_child_passenger_details() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		page.childPassenger("Mstr.", "Lingesh", "GQ", "12", "June", "2018", "2000-BARANGAROO,NSW");
	}

	@When("I want to write infant passenger details")
	public void i_want_to_write_infant_passenger_details() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		page.InfantPax("Mstr.", "Pradeep", "GQ", "21", "May", "2023", "2000-BARANGAROO,NSW");
	}

	@Then("I want to click continuebutton")
	public void i_want_to_click_continuebutton() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		page.Passengercontinue();
	}

}
