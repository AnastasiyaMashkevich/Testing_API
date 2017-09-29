package com.epam.test.api.tests;
import com.epam.test.api.support.utils.ServiceHelper;

import org.testng.annotations.BeforeTest;

public class BaseTest {
	public ServiceHelper serviceHelper;

	@BeforeTest
	public void setup() {
		serviceHelper = new ServiceHelper();
	}
}
