package imStepFiles;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import imPageObject.SalesReportPom;
import utilities.Hooks;

public class SalesReportScreen extends Hooks {
	
	SalesReportPom HO ;
	
	@Given("^User on the  Invoice Manager Home Page$")
	public void user_on_the_Invoice_Manager_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\us\\Desktop\\Automation\\jar files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://13.59.149.220/AMS3.0/home");
     }

	@When("^user clicks on Reports drop-down$")
	public void user_clicks_on_Reports_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 HO = new SalesReportPom(driver);
		 HO.ClickReports();
	    
	}

	@When("^Select Sales Report$")
	public void select_Sales_Report() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		HO = new SalesReportPom(driver);
		HO.selectSales();

	}

	@Then("^User presented with Sales Teport Screen$")
	public void user_presented_with_Sales_Teport_Screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//String sr=driver.getTitle();
		assertEquals("Sales Report · Invoice Manager",driver.getTitle()); 
		//System.out.println(sr);

		
	}
	
	@When("^user clicks show/hide$")
	public void user_clicks_show_hide() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HO = new SalesReportPom(driver);
		HO.showhide();
	}

	@Then("^user could seee form hidden$")
	public void user_could_seee_form_hidden() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Sales Report · Invoice Manager",driver.getTitle());		 
	}
	
	@When("^User click Submit$")
	public void user_click_Submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HO = new SalesReportPom(driver);
 		HO.submit();
	}

	@Then("^user could seee list of sales$")
	public void user_could_seee_list_of_sales() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Sales Report · Invoice Manager",driver.getTitle());
		}



	
}
