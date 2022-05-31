package stefDefs;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebooksignupstefDefs {
	
	@Given("^user visits facebook url$")
	public void user_visits_facebook_url() throws Throwable {
	   
	System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\\\chromedriver.exe");
	
	
	

	}	
		@When("^user enters \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    
	}

	@When("^user select dropdown \"([^\"]*)\" and dropdown \"([^\"]*)\" and dropdown \"([^\"]*)\"$")
	public void user_select_dropdown_and_dropdown_and_dropdown(String arg1, String arg2, String arg3) throws Throwable {
	    
	}

	@When("^user select \"([^\"]*)\"$")
	public void user_select(String arg1) throws Throwable {
	   
	}

	@When("^click Sign Up$")
	public void click_Sign_Up() throws Throwable {
	    
	}

	@When("^user reconfirm \"([^\"]*)\" and click Sign Up button again$")
	public void user_reconfirm_and_click_Sign_Up_button_again(String arg1) throws Throwable {
	    
	}

	@Then("^user will be able to sigup successfully$")
	public void user_will_be_able_to_sigup_successfully() throws Throwable {
	   

}
}
