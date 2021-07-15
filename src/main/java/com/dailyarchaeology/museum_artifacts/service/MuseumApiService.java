package com.dailyarchaeology.museum_artifacts.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.dailyarchaeology.museum_artifacts.domain.UniversalItemDto;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class MuseumApiService {
	
	public static String getApiResponseAsJson(String apiRequest, HttpClient httpClient)
			throws IOException, InterruptedException {
		   URI uri = URI.create(apiRequest);
		   HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
		   HttpResponse<String> response = httpClient.send(request,
				   HttpResponse.BodyHandlers.ofString());
		   return response.body();
	   }

	public <T> T convertJsonToPojo(String jsonString, Class<T> pojo)
			throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		return objectMapper.readValue(jsonString, pojo);
	}

	public abstract UniversalItemDto getRandomItem() throws IOException, InterruptedException;
}
