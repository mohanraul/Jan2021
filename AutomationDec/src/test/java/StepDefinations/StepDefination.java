package StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.AutomationDec.Base;
import io.cucumber.core.internal.gherkin.ast.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination extends Base{
	

		@Given("^User is on netbanking landing page$")
		public void user_is_on_netbanking_landing_page() throws Throwable {
			System.out.println("User is on landing page");
		  
		}
		
		
		 
		 @Then("^Verify selected (.+) items are displayed in checkout page$")
		    public void verify_selected_items_are_displayed_in_checkout_page(String name) throws Throwable {
			 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(name));
		    }

		
		
		 @Given("^Validate the browser$")
		    public void validate_the_browser() throws Throwable {
			 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains("fdads"));
		       System.out.println("Validating the browser");
		    }

		    @When("^Browser is triggered$")
		    public void browser_is_triggered() throws Throwable {
		       System.out.println("Browser triggered");
		    }

		    @Then("^Check if browser is started$")
		    public void check_if_browser_is_started() throws Throwable {
		       System.out.println("Browser started");
		    }

		@When("^User logins into the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_logins_into_the_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	       System.out.println(strArg1);
	       System.out.println(strArg2);
	    }


		@Then("^Home page is populated$")
		public void home_page_is_populated()  throws Throwable  {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Validated home page");
		   
		}
		

	    @When("^User signup with following details$")
	    public void user_signup_with_following_details(io.cucumber.datatable.DataTable data) throws Throwable {
	    	List<List<String>> obj=data.asLists();
	    	System.out.println(obj.get(0).get(0));
	    	System.out.println(obj.get(0).get(1));
	    	System.out.println(obj.get(0).get(2));
	    	System.out.println(obj.get(0).get(3));
	    	System.out.println(obj.get(0).get(4));
	        
	    }
	    
	    @When("^User logins in to the application with (.+) and  (.+)$")
	    public void user_logins_in_to_the_application_with_and(String username, String password) throws Throwable {
	     System.out.println(username);
	     System.out.println(password);
	    }

		 @And("^Cards displayed are \"([^\"]*)\"$")
		    public void cards_displayed_are_something(String strArg1) throws Throwable {
		       System.out.println(strArg1);
		    }
	}
	

