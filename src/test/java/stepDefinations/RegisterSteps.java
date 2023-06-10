package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class RegisterSteps {
	 @When("^user enter following details$")
	    public void user_enter_following_details(DataTable table) throws Throwable {
	       List<List<String>> li = table.cells();
	       String fname = li.get(0).get(0);
	       String lname = li.get(0).get(1);
	       String phonenum = li.get(0).get(2);
	       String email = li.get(0).get(3);
	       String location = li.get(0).get(4);
	       System.out.println("user entered firstname as "+fname+" lastname as "+lname+"phone number as "+phonenum+" email as "+email+" and location is "+location);
	    }
}
