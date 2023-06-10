package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MystepDefinations {
	 	@Given("^user is in the loginpage$")
	    public void user_is_in_the_loginpage() throws Throwable {
	      //selenium code to login
	 		System.out.println("user opened browser and entered url");
	    }

	    @When("^user entered valid username and password$")
	    public void user_entered_valid_username_and_password() throws Throwable {
	        System.out.println("user entered valid username and password");
	    }

	    @Then("^sucessfully should login$")
	    public void sucessfully_should_login() throws Throwable {
	       System.out.println("Loggedin sucessfully");
	    }

	    @And("^click on sigin button$")
	    public void click_on_sigin_button() throws Throwable {
	      System.out.println("user clicked on signbutton"); 
	    }
	    @When("user entered invalid username and password")
	    public void user_entered_invalid_username_and_password() {
	      System.out.println("user entered invalid username and password"); 
	    }
	    @Then("sucessfully should not login")
	    public void sucessfully_should_not_login() {
	      System.out.println("Login not happened");
	    }
	    @When("^user entered valid username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	    public void user_entered_valid_username_as_something_and_password_as_something(String name, String pwd) throws Throwable {
	      System.out.println("user enterd user name as "+name+" and password as "+pwd); 
	    }
	    //Register page
	    @Given("^user is in the register page for Timesjob portal$")
	    public void user_is_in_the_register_page_for_timesjob_portal() throws Throwable {
	      System.out.println("user is in the registerpage");  
	    }

	   

	    @Then("^sucessfully an account should be created$")
	    public void sucessfully_an_account_should_be_created() throws Throwable {
	       System.out.println("sucessfully registered,,,");
	       
	    }

	    @And("^click on register button$")
	    public void click_on_register_button() throws Throwable {
	       System.out.println("clicked on register button");
	       
	    }

}
//hot key to import all packages --->ctlr+shift+o