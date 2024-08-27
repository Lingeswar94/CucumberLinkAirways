package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import DriverManager.BrowserChoose;
import Ultity.CommonFunction;
import io.cucumber.java.Before;

public class OpenApp {

	public static WebDriver driver;
	@Before
	public void startapp() throws IOException {
		//CommonFunction commonFunction = new CommonFunction();
		CommonFunction.loadProperties();
		if (BrowserChoose.getDriver() == null) {
			BrowserChoose.lanuchbrowser();
		}
		
	}

}
