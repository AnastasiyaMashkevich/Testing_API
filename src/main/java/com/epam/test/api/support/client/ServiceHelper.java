package com.epam.test.api.support.client;

import com.epam.test.api.model.RepositoriesList;
import com.epam.test.api.support.Service;
import com.epam.test.api.support.client.adapter.wrapper.ServiceWrapper;

public class ServiceHelper {
	private Service service;

	public ServiceHelper() {
		service = ServiceWrapper.getInstance();
	}

	public RepositoriesList getList(String query) {
		return service.getRepositoriesListByQuery(query);
	}


}
