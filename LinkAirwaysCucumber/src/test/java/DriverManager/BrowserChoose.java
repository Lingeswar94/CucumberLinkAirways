package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



import Ultity.CommonFunction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserChoose {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	CommonFunction commonFunction=new CommonFunction();
	
	
	public static void lanuchbrowser() {
		CommonFunction commonFunction=new CommonFunction();
		
		switch (commonFunction.Browser) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			break;
		}

		driver.manage().window().maximize();
		driver.navigate().to(commonFunction.Url);

	}

}
