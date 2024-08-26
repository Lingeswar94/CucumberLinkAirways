package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverManager.BrowserChoose;
import TestPage.PassengerPage;
import Ultity.DataDriven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Passenger {

	DataDriven dataDriven = new DataDriven();

	@Given("I want to write Main passenger details")
	public void i_want_to_write_main_passenger_details() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		 WebDriverWait wait=new WebDriverWait(BrowserChoose.getDriver(), Duration.ofSeconds(30));
		page.MainPassenger(dataDriven.getStringData("Passenger", 1, 1), dataDriven.getStringData("Passenger", 2, 1),
				dataDriven.getStringData("Passenger", 3, 1), dataDriven.getStringData("Passenger", 4, 1),
				dataDriven.getStringData("Passenger", 5, 1), dataDriven.getStringData("Passenger", 6, 1),
				dataDriven.getStringData("Passenger", 7, 1));

	}

	@When("I want to write Child passenger details")
	public void i_want_to_write_child_passenger_details() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		page.childPassenger(dataDriven.getStringData("Passenger", 10, 1), dataDriven.getStringData("Passenger", 11, 1),
				dataDriven.getStringData("Passenger", 12, 1), dataDriven.getStringData("Passenger", 13, 1),
				dataDriven.getStringData("Passenger", 14, 1), dataDriven.getStringData("Passenger", 15, 1),
				dataDriven.getStringData("Passenger", 16, 1));
	}

	@When("I want to write infant passenger details")
	public void i_want_to_write_infant_passenger_details() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		page.InfantPax(dataDriven.getStringData("Passenger", 19, 1), dataDriven.getStringData("Passenger", 20, 1),
				dataDriven.getStringData("Passenger", 21, 1), dataDriven.getStringData("Passenger", 22, 1),
				dataDriven.getStringData("Passenger", 23, 1), dataDriven.getStringData("Passenger", 24, 1),
				dataDriven.getStringData("Passenger", 25, 1));
	}

	@Then("I want to click continuebutton")
	public void i_want_to_click_continuebutton() {
		PassengerPage page = PageFactory.initElements(BrowserChoose.getDriver(), PassengerPage.class);
		page.Passengercontinue();
	}

}
