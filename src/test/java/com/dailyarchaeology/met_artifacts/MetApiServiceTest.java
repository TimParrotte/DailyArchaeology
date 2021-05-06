package com.dailyarchaeology.met_artifacts;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void assertThatGetRandomObjectIdReturnsRandomNumbersFromList() throws IOException {
		// GIVEN
		ArrayList<Integer> nums = new ArrayList<>(List.of(0,1,2,3,4));
		SearchResult searchResult = new SearchResult(5, nums);
		
		// WHEN
		Integer num1 = metApiService.getRandomObjectId(searchResult);
		Integer num2 = metApiService.getRandomObjectId(searchResult);
		Integer num3 = metApiService.getRandomObjectId(searchResult);
		Integer num4 = metApiService.getRandomObjectId(searchResult);
		Integer num5 = metApiService.getRandomObjectId(searchResult);
		ArrayList<Integer> randomNums = new ArrayList<>(List.of(num1, num2, num3, num4, num5));
		
		// THEN
		Assertions.assertThat(randomNums).isNotNull();
		Assertions.assertThat(randomNums).isNotEmpty();
		Assertions.assertThat(randomNums).hasSize(5);
		// This final assertion has a small chance of producing a false negative due to its random nature.
		Assertions.assertThat(randomNums).isNotEqualTo(nums);
	}
}
