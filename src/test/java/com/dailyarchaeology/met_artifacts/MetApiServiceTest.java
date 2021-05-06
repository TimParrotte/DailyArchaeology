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
import com.fasterxml.jackson.core.JsonProcessingException;
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
		
		// WHEN
		Integer num1 = metApiService.getRandomItemId(nums);
		Integer num2 = metApiService.getRandomItemId(nums);
		Integer num3 = metApiService.getRandomItemId(nums);
		Integer num4 = metApiService.getRandomItemId(nums);
		Integer num5 = metApiService.getRandomItemId(nums);
		ArrayList<Integer> randomNums = new ArrayList<>(List.of(num1, num2, num3, num4, num5));
		
		// THEN
		Assertions.assertThat(randomNums).isNotNull();
		Assertions.assertThat(randomNums).isNotEmpty();
		Assertions.assertThat(randomNums).hasSize(5);
		// This final assertion has a small chance of producing a false negative due to its random nature.
		Assertions.assertThat(randomNums).isNotEqualTo(nums);
	}
	
	@Test
	public void assertThatItemObjectSuccessfullyCreatedFromTheMetApi() {
		// GIVEN
		String jsonString = "{"
				+ "\"objectID\":768252,"
				+ "\"isHighlight\":false,"
				+ "\"accessionNumber\":\"2011.604.12.3\","
				+ "\"accessionYear\":\"2011\","
				+ "\"isPublicDomain\":true,"
				+ "\"primaryImage\":\"https://images.metmuseum.org/CRDImages/gr/original/DVB14699_1_ff.jpg\","
				+ "\"primaryImageSmall\":\"https://images.metmuseum.org/CRDImages/gr/web-large/DVB14699_1_ff.jpg\","
				+ "\"additionalImages\":[\"https://images.metmuseum.org/CRDImages/gr/original/DVB14699_2_ff.jpg\"],"
				+ "\"constituents\":[{"
					+ "\"constituentID\":49271,"
					+ "\"role\":\"\","
					+ "\"name\":\"Attributed to the Black Fury Group\","
					+ "\"constituentULAN_URL\":\"http://vocab.getty.edu/page/ulan/500007172\","
					+ "\"constituentWikidata_URL\":\"https://www.wikidata.org/wiki/Q37633092\","
					+ "\"gender\":\"\""
					+ "}],"
				+ "\"department\":\"Greek and Roman Art\","
				+ "\"objectName\":\"Undetermined closed shape\","
				+ "\"title\":\"Terracotta fragment of a closed shape\","
				+ "\"culture\":\"Greek, South Italian, Apulian\","
				+ "\"period\":\"Classical\","
				+ "\"dynasty\":\"\","
				+ "\"reign\":\"\","
				+ "\"portfolio\":\"\","
				+ "\"artistRole\":\"\","
				+ "\"artistPrefix\":\"Attributed to the\","
				+ "\"artistDisplayName\":\"Black Fury Group\","
				+ "\"artistDisplayBio\":\"\","
				+ "\"artistSuffix\":\"? [DvB]\","
				+ "\"artistAlphaSort\":\"Black Fury Group\","
				+ "\"artistNationality\":\"\","
				+ "\"artistBeginDate\":\"\","
				+ "\"artistEndDate\":\"\","
				+ "\"artistGender\":\"\","
				+ "\"artistWikidata_URL\":\"https://www.wikidata.org/wiki/Q37633092\","
				+ "\"artistULAN_URL\":\"http://vocab.getty.edu/page/ulan/500007172\","
				+ "\"objectDate\":\"first quarter of the 4th century B.C.\","
				+ "\"objectBeginDate\":-530,"
				+ "\"objectEndDate\":-300,"
				+ "\"medium\":\"Terracotta\","
				+ "\"dimensions\":\"\","
				+ "\"measurements\":null,"
				+ "\"creditLine\":\"Gift of Dietrich von Bothmer, Distinguished Research Curator, Greek and Roman Art, 2011\","
				+ "\"geographyType\":\"\","
				+ "\"city\":\"\","
				+ "\"state\":\"\","
				+ "\"county\":\"\","
				+ "\"country\":\"\","
				+ "\"region\":\"\","
				+ "\"subregion\":\"\","
				+ "\"locale\":\"\","
				+ "\"locus\":\"\","
				+ "\"excavation\":\"\","
				+ "\"river\":\"\","
				+ "\"classification\":\"Vases\","
				+ "\"rightsAndReproduction\":\"\","
				+ "\"linkResource\":\"\","
				+ "\"metadataDate\":\"2020-11-14T04:40:04.457Z\","
				+ "\"repository\":\"Metropolitan Museum of Art, New York, NY\","
				+ "\"objectURL\":\"https://www.metmuseum.org/art/collection/search/768252\","
				+ "\"tags\":null,"
				+ "\"objectWikidata_URL\":\"\","
				+ "\"isTimelineWork\":false,"
				+ "\"GalleryNumber\":\"157\""
				+ "}";
		
		// WHEN
		Item item = metApiService.convertApiResponseToItem(jsonString);
		
		// THEN
		Assertions.assertThat(item).isNotNull();
		Assertions.assertThat(item.getObjectId()).isEqualTo(768252);
		Assertions.assertThat(item.getIsHighlight()).isFalse();
		Assertions.assertThat(item.getAccessionNumber()).isEqualTo("2011.604.12.3");
		Assertions.assertThat(item.getAccessionYear()).isEqualTo("2011");
		Assertions.assertThat(item.isPublicDomain()).isTrue();
		Assertions.assertThat(item.getPrimaryImage()).isEqualTo("https://images.metmuseum.org/CRDImages/gr/original/DVB14699_1_ff.jpg");
		Assertions.assertThat(item.getPrimaryImageSmall()).isEqualTo("https://images.metmuseum.org/CRDImages/gr/web-large/DVB14699_1_ff.jpg");
		Assertions.assertThat(item.getAdditionalImages()).hasSize(1);
		Assertions.assertThat(item.getAdditionalImages().get(0)).isEqualTo(("https://images.metmuseum.org/CRDImages/gr/original/DVB14699_2_ff.jpg"));
		Assertions.assertThat(item.getConstituents()).isNotEmpty();
		Assertions.assertThat(item.getDepartment()).isEqualTo("Greek and Roman Art");
		Assertions.assertThat(item.getObjectName()).isEqualTo("Undetermined closed shape");
		Assertions.assertThat(item.getTitle()).isEqualTo("Terracotta fragment of a closed shape");
		Assertions.assertThat(item.getCulture()).isEqualTo("Greek, South Italian, Apulian");
		Assertions.assertThat(item.getPeriod()).isEqualTo("Classical");
		Assertions.assertThat(item.getDynasty()).isEmpty();
		Assertions.assertThat(item.getReign()).isEmpty();
		Assertions.assertThat(item.getPortfolio()).isEmpty();
		Assertions.assertThat(item.getArtistRole()).isEmpty();
		Assertions.assertThat(item.getArtistPrefix()).isEqualTo("Attributed to the");
		Assertions.assertThat(item.getArtistDisplayName()).isEqualTo("Black Fury Group");
		Assertions.assertThat(item.getArtistDisplayBio()).isEmpty();
		Assertions.assertThat(item.getArtistSuffix()).isEqualTo("? [DvB]");                      
		Assertions.assertThat(item.getArtistAlphaSort()).isEqualTo("Black Fury Group");
		Assertions.assertThat(item.getArtistNationality()).isEmpty();
		Assertions.assertThat(item.getArtistBeginDate()).isEmpty();
		Assertions.assertThat(item.getArtistEndDate()).isEmpty();
		Assertions.assertThat(item.getArtistGender()).isEmpty();
		Assertions.assertThat(item.getArtistWikidata_URL()).isEqualTo("https://www.wikidata.org/wiki/Q37633092");
		Assertions.assertThat(item.getArtistULAN_URL()).isEqualTo("http://vocab.getty.edu/page/ulan/500007172");
		Assertions.assertThat(item.getObjectDate()).isEqualTo("first quarter of the 4th century B.C.");
		Assertions.assertThat(item.getObjectBeginDate()).isEqualTo(-530);
		Assertions.assertThat(item.getObjectEndDate()).isEqualTo(-300);
		Assertions.assertThat(item.getMedium()).isEqualTo("Terracotta");
		Assertions.assertThat(item.getDimensions()).isEmpty();
		Assertions.assertThat(item.getMeasurements()).isNull();
		Assertions.assertThat(item.getCreditLine()).isEqualTo("Gift of Dietrich von Bothmer, Distinguished Research Curator, Greek and Roman Art, 2011");
		Assertions.assertThat(item.getGeographyType()).isEmpty();
		Assertions.assertThat(item.getCity()).isEmpty();
		Assertions.assertThat(item.getState()).isEmpty();
		Assertions.assertThat(item.getCounty()).isEmpty();
		Assertions.assertThat(item.getCountry()).isEmpty();
		Assertions.assertThat(item.getRegion()).isEmpty();
		Assertions.assertThat(item.getSubregion()).isEmpty();
		Assertions.assertThat(item.getLocale()).isEmpty();
		Assertions.assertThat(item.getLocus()).isEmpty();
		Assertions.assertThat(item.getExcavation()).isEmpty();
		Assertions.assertThat(item.getRiver()).isEmpty();
		Assertions.assertThat(item.getClassification()).isEqualTo("Vases");
		Assertions.assertThat(item.getRightsAndReproduction()).isEmpty();
		Assertions.assertThat(item.getLinkResource()).isEmpty();
		Assertions.assertThat(item.getMetadataDate()).isEqualTo("2020-11-14T04:40:04.457Z");
		Assertions.assertThat(item.getRepository()).isEqualTo("Metropolitan Museum of Art, New York, NY");
		Assertions.assertThat(item.getObjectURL()).isEqualTo("https://www.metmuseum.org/art/collection/search/768252");
		Assertions.assertThat(item.getTags()).isNull();
		Assertions.assertThat(item.getObjectWikidata_URL()).isEmpty();
		Assertions.assertThat(item.getIsTimelineWork()).isFalse();
		Assertions.assertThat(item.getGalleryNumber()).isEqualTo("157");
	}
	
	@Test
	public void assertThatGetOldWorldObjectIdsIsPopulated() throws JsonProcessingException, IOException, InterruptedException {
		// WHEN
		ArrayList<Integer> objectIds = metApiService.getAncientOldWorldObjectIds();
		
		// THEN
		Assertions.assertThat(objectIds).hasSizeGreaterThan(0);
	}
	
	@Test
	public void assertThatGetObjectForDisplayReturnsAValidApiRequest() throws JsonProcessingException, IOException, InterruptedException {
		// WHEN
		String apiRequest = metApiService.getItemForDisplay();
		Integer itemNumber = Integer.parseInt(apiRequest.substring(64));
		
		// THEN
		Assertions.assertThat(apiRequest).contains("https://collectionapi.metmuseum.org/public/collection/v1/object/");
		Assertions.assertThat(itemNumber).isGreaterThan(0);
	}
}
