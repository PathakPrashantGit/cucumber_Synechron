package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/java"},
		glue="stepDefinations",
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
		//tags="@gmail and @yahoo")
public class TestRunner extends AbstractTestNGCucumberTests{

}
