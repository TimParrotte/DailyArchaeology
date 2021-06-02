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

@Service
public class MetApiService {
	
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
    
	public Item convertJsonToItem(String apiResponseJson) {
		Item item = new Item();
		JsonParser parser = JsonParserFactory.getJsonParser();
		Map<String, Object> apiResponseMap = parser.parseMap(apiResponseJson);
		item.setObjectId((int) apiResponseMap.get("objectID"));
		item.setIsHighlight((Boolean) apiResponseMap.get("isHighlight"));
		item.setAccessionNumber((String) apiResponseMap.get("accessionNumber"));
		item.setAccessionYear((String) apiResponseMap.get("accessionYear"));
		item.setIsPublicDomain((Boolean) apiResponseMap.get("isPublicDomain"));
		item.setPrimaryImage((String) apiResponseMap.get("primaryImage"));
		item.setPrimaryImageSmall((String) apiResponseMap.get("primaryImageSmall"));
		item.setAdditionalImages((ArrayList<String>) apiResponseMap.get("additionalImages"));
		item.setConstituents((ArrayList<String>) apiResponseMap.get("constituents"));
		item.setDepartment((String) apiResponseMap.get("department"));
		item.setObjectName((String) apiResponseMap.get("objectName"));
		item.setTitle((String) apiResponseMap.get("title"));
		item.setCulture((String) apiResponseMap.get("culture"));
		item.setPeriod((String) apiResponseMap.get("period"));
		item.setDynasty((String) apiResponseMap.get("dynasty"));
		item.setReign((String) apiResponseMap.get("reign"));
		item.setPortfolio((String) apiResponseMap.get("portfolio"));
		item.setArtistRole((String) apiResponseMap.get("artistRole"));
		item.setArtistPrefix((String) apiResponseMap.get("artistPrefix"));
		item.setArtistDisplayName((String) apiResponseMap.get("artistDisplayName"));
		item.setArtistDisplayBio((String) apiResponseMap.get("artistDisplayBio"));
		item.setArtistSuffix((String) apiResponseMap.get("artistSuffix"));
		item.setArtistAlphaSort((String) apiResponseMap.get("artistAlphaSort"));
		item.setArtistNationality((String) apiResponseMap.get("artistNationality"));
		item.setArtistBeginDate((String) apiResponseMap.get("artistBeginDate"));
		item.setArtistEndDate((String) apiResponseMap.get("artistEndDate"));
		item.setArtistGender((String) apiResponseMap.get("artistGender"));
		item.setArtistWikidata_URL((String) apiResponseMap.get("artistWikidata_URL"));
		item.setArtistULAN_URL((String) apiResponseMap.get("artistULAN_URL"));
		item.setObjectDate((String) apiResponseMap.get("objectDate"));
		item.setObjectBeginDate((Integer) apiResponseMap.get("objectBeginDate"));
		item.setObjectEndDate((Integer) apiResponseMap.get("objectEndDate"));
		item.setMedium((String) apiResponseMap.get("medium"));
		item.setDimensions((String) apiResponseMap.get("dimensions"));
		item.setMeasurements((ArrayList<String>) apiResponseMap.get("measurements"));
		item.setCreditLine((String) apiResponseMap.get("creditLine"));
		item.setGeographyType((String) apiResponseMap.get("geographyType"));
		item.setCity((String) apiResponseMap.get("city"));
		item.setState((String) apiResponseMap.get("state"));
		item.setCounty((String) apiResponseMap.get("county"));
		item.setCountry((String) apiResponseMap.get("country"));
		item.setRegion((String) apiResponseMap.get("region"));
		item.setSubregion((String) apiResponseMap.get("subregion"));
		item.setLocale((String) apiResponseMap.get("locale"));
		item.setLocus((String) apiResponseMap.get("locus"));
		item.setExcavation((String) apiResponseMap.get("excavation"));
		item.setRiver((String) apiResponseMap.get("river"));
		item.setClassification((String) apiResponseMap.get("classification"));
		item.setRightsAndReproduction((String) apiResponseMap.get("rightsAndReproduction"));
		item.setLinkResource((String) apiResponseMap.get("linkResource"));
		item.setMetadataDate((String) apiResponseMap.get("metadataDate"));
		item.setRepository((String) apiResponseMap.get("repository"));
		item.setObjectURL((String) apiResponseMap.get("objectURL"));
		item.setTags((ArrayList<String>) apiResponseMap.get("tags"));
		item.setObjectWikidata_URL((String) apiResponseMap.get("objectWikidata_URL"));
		item.setIsTimelineWork((Boolean) apiResponseMap.get("isTimelineWork"));
		item.setGalleryNumber((String) apiResponseMap.get("GalleryNumber"));
		return item;
	}
    
	public SearchResult convertJsonToSearchResult(String apiResponseJson) throws JsonProcessingException {
		SearchResult searchResult = new SearchResult();
		JsonParser parser = JsonParserFactory.getJsonParser();
		Map<String, Object> apiResponseMap = parser.parseMap(apiResponseJson);
		searchResult.setTotal((int) apiResponseMap.get("total"));
		searchResult.setObjectIDs((ArrayList<Integer>) apiResponseMap.get("objectIDs"));
		return searchResult;
	}
	
	public ArrayList<Integer> getAncientOldWorldObjectIds() throws JsonProcessingException, IOException, InterruptedException {
    	ArrayList<Integer> objectIds = new ArrayList<>();
    	SearchResult nearEastResult = convertJsonToSearchResult(getApiResponseAsJson(constructApiRequestForDepartment(ancientNearEastDepartmentNumber)));
    	SearchResult egyptianResult = convertJsonToSearchResult(getApiResponseAsJson(constructApiRequestForDepartment(egyptianArtDepartmentNumber)));
    	SearchResult grecoRomanResult = convertJsonToSearchResult(getApiResponseAsJson(constructApiRequestForDepartment(greekAndRomanArtDepartmentNumber)));
    	objectIds.addAll(nearEastResult.getObjectIDs());
    	objectIds.addAll(egyptianResult.getObjectIDs());
    	objectIds.addAll(grecoRomanResult.getObjectIDs());
    	return objectIds;
    }
    
	public static String getApiResponseAsJson(String apiRequest) throws IOException, InterruptedException {
	   URI uri = URI.create(apiRequest);
	   HttpRequest request = HttpRequest.newBuilder() .GET().uri(uri).build();
	   HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
	   return response.body();
   }

	public Item getItemForDisplay() throws JsonProcessingException, IOException, InterruptedException {
		String url = constructApiRequestForItem(getRandomItemId(getAncientOldWorldObjectIds()));
		String apiResponse = getApiResponseAsJson(url);
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
