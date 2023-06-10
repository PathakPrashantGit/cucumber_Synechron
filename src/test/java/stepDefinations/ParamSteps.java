package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParamSteps {
	@Given("user is the login page for yahoo")
	public void user_is_the_login_page_for_yahoo() {
	    System.out.println("user is in the login page for yahoo");
	}
	/*@When("user enter user name as Name4 and password as Password4")
	public void user_enter_user_name_as_name4_and_password_as_password4(String cn,String cp) {
	    System.out.println("user entered user name as "+cn+" and password as "+cp);
	}*/
	@When("^user enter user name as (.+) and password as (.+)$")
    public void user_enter_user_name_as_and_password_as(String cn, String cp) throws Throwable {
		 System.out.println("user entered user name as "+cn+" and password as "+cp);
    }
	@When("clicks on login button")
	public void clicks_on_login_button() {
	  System.out.println("user clicked login button");
	}
	@Then("should sucessfully login into application")
	public void should_sucessfully_login_into_application() {
	    System.out.println("sucessfully logged in");
	}
}
