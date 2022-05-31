package pageObjecetModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellsearchPOM {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id=\"mh-search-input\"]")
    WebElement dellsearch;
	
	public WebElement dellsearch() {
		
		return dellsearch;
	}
	
	
	public dellsearchPOM() {
		
	PageFactory.initElements(driver, this);
	
	
	
	
	
	}
	
}
