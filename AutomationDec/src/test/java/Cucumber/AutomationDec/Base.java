package Cucumber.AutomationDec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\chromedriver87\\chromedriver.exe");
    	driver=new ChromeDriver();
    	prop=new Properties();
    	FileInputStream fis=new FileInputStream("C:\\Users\\81F500JKIN (AYBY)\\Selenium workspace\\AutomationDec\\src\\test\\java\\Cucumber\\AutomationDec\\global.properties");
    	prop.load(fis);
    	driver.get(prop.getProperty("url"));
    	return driver;
	}

	
}
