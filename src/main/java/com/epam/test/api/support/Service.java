package com.epam.test.api.support;


import com.epam.test.api.model.RepositoriesList;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

	@GET("/search/repositories")
	public RepositoriesList getRepositoriesListByQuery(@Query("q") String query);
}
