package com.dailyarchaeology.museum_artifacts.service;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Collections;
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
    
	public ArrayList<Integer> getAncientOldWorldObjectIds() throws JsonProcessingException, IOException, InterruptedException {
    	ArrayList<Integer> objectIds = new ArrayList<>();
    	MetSearchResult nearEastResult = convertJsonToPojo(getApiResponseAsJson(constructApiRequestForDepartment(ancientNearEastDepartmentNumber), httpClient), MetSearchResult.class);
    	MetSearchResult egyptianResult = convertJsonToPojo(getApiResponseAsJson(constructApiRequestForDepartment(egyptianArtDepartmentNumber), httpClient), MetSearchResult.class);
    	MetSearchResult grecoRomanResult = convertJsonToPojo(getApiResponseAsJson(constructApiRequestForDepartment(greekAndRomanArtDepartmentNumber), httpClient), MetSearchResult.class);
    	objectIds.addAll(nearEastResult.getObjectIDs());
    	objectIds.addAll(egyptianResult.getObjectIDs());
    	objectIds.addAll(grecoRomanResult.getObjectIDs());
    	return objectIds;
    }

	public MetItem getItemForDisplay() throws JsonProcessingException, IOException, InterruptedException {
		String url = constructApiRequestForItem(getRandomItemId(getAncientOldWorldObjectIds()));
		String apiResponse = getApiResponseAsJson(url, httpClient);
		return convertJsonToPojo(apiResponse, MetItem.class);
	}

	public Integer getRandomItemId(ArrayList<Integer> objectIds) throws IOException {
		if (objectIds.size() > 0) {
			Collections.shuffle(objectIds);
			return objectIds.get(0);
		}
		throw new IOException();
	}
}
