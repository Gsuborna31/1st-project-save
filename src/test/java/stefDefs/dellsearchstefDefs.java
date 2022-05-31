package stefDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjecetModel.dellsearchPOM;

public class dellsearchstefDefs {
	
	WebDriver driver;
	
	@Given("^user visit dell home page$")
	public void user_visit_dell_home_page() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		
	driver = new ChromeDriver();
	
	driver.get("https://www.dell.com/en-us");
	}
	@When("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
	 
	dellsearchPOM dsp = new dellsearchPOM ();
	dsp.dellsearch().click();
	}
	

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		
		
	 
	}

	
	

}
