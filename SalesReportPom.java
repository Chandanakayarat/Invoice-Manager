package imPageObject;

 import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesReportPom {
	
	static WebDriver driver;
	
	@FindBy(className = "mm_reports")
	WebElement Reports;
	
	@FindBy(name="identity")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Pass;
	
	@FindBy(xpath="/html/body/div[2]/div/nav/ul/li[7]/ul")
	WebElement sales;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/h2/span/a")
	WebElement showhide;
	
	@FindBy(xpath="/html/body/div/div/div/div/div[2]/div[2]/div/form/div[3]/div[2]/button")
	WebElement login;
	
	@FindBy(xpath="/html/body/div[3]/div[4]/div[1]/div[1]/form/div[3]/div/input")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[1]")
	WebElement copybtn;
	
	@FindBy(xpath="//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[2]")
	WebElement xlbtn;
	
	@FindBy(xpath="//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[3]")
	WebElement csvbtn;
	
	@FindBy(xpath="//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[4]")
	WebElement pdfbtn;
       
	@FindBy(xpath="//*[@id=\"fileData_paginate\"]/ul/li[3]/a")
	WebElement page2;
	
	@FindBy(xpath="//*[@id=\"fileData_wrapper\"]/div[1]/div/div/a[5]")
	WebElement columns;
	
	
	@FindBy(id="customer")
	WebElement Customer;
	
	@FindBy(name="fileData_length")
	WebElement show;
	
	
	@FindBy(name="start_date")
	WebElement sdate;
	
	@FindBy(name="end_date")
	WebElement edate;
       
	public SalesReportPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	public void ClickReports() {
		Email.sendKeys("admin@gic.com");
		Pass.sendKeys("Admin1234");
		login.click();
		driver.get("http://13.59.149.220/AMS3.0/home");
		Reports.click();
		
	}
	public void selectSales() {
		
		driver.manage().window().maximize();
		
	    sales.findElement(By.xpath("//*[@id=\"reports_sales\"]")).click();
	//    Select slcreport = new Select(Reports);
	 //   slcreport.selectByIndex(3);
		 
		
	}

	public void showhide() {
		
		showhide.click();
		
	}
	
    public void sdate() {
		
		sdate.sendKeys("anfmm");
		
	}
    
   public void edate() {
		
		edate.click();
		
	}
	
    public void customer() {
    	
    /*	WebElement cust = Customer;
    	Actions actions = new Actions(driver);
    	actions.moveToElement(cust).click().build().perform();
    	
    /*	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("customer"))).click();*/
    	
		
	 //    	Customer.click();
		
	}
    public void selectcust() {
    	
   // 	Customer.get(4);
    	
        driver.findElement(By.xpath("//*[@id=\"customer_chosen\"]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"customer_chosen\"]/div/div/input")).sendKeys("Santhos Ltd (Santosh)");
    	
		//Select customer1= new Select(Customer);
		//customer1.selectByValue("4");
		
		
	}
public void show() {
	
	WebElement element = show;
	Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
		
	//	show.click();
		
	}   
    

   public String isFileDownloaded(String downloadPath, String fileName) {
	  File dir = new File(downloadPath);
	  File[] dirContents = dir.listFiles();

	  for (int i = 0; i < dirContents.length; i++) {
	      if (dirContents[i].getName().equals(fileName)) {
	          // File has been found, it can now be deleted:
	          dirContents[i].delete();
	          return "a";
	      }
	          }
	      return "b";
	  }
    
     public void showentries() {
    	
		Select entries= new Select(show);
		entries.selectByIndex(1);
	}
    public void paging() {
		
		page2.click();
		
	}   
    
   public void copy() {
		
		copybtn.click();
		
	}
   public void xl() {
	
	xlbtn.click();
	
   }
  public void csv() {
	
	csvbtn.click();
	
 }
  public void columns() {
		
		columns.click();
		
	 }
  
  public void selcol()
  {
	  driver.findElement(By.xpath("/html/body/ul/li[6]")).click();
  }
  
 public void pdf() {
	
	pdfbtn.click();
	
 }
    public void submit() {
	
    	 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.name("submit"))).click();
	//	submit.click();
		
	}
}
