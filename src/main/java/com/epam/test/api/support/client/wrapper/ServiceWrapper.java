package com.epam.test.api.support.client.wrapper;


import com.epam.test.api.support.client.service.Service;
import com.epam.test.api.support.client.wrapper.adapter.SynchronousCallAdapterFactory;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

public class ServiceWrapper {

    private static String baseUrl = "https://gateway.marvel.com";


    private static ThreadLocal<Retrofit> clients = new ThreadLocal<Retrofit>() {
            @Override
            protected Retrofit initialValue() {
                OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(30, TimeUnit.SECONDS).build();
                return new Retrofit.Builder().client(client).baseUrl(baseUrl)
//                        .addCallAdapterFactory(SynchronousCallAdapterFactory.create())
                        .addConverterFactory(JacksonConverterFactory.create()).build();
            }
        };


    public static Service getInstance() {
        Retrofit retrofit = clients.get();
        return retrofit.create(Service.class);
    }
}
