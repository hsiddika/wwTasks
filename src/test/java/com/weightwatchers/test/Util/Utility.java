package com.weightwatchers.test.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static long page_Lo_Timeout = 40;
	public static long implicitly_Wait = 40;

	public static void takescreenshot(WebDriver driver, String screenshot) {
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String CurrentDir = System.getProperty("user.dir");

		try {
			FileUtils.copyFile(scrfile, new File(CurrentDir + "/Screenshot/" + screenshot + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}