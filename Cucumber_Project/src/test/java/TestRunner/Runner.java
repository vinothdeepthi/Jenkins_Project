package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"C:\\Users\\admin\\eclipse-workspace\\Cucumber_Project\\src\\test\\resources\\FeatruesFills"},
		dryRun = !true,
		glue = "StepDefention",
		//snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	    
	     )

		
		
		
		
		

public class Runner extends AbstractTestNGCucumberTests{

}
