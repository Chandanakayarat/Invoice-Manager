package imTesrRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="Features",glue= {"StepDefenition"})

public class TestRunnerSalesReport {

}
