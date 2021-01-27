package StepDefinations;



import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.AutomationDec.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
   public  WebDriver driver;
   HomePage h;
	
    @Given("^User is on Greencart landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver=Base.getDriver();
    	
     
    }

    @When("^User serached for (.+) vegetable$")
    public void user_serached_for_something_vegetable(String strArg1) throws Throwable {
    	//driver.findElement(By.cssSelector("[placeholder='Search for Vegetables and Fruits']")).sendKeys(strArg1);
    	h=new HomePage(driver);
    	h.getSearch().sendKeys(strArg1);
    	Thread.sleep(5000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
        Thread.sleep(5000);
    }
    
    @And("^Added item to cart$")
    public void added_item_to_cart() throws Throwable {
    	
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
    	Thread.sleep(5000);
    	
        
    }

    @And("^User proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.cssSelector("[alt='Cart']")).click();
    	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
       
    }
    
   

}
