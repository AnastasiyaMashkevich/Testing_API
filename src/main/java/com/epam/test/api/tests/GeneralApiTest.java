package com.epam.test.api.tests;



import com.epam.test.api.support.model.GeneralInfo;
import com.epam.test.api.support.utils.constants.ProjectConstants;
import okhttp3.Request;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import retrofit2.Response;

public class GeneralApiTest extends BaseTest {

	private static final int FIRST_ITEM = 0;

	@Test
	public void responseBodyTest() {
		GeneralInfo generalInfo = serviceHelper.getCharactersListObject();

		Assert.assertNotNull(generalInfo, "Object was not received from request. ");
		Assert.assertTrue(generalInfo.getData().getResults().size() != 0, "Results list should be more then zero.");

	}

	@Test
	public void generalRequestTest() {
		int characterId = serviceHelper.getCharacterId(FIRST_ITEM);
		Request request = serviceHelper.getCharacterRequest(characterId);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(request.method().equals(ProjectConstants.GET_METHOD),
				String.format("Method should be %s", ProjectConstants.GET_METHOD));

		softAssert.assertEquals(request.url().host(), ProjectConstants.MAIN_HOST,
				String.format("Request is not correct. Host should be as %s", ProjectConstants.MAIN_HOST));
		softAssert.assertAll();
	}

	@Test
	public void generalResponceTest() {

		Response response = serviceHelper.getComicsListResponse();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(response.code(), ProjectConstants.SUCCESS_STATUS_CODE,
				"Status code is not correct. ");
		softAssert.assertTrue(response.isSuccessful(), "Response error.");
		softAssert.assertEquals(response.raw().message(),ProjectConstants.SUCCESS_STATUS_MESSAGE,
				"Status message is not correct. ");

		softAssert.assertTrue(response.raw().protocol().toString().contains(ProjectConstants.PROTOCOL),
				"Protocol is not correct. ");
		softAssert.assertTrue(response.headers().size() != 0, "Header values are not present.");
		softAssert.assertAll();
	}
}
