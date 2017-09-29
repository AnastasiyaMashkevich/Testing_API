package com.epam.test.api.tests;


import org.testng.annotations.Test;

import java.io.IOException;

public class test extends BaseTest{


	@Test
	public void test () throws IOException {

		serviceHelper.getGeneralInfo();
		serviceHelper.getComicsList();

	}


}
