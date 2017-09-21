package com.epam.test.api.tests;

import com.epam.test.api.support.client.ServiceHelper;
import com.epam.test.api.support.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	private WebDriver driver;
	public WebDriver initBrowser() throws Exception {
		return driver = DriverFactory.getDriver("chrome");
	}
	@Test
	public void openPage () throws Exception {
		initBrowser();
		driver.navigate().to("https://github.com");
	}

//	@Test
//	public void test() {
//		System.out.println(new ServiceHelper().getList("123").getTotalCount());
//
//	}
}
