package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public  WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By search=By.cssSelector("[placeholder='Search for Vegetables and Fruits']");
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}

}
