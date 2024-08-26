package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import DriverManager.BrowserChoose;
import TestPage.PaymentPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Payment {

	
	@Given("I want to write a Creditcard details")
	public void i_want_to_write_a_creditcard_details() {
		PaymentPage page = PageFactory.initElements(BrowserChoose.getDriver(), PaymentPage.class);
		page.SelectPayment();
		page.carddetails("Test", "4111111111111111", "123");
		page.expirydate();
	}

	@Given("I want to write a Billing Name")
	public void i_want_to_write_a_billing_name() {
		PaymentPage page = PageFactory.initElements(BrowserChoose.getDriver(), PaymentPage.class);
		page.Billingdataclear();
		page.Billingdetails("Tamil", "GQ", "25 SaiBaba", "Coimbatore", "641001", "9876543210");
		page.selectCountry();
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
