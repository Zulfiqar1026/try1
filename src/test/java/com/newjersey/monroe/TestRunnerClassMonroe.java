package com.newjersey.monroe;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features4"} , //feature file location will come under double quote
plugin = {"json:target/cucumber.json"},//no change ; this is official by default for cucumber report printing
glue = "StepDefinition4")//tags= {"@Mont"}) //glue means step definition; glue look for package name under StepDefiniton:




public class TestRunnerClassMonroe extends AbstractTestNGCucumberTests {

	
	
	
	
	
}
