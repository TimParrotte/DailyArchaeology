package com.dailyarchaeology.met_artifacts;


import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.dailyarchaeology.met_artifacts.service.MetApiService;
import com.dailyarchaeology.met_artifacts.domain.Item;
import com.dailyarchaeology.met_artifacts.domain.SearchResult;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MetApiServiceTest {
	
	Logger log = LoggerFactory.getLogger(MetApiServiceTest.class);

	@Autowired
	private MetApiService metApiService;

	@Test
	public void testThatAStringResponseIsReturnedFromTheMetApi() throws IOException, InterruptedException  {
		// GIVEN
		String itemUrl = "https://collectionapi.metmuseum.org/public/collection/v1/objects/1";
		String expectedResult = "{\"objectID\":1,\"isHighlight\":false,\"accessionNumber\":\"1979.486.1\"";
		
		// WHEN
		String result = metApiService.getApiResponseAsString(itemUrl);
		
		// THEN
		Assertions.assertThat(result).contains(expectedResult);
	}
	
	@Test
	public void assertSearchResultObjectCreatedFromJsonTextTest() throws IOException, InterruptedException {
		// GIVEN
		String searchResultUrl = "https://collectionapi.metmuseum.org/public/collection/v1/search?q=departmentId=3";
		
		// WHEN
		String apiResponse = metApiService.getApiResponseAsString(searchResultUrl);
		SearchResult searchResult = metApiService.convertApiResponseToSearchResult(apiResponse);
				
		// THEN
		Assertions.assertThat(searchResult).isNotNull();
		Assertions.assertThat(searchResult.getTotal()).isGreaterThan(0);
		Assertions.assertThat(searchResult.getObjectIDs().size()).isGreaterThan(0);
	}
	
}
