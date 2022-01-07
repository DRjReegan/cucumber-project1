package com.Automation_Practice.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base_Class.BaseClass_Methods;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\AutomationPractice.feature",
	glue = "com\\stepdefinition",
	monochrome = true,
	dryRun = false,
	strict = true,
	plugin = {
			"html:Report/Html_Report",
			"pretty",
			"json:Reports/JsonReport.json",
			"com.cucumber.listener.ExtentCucumberFormatter:ExtentsReport/ExtReport"
			
	})

public class Runner_Class extends BaseClass_Methods {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up(){
	  driver = BaseClass_Methods.getBrowser("chrome");	
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
	
}
