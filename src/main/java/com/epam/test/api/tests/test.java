package com.epam.test.api.tests;

import com.epam.test.api.support.driver.DriverFactory;
import com.epam.test.api.support.pageobject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test  extends BaseTest{

	@BeforeTest(description = "Init browser")
	public void setUp() {
	}
	@Test
	public void openPage () throws Exception {

		driver.navigate().to("https://github.com");
		new LoginPage(driver).login();
	}

//	@Test
//	public void test() {
//		System.out.println(new ServiceHelper().getList("123").getTotalCount());
//
//	}
}
