package com.weightwatchers.test.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		prop = new Properties();

		FileInputStream fle;
		try {
			fle = new FileInputStream(
					System.getProperty("user.dir") + "./src/test/java/com/weightwatchers/test/config/config.properties");
			prop.load(fle);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Initilization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utility.page_Lo_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utility.implicitly_Wait, TimeUnit.SECONDS);

	}

	public static void geturl(String URL) {
		driver.get(prop.getProperty("urlqa"));
	}

	public static String getTitlePage() {
		driver.manage().timeouts().implicitlyWait(Utility.implicitly_Wait, TimeUnit.SECONDS);
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
}
