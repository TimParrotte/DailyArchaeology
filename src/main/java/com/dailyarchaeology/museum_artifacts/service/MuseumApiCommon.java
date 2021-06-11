package com.dailyarchaeology.museum_artifacts.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class MuseumApiCommon {
	
	public static String getApiResponseAsJson(String apiRequest, HttpClient httpClient) throws IOException, InterruptedException {
		   URI uri = URI.create(apiRequest);
		   HttpRequest request = HttpRequest.newBuilder() .GET().uri(uri).build();
		   HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		   return response.body();
	   }

	abstract public <T> Object convertJsonToItem(String apiReponseJson);
	
}
