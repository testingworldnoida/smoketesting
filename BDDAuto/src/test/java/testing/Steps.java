package testing;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Steps {
	ChromeDriver driver ;
	@Given("^User is on login page$")
	public void User_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	}

	@When("^User enters username$")
	public void User_enters_username() throws Throwable {
	  driver.findElementById("email").sendKeys("Hello");
	}

	@When("^User enters password$")
	public void User_enters_password() throws Throwable {
		driver.findElementById("passl").sendKeys("Hello");
	}

	@When("^User clicks on signin button$")
	public void User_clicks_on_signin_button() throws Throwable {
	  
	}

	@Then("^User should be logged in$")
	public void User_should_be_logged_in() throws Throwable {
	  
	}
	
	@When("^User click on Logout button$")
	public void User_click_on_Logout_button() throws Throwable {
	 
	}

	@Then("^User should be logged out$")
	public void User_should_be_logged_out() throws Throwable {
	 
	}
	
}
