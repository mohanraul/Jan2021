package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
 glue="StepDefinations",tags="@RegressionTest",monochrome=true,strict=true,
 plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cuckes.xml"})
public class TestRunner {
	

}
