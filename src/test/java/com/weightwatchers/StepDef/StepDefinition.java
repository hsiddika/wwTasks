package com.weightwatchers.StepDef;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.Assert;

import com.weightwatchers.test.PageAction.HomePageAction;
import com.weightwatchers.test.Util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends TestBase {
    Logger logger = Logger.getLogger(StepDefinition.class.getName()); 	
    HomePageAction homePageAction = new HomePageAction();

	@Given("^Launch \"([^\"]*)\"$")
	public void launch_url(String URL) throws Throwable {
		geturl(URL);
        logger.log(Level.INFO, "launch_url"); 

	}

	@Then("^Verify Page Title$")
	public void verify_Page_Title() throws Throwable {
		String ExpectedTitle = prop.getProperty("pageTitle");
		String ActualTitle = getTitlePage();
        logger.log(Level.INFO, "Page_Title "+ActualTitle); 
		Assert.assertEquals(ActualTitle, ExpectedTitle);
        logger.log(Level.INFO, "verify_Page_Title"); 

	}

	@When("^Click on find a workshop$")
	public void click_on_find_a_workshop() throws Throwable {
		homePageAction.FindWorkshop();
        logger.log(Level.INFO, "click_on_find_a_workshop"); 

	}

	@Then("^Verify title of Workshop page$")
	public void verify_title_of_Workshop_page() throws Throwable {
		String ExpectedTitle = prop.getProperty("findPageTitle");
		String ActualTitle = getTitlePage();
        logger.log(Level.INFO, "title_of_Workshop_page "+ActualTitle); 
		Assert.assertEquals(ActualTitle, ExpectedTitle);
        logger.log(Level.INFO, "verify_title_of_Workshop_page"); 

	}

	@And("^Type zipcode search field$")
	public void type_zipcode_search_field() throws Throwable {
		homePageAction.TypeZipCodeSearchField();
        logger.log(Level.INFO, "type_zipcode_search_field"); 

	}

	@And("^Click on search$")
	public void click_on_search() throws Throwable {
		homePageAction.ClickOnSearch();
        logger.log(Level.INFO, "click_on_search"); 

	}
	@Then("^Verify title of first search$")
	public void verify_title_of_first_search() throws Throwable {
		String actualResult = homePageAction.FirstSearchResult();
		String expectedResult = prop.getProperty("firstSearchResult");
        logger.log(Level.INFO, "title_of_first_search "+actualResult); 
		Assert.assertEquals(actualResult, expectedResult);
        logger.log(Level.INFO, "verify_title_of_first_search"); 
	}
	
}