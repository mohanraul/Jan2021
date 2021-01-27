package StepDefinations;

import Cucumber.AutomationDec.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Before Mobile hook");
	}
	
	@After("@MobileTest")
	public void afterValidation()
	{
		System.out.println("After Mobile hook");
	}
	
	@After("@SeleniumTest")
	public void afterValidation1()
	{
		driver.close();
	}
	
	@After("@SmokeTest")
	public void afterValidation3()
	{
		driver.close();
	}
	
	
	@After("@RegressionTest")
	public void afterValidation2()
	{
		driver.close();
	}
	
	
	
	
	@Before("@WebTest")
	public void beforewebValidation()
	{
		System.out.println("Before web hook");
	}
	
	@After("@WebTest")
	public void afterwebValidation()
	{
		System.out.println("After web hook");
	}

}
