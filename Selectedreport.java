package imStepFiles;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import imPageObject.SalesReportPom;
import utilities.Hooks;

public class Selectedreport extends Hooks {
	
	SalesReportPom HO ;
	
	@When("^User click show$")
	public void user_click_show() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		
		HO = new SalesReportPom(driver);
//		HO.columns();
		
 	     
		HO.show();
					
	}

	@When("^select (\\d+)$")
	public void select(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.showentries();
	}

	@Then("^user could see (\\d+) entries in sales listing$")
	public void user_could_see_entries_in_sales_listing(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	
	@When("^User click customer$")
	public void user_click_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  		//HO.customer();
	}

	@When("^select a customer$")
	public void select_a_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
         HO.selectcust();
        HO.submit();
	}

	@Then("^user should see report of that particular customer$")
	public void user_should_see_report_of_that_particular_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}


}
