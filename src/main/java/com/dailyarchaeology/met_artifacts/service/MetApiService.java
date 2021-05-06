package com.dailyarchaeology.met_artifacts.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.stereotype.Service;

import com.dailyarchaeology.met_artifacts.domain.Item;
import com.dailyarchaeology.met_artifacts.domain.SearchResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MetApiService {
	
    private static final String baseMetApiUrl = "https://collectionapi.metmuseum.org/public/collection/v1/";
    private static final String metApiUrlObjectEndpoint = "object/";
    private static final String metApiUrlSearch = "search?";
    private static final String searchByDepartmentUrl = "search?departmentId=";


    private static final Integer ancientNearEastDepartmentNumber = 3;
    private static final Integer egyptianArtDepartmentNumber = 10;
    private static final Integer greekAndRomanArtDepartmentNumber = 13;

    private final HttpClient httpClient = HttpClient.newHttpClient();
    
    public static String getItemUrl(Integer itemNumber) {
        return baseMetApiUrl + metApiUrlObjectEndpoint + itemNumber;
    }

    public static String getAncientNearEastArtUrl() {
        return baseMetApiUrl + searchByDepartmentUrl + ancientNearEastDepartmentNumber;
    }

    public static String getEgyptianArtUrl() {
        return baseMetApiUrl + searchByDepartmentUrl + egyptianArtDepartmentNumber;
    }

    public static String getGreekAndRomanArtUrl() {
        return baseMetApiUrl + searchByDepartmentUrl + greekAndRomanArtDepartmentNumber;
    }
    
    public Integer selectRandomItem(SearchResult results) throws Exception {
    	if  (results != null) {
    		ArrayList<Integer> objectIds = results.getObjectIDs();
    		Collections.shuffle(objectIds);
    		return objectIds.get(0);
    	}
    	throw new Exception();  //This is probably better as a try/catch block.
    }
	
	public String getApiResponseAsString(String itemUrl) throws IOException, InterruptedException {
	   URI uri = URI.create(itemUrl);
	   HttpRequest request = HttpRequest.newBuilder()
			   .GET().uri(uri).build();
			  
	   HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
	   return response.body();
   }

	public Item convertApiResponseToItem(String apiResponse) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(apiResponse, Item.class);
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public SearchResult convertApiResponseToSearchResult(String apiResponse) throws JsonProcessingException {
		SearchResult searchResult = new SearchResult();
		JsonParser parser = JsonParserFactory.getJsonParser();
		Map<String, Object> apiResponseMap = parser.parseMap(apiResponse);
		searchResult.setTotal((int) apiResponseMap.get("total"));
		searchResult.setObjectIDs((ArrayList<Integer>) apiResponseMap.get("objectIDs"));
		return searchResult;
	}
}
