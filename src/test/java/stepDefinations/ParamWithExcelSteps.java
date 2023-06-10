package stepDefinations;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.When;
import xls.ShineXlsReader;

public class ParamWithExcelSteps {
	 SoftAssert st;
	 @When("^user enter user name and password from (.+)$")
	 	    public void user_enter_user_name_and_password_from(int rownum) throws Throwable {
		 	st=new SoftAssert();
	      ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
	      String name = xls.getCellData("Sheet1", 0, rownum);
	      String password = xls.getCellData("Sheet1", 1, rownum);
	      System.out.println("user entered name as "+name+" and password as "+password);
	      st.assertEquals(10, 20);
	    }
	/* @Before
	 public void beforeEachscenario1(){
		 System.out.println("------------------www.gmail.com---------------------------");
	 }*/
	 @After("@param")
	 public void afterEachscenario1(){
		 st.assertAll();
		// System.out.println("----------------------------www.gmail.com------------------------------");
	 }
	/* @Before("@yahoo")
	 public void beforeEachscenario2(){
		 System.out.println("---------------------------------------www.yahoo.com-------------------------");
	 }
	 @After("@yahoo")
	 public void afterEachscenario2(){
		 System.out.println("-----------------------------www.yahoo.com-------------------------------------");
	 }*/
	 @BeforeAll
	 public static  void beforeAll(){
		 System.out.println("-------------------------------Start server....--------------------------------");
	 }
	 @AfterAll
	 public static void afterAll(){
		 System.out.println("--------------------Shutdown server...---------------------------------------");
		 
	 }
	 @BeforeStep("@param")
	 public void bstep(){
		 System.out.println("Screen shot of page before step execution");
	 }
	 @AfterStep("@param")
	 public void astep(){
		 System.out.println("Screen shot of page after step execution");
	 }
	 
}
