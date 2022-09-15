package com.fpm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestPage {
	public WebDriver driver;
	public Properties prop;

	public WebDriver init_driver(String browserName) {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			if (prop.getProperty("headless").equalsIgnoreCase("yes")) {
				// headless mode
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			} else {
				driver = new ChromeDriver();
			}
		}

		return driver;

	}

	public Properties init_Properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\PJ\\eclipse-workspace\\Facebook_KeywordDrivenFramework\\src\\main\\java\\com\\fpm\\qa"
							+ "\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}
