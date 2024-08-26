package StepDefinition;

import org.openqa.selenium.support.PageFactory;

import DriverManager.BrowserChoose;
import TestPage.AddonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Addon {

	
	@Given("I want to Add Addon")
	public void i_want_to_add_addon() {
	 System.out.println("Addon Not Selected");
	}

	@When("I want to click continue button")
	public void i_want_to_click_continu_button() {
		AddonPage Page = PageFactory.initElements(BrowserChoose.getDriver(), AddonPage.class);
		Page.AddonContinuebutton();
	}
}
