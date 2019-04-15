package imStepFiles;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import imPageObject.SalesReportPom;
import utilities.Hooks;

public class Downloads extends Hooks {
	
	SalesReportPom HO ;
	
	@When("^User click copy$")
	public void user_click_copy() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.copy();
	     
	}

	@Then("^user could seee list of sales copied$")
	public void user_could_seee_list_of_sales_copied() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User click Execel$")
	public void user_click_Execel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.xl();
	     
	}

	@Then("^user could seee list of sales downloaded as excel$")
	public void user_could_seee_list_of_sales_downloaded_as_excel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//	HO = new SalesReportPom(driver);
	//	String Sr= HO.isFileDownloaded("C:\\Downloads","Sales Report · Invoice Manager.xls");
	//	System.out.println(Sr);
 	}

	@When("^User click CSV$")
	public void user_click_CSV() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.csv();
 	}

	@Then("^user could seee list of sales downloaded as CSV$")
	public void user_could_seee_list_of_sales_downloaded_as_CSV() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 	}

	@When("^User click pdf$")
	public void user_click_pdf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.pdf();
 	}

	@Then("^user could seee list of sales downloaded as pdf$")
	public void user_could_seee_list_of_sales_downloaded_as_pdf() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
 	}

}
