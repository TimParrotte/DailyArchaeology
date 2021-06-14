package com.dailyarchaeology.museum_artifacts.service;

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

import com.dailyarchaeology.museum_artifacts.domain.MetItem;
import com.dailyarchaeology.museum_artifacts.domain.MetSearchResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MetApiService extends MuseumApiCommon {
	
    private static final String baseMetApiUrl = "https://collectionapi.metmuseum.org/public/collection/v1/";
    private static final String metApiUrlObjectEndpoint = "objects";
    private static final String searchByDepartmentUrl = "?departmentIds=";
    private static final Integer ancientNearEastDepartmentNumber = 3;
    private static final Integer egyptianArtDepartmentNumber = 10;
    private static final Integer greekAndRomanArtDepartmentNumber = 13;

    private static final HttpClient httpClient = HttpClient.newHttpClient();
    
    public static String constructApiRequestForDepartment(Integer departmentNumber) {
    	return baseMetApiUrl + metApiUrlObjectEndpoint + searchByDepartmentUrl + departmentNumber;
    }
    
    public static String constructApiRequestForItem(Integer itemNumber) {
        return baseMetApiUrl + metApiUrlObjectEndpoint + "/" + itemNumber;
    }
    
    @Override
	public MetItem convertJsonToItem(String apiResponseJson) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		return objectMapper.readValue(apiResponseJson, MetItem.class);
	}
    
	public MetSearchResult convertJsonToSearchResult(String apiResponseJson) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		return objectMapper.readValue(apiResponseJson, MetSearchResult.class);
	}
	
	public ArrayList<Integer> getAncientOldWorldObjectIds() throws JsonProcessingException, IOException, InterruptedException {
    	ArrayList<Integer> objectIds = new ArrayList<>();
    	MetSearchResult nearEastResult = convertJsonToSearchResult(getApiResponseAsJson(constructApiRequestForDepartment(ancientNearEastDepartmentNumber), httpClient));
    	MetSearchResult egyptianResult = convertJsonToSearchResult(getApiResponseAsJson(constructApiRequestForDepartment(egyptianArtDepartmentNumber), httpClient));
    	MetSearchResult grecoRomanResult = convertJsonToSearchResult(getApiResponseAsJson(constructApiRequestForDepartment(greekAndRomanArtDepartmentNumber), httpClient));
    	objectIds.addAll(nearEastResult.getObjectIDs());
    	objectIds.addAll(egyptianResult.getObjectIDs());
    	objectIds.addAll(grecoRomanResult.getObjectIDs());
    	return objectIds;
    }

	public MetItem getItemForDisplay() throws JsonProcessingException, IOException, InterruptedException {
		String url = constructApiRequestForItem(getRandomItemId(getAncientOldWorldObjectIds()));
		String apiResponse = getApiResponseAsJson(url, httpClient);
		return convertJsonToItem(apiResponse);
	}

	public Integer getRandomItemId(ArrayList<Integer> objectIds) throws IOException {
		if (objectIds.size() > 0) {
			Collections.shuffle(objectIds);
			return objectIds.get(0);
		}
		throw new IOException();
	}
}
