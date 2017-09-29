package com.epam.test.api.support.utils;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonHelper {
	private static ObjectMapper mapper = new ObjectMapper();

	private JsonHelper() {
	}

	public static <T> T fromJson(String json, Class<T> toClass) {
		try {
			return mapper.readValue(json, toClass);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}
}
