package com.epam.test.api.support.utils;


import com.epam.test.api.support.client.service.Service;
import com.epam.test.api.support.client.wrapper.ServiceWrapper;
import com.epam.test.api.support.model.GeneralInfo;
import com.epam.test.api.support.utils.constants.ProjectConstants;
import okhttp3.ResponseBody;
import retrofit2.Call;

import java.io.IOException;

public class ServiceHelper {
	private Service service;
	private String ts = ProjectConstants.TS;
	private String publicKey = ProjectConstants.PUBLIC_KEY;
	private String hash = ProjectConstants.HASH;

	public ServiceHelper() {
		service = ServiceWrapper.getInstance();
	}

	public Call<ResponseBody> getList() {
		return service.getCharactersList(ts, publicKey, hash);
	}

	public Call getComicsList() {
		return service.getComicsList(ts, publicKey, hash);
	}


	public GeneralInfo getGeneralInfo() throws IOException {
		String body =  new String(getList().execute().body().bytes());
		return JsonHelper.fromJson(body, GeneralInfo.class);
	}




}
