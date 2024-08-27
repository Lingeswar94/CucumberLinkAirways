package Ultity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonFunction {

public static Properties properties;
	
	public static void loadProperties()  {
		
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream("src/test/resources/Config/Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		    properties = new Properties();
			try {
				properties.load(fileInputStream);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
			

	}
	
	public	String Url = properties.getProperty("Url");
	public String Browser = properties.getProperty("Browser");

}
