package com.phase2.steps;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\sudar\\ATE_selenium_p1\\Star-health-application-phase2-main\\src\\test\\resource\\Features\\StarHealth.feature",
 glue = {"com.phase2.steps"},
 dryRun = false,
 plugin = {"pretty",
 "html:target/Testreport.html",
 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
 "timeline:test-output-thread/"
 },
 monochrome = true // console output will be in more readable format
 )
public class MyRunner {
 } 
