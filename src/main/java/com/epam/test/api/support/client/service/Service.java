package com.epam.test.api.support.client.service;

import com.epam.test.api.support.model.GeneralInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Service {

	@GET("/v1/public/characters")
	public Call<ResponseBody> getCharactersList(@Query("ts") String ts, @Query("apikey") String apiKey, @Query("hash") String hash);

	@GET("/v1/public/characters/{characterId}")
	public Call<ResponseBody> getCharacter(@Path("characterId") String characterId, @Query("ts") String ts, @Query("apikey") String apiKey, @Query("hash") String hash);

	@GET("/v1/public/comics")
	public Call<ResponseBody> getComicsList(@Query("ts") String ts, @Query("apikey") String apiKey, @Query("hash") String hash);

	@GET("/v1/public/comics/{comicsId}/characters")
	public Call<ResponseBody> getComics(@Path("characterId") String characterId, @Query("ts") String ts, @Query("apikey") String apiKey, @Query("hash") String hash);

}

