package com.weightwatchers.test.testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.weightwatchers.test.Util.TestBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"./src/test/resources/Features/HomePage.feature"},format= {"html:target/site/cucumber-pretty"},
glue="com.weightwatchers.StepDef",tags="@Smoke")


public class TestRunner extends AbstractTestNGCucumberTests {
@BeforeTest
public void Setup() {
	TestBase test=new TestBase();
	test.Initilization();
}
 
@AfterTest
public void TearDown() {
	
	TestBase test=new TestBase();
	test.driver.quit();
}

}
