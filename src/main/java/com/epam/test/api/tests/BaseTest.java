package com.epam.test.api.tests;

import com.epam.test.api.support.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod(description = "Init browser")
	public void setUp() {
		driver = DriverFactory.getDriver("chrome");
	}
}
