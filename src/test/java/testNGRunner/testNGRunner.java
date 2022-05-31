package testNGRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

			
		
@CucumberOptions (
	      
	      features = {"Features"},
	      glue = {"stefDefs"}
	      
	      )


public class testNGRunner extends AbstractTestNGCucumberTests {
	
	
	

}
 