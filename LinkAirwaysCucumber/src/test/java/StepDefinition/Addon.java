package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverManager.BrowserChoose;
import TestPage.AddonPage;
import Ultity.Helper;
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
		WebDriverWait wait=new WebDriverWait(BrowserChoose.getDriver(), Duration.ofSeconds(30));
		
		try {
			Page.AddonContinuebutton();
		}catch(Exception e) {
			Helper.getscreenshot();
		}
		
		
		
		
	}
}
