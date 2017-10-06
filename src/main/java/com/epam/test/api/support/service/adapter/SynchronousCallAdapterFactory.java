package com.epam.test.api.support.service.adapter;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.logging.Logger;

public class SynchronousCallAdapterFactory extends CallAdapter.Factory {

	public static SynchronousCallAdapterFactory create() {
		return new SynchronousCallAdapterFactory();
	}

	public CallAdapter<?, ?> get(final Type returnType, Annotation[] annotations, Retrofit retrofit) {

		return new CallAdapter<ResponseBody, Object>() {
			@Override
			public Type responseType() {
				return returnType;
			}

			@Override
			public Object adapt(Call<ResponseBody> call) {
				try {
					return call.execute().body();
				} catch (IOException e) {
					e.printStackTrace();
					Logger.getLogger("Error during requesting: ".concat(e.getMessage()));
					return null;
				}
			}
		};

	}

}
