package DevOps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStepDefination {

	
public  WebDriver driver=null; 
public  String baseUrl; 
	
@Given("^I open google page$")
public void opengoogle() throws Throwable {
	     System.out.println("OpenGooglePage");
}

@When("^I search alphanuric character$")
public void searchalphanumeric() throws Throwable {
	   System.out.println("SearchAlphanumeric");
}

@Then("^I didn't get an error$")
public void checkresult() throws Throwable {
	System.out.println("Error");
}
	
}
