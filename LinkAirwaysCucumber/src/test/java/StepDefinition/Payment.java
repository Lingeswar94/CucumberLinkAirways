package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import DriverManager.BrowserChoose;
import TestPage.PaymentPage;
import Ultity.DataDriven;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment {

	DataDriven dataDriven = new DataDriven();

	@Given("I want to write a Creditcard details")
	public void i_want_to_write_a_creditcard_details() {
		PaymentPage page = PageFactory.initElements(BrowserChoose.getDriver(), PaymentPage.class);
		page.SelectPayment();
		page.carddetails(dataDriven.getStringData("Payment", 1, 1), dataDriven.getStringData("Passenger", 2, 1),
				dataDriven.getStringData("Passenger", 3, 1));
		page.expirydate(dataDriven.getStringData("Payment", 4, 1));
	}

	@Given("I want to write a Billing Name")
	public void i_want_to_write_a_billing_name() {
		PaymentPage page = PageFactory.initElements(BrowserChoose.getDriver(), PaymentPage.class);
		page.Billingdataclear();
		page.Billingdetails(dataDriven.getStringData("Payment", 5, 1), dataDriven.getStringData("Payment", 6, 1),
				dataDriven.getStringData("Payment", 7, 1), dataDriven.getStringData("Payment", 8, 1),
				dataDriven.getStringData("Payment", 9, 1), dataDriven.getStringData("Payment", 10, 1));
		page.selectCountry(dataDriven.getStringData("Payment", 11, 1));
	}

	@When("I check for the Rules and Regulations:")
	public void i_check_for_the_rules_and_regulations() {
		PaymentPage page = PageFactory.initElements(BrowserChoose.getDriver(), PaymentPage.class);
		page.checkbox();
	}

	@Then("I want to click Continue button")
	public void i_want_to_click_continue_button() {
		PaymentPage page = PageFactory.initElements(BrowserChoose.getDriver(), PaymentPage.class);
		page.paymentcontinue();
	}
}
