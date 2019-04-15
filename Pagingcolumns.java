package imStepFiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import imPageObject.SalesReportPom;
import utilities.Hooks;

public class Pagingcolumns extends Hooks {
	
	SalesReportPom HO ;

	
	@When("^User click page (\\d+)$")
	public void user_click_page(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.paging();
 	}

	@Then("^user could seee list of sales from (\\d+) to (\\d+)$")
	public void user_could_seee_list_of_sales_from_to(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 	}

	@When("^User click Coulumn$")
	public void user_click_Coulumn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		HO = new SalesReportPom(driver);
		HO.columns();
		
 	}

	@When("^select a column$")
	public void select_a_column() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.selcol();
		
		
 	}

	@Then("^user could see the column hiden$")
	public void user_could_see_the_column_hiden() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 	}

}
