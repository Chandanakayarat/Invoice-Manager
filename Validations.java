package imStepFiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import imPageObject.SalesReportPom;
import utilities.Hooks;

public class Validations extends Hooks {
	
	SalesReportPom HO ;

	
	@Then("^user could see totals highted is the total of columns total$")
	public void user_could_see_totals_highted_is_the_total_of_columns_total() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 	}

	@When("^enter char values in date$")
	public void enter_char_values_in_date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		HO = new SalesReportPom(driver);
		HO.sdate();
		
 	}

	@When("^click on next field$")
	public void click_on_next_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
        HO.edate();
 	}

	@Then("^user could see date field defaulted$")
	public void user_could_see_date_field_defaulted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 	}


}
