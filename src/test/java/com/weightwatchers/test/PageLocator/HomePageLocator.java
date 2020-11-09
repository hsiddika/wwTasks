package com.weightwatchers.test.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.weightwatchers.test.Util.TestBase;

public class HomePageLocator extends TestBase {

	public HomePageLocator() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div/div/div/div[2]/div[1]/ul/li[1]/a/span/span[2]")
	public WebElement FindWorkshop;
	@FindBy(how = How.ID, using = "location-search")
	public WebElement SearchField;
	@FindBy(how = How.ID, using = "location-search-cta")
	public WebElement Search;
	@FindBy(how = How.XPATH, using = "//*[@id=\"location-1180510\"]/a/div[1]/div/a")
	public WebElement zipCodeResult;
	
}