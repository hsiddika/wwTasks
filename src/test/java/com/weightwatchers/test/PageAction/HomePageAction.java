package com.weightwatchers.test.PageAction;

import com.weightwatchers.test.PageLocator.HomePageLocator;
import com.weightwatchers.test.Util.TestBase;

public class HomePageAction extends TestBase {
	HomePageLocator homePageLocator = new HomePageLocator();

	public void FindWorkshop() {
		homePageLocator.FindWorkshop.click();
	}

	public void TypeZipCodeSearchField() {
		homePageLocator.SearchField.sendKeys("10011");

	}

	public void ClickOnSearch() {
		homePageLocator.Search.click();
	}
	
	public String FirstSearchResult() {
		return homePageLocator.zipCodeResult.getText();
	}
}