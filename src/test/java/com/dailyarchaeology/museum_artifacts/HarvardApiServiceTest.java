package com.dailyarchaeology.museum_artifacts;

import java.io.IOException;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.dailyarchaeology.museum_artifacts.domain.HarvardItem;
import com.dailyarchaeology.museum_artifacts.service.HarvardApiService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class HarvardApiServiceTest {
	
	@Autowired
	HarvardApiService harvardApiService;

	
	@Test
	public void assertHarvardItemObjectSuccessFullyCreatedFromJson() throws JsonParseException, JsonMappingException, IOException {
		// GIVEN
		
		String jsonString ="{"
				+ "\"copyright\":null,"
				+ "\"contextualtextcount\":0,"
				+ "\"creditline\":\"Harvard Art Museums/Arthur M. Sackler Museum, Gift of Carol Hebb and Alan Feldbaum\","
				+ "\"accesslevel\":1,"
				+ "\"dateoflastpageview\":\"2021-06-02\","
				+ "\"classificationid\":180,"
				+ "\"division\":\"Asian and Mediterranean Art\","
				+ "\"markscount\":0,"
				+ "\"publicationcount\":0,"
				+ "\"totaluniquepageviews\":63,"
				+ "\"contact\":\"am_asianmediterranean@harvard.edu\","
				+ "\"colorcount\":0,"
				+ "\"rank\":124586,"
				+ "\"state\":null,"
				+ "\"id\":72476,"
				+ "\"verificationleveldescription\":\"Unchecked. Object information has not been verified for completeness and has not been vetted\","
				+ "\"period\":\"Chalcolithic period\","
				+ "\"images\":[{"
					+ "\"date\":\"2006-09-07\","
					+ "\"copyright\":\"President and Fellows of Harvard College\","
					+ "\"imageid\":195840,"
					+ "\"idsid\":20231341,"
					+ "\"format\":\"image/jpeg\","
					+ "\"description\":null,"
					+ "\"technique\":null,"
					+ "\"renditionnumber\":\"INV108178\","
					+ "\"displayorder\":1,"
					+ "\"baseimageurl\":\"https://nrs.harvard.edu/urn-3:HUAM:INV108178_dynmc\","
					+ "\"alttext\":null,\"width\":1024,"
					+ "\"publiccaption\":null,"
					+ "\"iiifbaseuri\":\"https://ids.lib.harvard.edu/ids/iiif/20231341\","
					+ "\"height\":762"
					+ "}],"
				+ "\"worktypes\":[{"
					+ "\"worktypeid\":\"13\","
					+ "\"worktype\":\"amulet\""
					+ "}],"
				+ "\"imagecount\":1,"
				+ "\"totalpageviews\":71,"
				+ "\"accessionyear\":2003,"
				+ "\"standardreferencenumber\":null,"
				+ "\"signed\":null,"
				+ "\"classification\":\"Amulets\","
				+ "\"relatedcount\":0,"
				+ "\"verificationlevel\":0,"
				+ "\"primaryimageurl\":\"https://nrs.harvard.edu/urn-3:HUAM:INV108178_dynmc\","
				+ "\"titlescount\":1,"
				+ "\"peoplecount\":0,"
				+ "\"style\":null,"
				+ "\"lastupdate\":\"2021-06-11T05:06:18-0400\","
				+ "\"commentary\":null,"
				+ "\"periodid\":4469,"
				+ "\"technique\":null,"
				+ "\"edition\":null,"
				+ "\"description\":\"Red stone amulet in the shape of a duck or similar bird-like figure. "
								+ "The amulet is marked just with an incised contour differentiating the body and the tail depressions on either side of the head for the eyes. "
								+ "The surface of the stone is smooth. Circular hole pierced through breast probably so that the amulet might be worn as a pendant. "
								+ "Amulet has been broken at the neck and repaired.\","
				+ "\"medium\":\"Stone\","
				+ "\"lendingpermissionlevel\":0,"
				+ "\"title\":\"Red Stone Sumerian Amulet Duck\","
				+ "\"accessionmethod\":\"Gift\","
				+ "\"provenance\":null,"
				+ "\"groupcount\":0,"
				+ "\"dated\":\"c. 3500 BCE- c. 3000 BCE\","
				+ "\"department\":\"Department of Ancient and Byzantine Art & Numismatics\","
				+ "\"dateend\":-3000,"
				+ "\"url\":\"https://www.harvardartmuseums.org/collections/object/72476\","
				+ "\"dateoffirstpageview\":\"2009-05-30\","
				+ "\"century\":\"4th millennium BCE\","
				+ "\"objectnumber\":\"2003.252\","
				+ "\"labeltext\":null,"
				+ "\"datebegin\":-3500,"
				+ "\"culture\":\"Sumerian\","
				+ "\"exhibitioncount\":0,"
				+ "\"imagepermissionlevel\":0,"
				+ "\"mediacount\":0,"
				+ "\"objectid\":72476,"
				+ "\"techniqueid\":null,"
				+ "\"dimensions\":\"4.8 x 5.4 x 0.7 cm (1 7/8 x 2 1/8 x 1/4 in.)\","
				+ "\"seeAlso\":[{"
					+ "\"id\":\"https://iiif.harvardartmuseums.org/manifests/object/72476\","
					+ "\"type\":\"IIIF Manifest\","
					+ "\"format\":\"application/json\","
					+ "\"profile\":\"http://iiif.io/api/presentation/2/context.json\"}]"
				+ "}";
		
		// WHEN
		
		HarvardItem item = harvardApiService.convertJsonToItem(jsonString);
		
		// THEN
		
		Assertions.assertThat(item.getCopyright()).isNull();
		Assertions.assertThat(item.getContextualTextCount()).isEqualTo(0);
		Assertions.assertThat(item.getCreditLine()).isEqualTo("Harvard Art Museums/Arthur M. Sackler Museum, Gift of Carol Hebb and Alan Feldbaum");
		Assertions.assertThat(item.getAccessLevel()).isEqualTo(1);
		Assertions.assertThat(item.getDateOfLastPageView()).isEqualTo("2021-06-02");
		Assertions.assertThat(item.getClassificationId()).isEqualTo(180);
		Assertions.assertThat(item.getDivision()).isEqualTo("Asian and Mediterranean Art");
		Assertions.assertThat(item.getMarksCount()).isEqualTo(0);
		Assertions.assertThat(item.getPublicationCount()).isEqualTo(0);
		Assertions.assertThat(item.getTotalUniquePageViews()).isEqualTo(63);
		Assertions.assertThat(item.getContact()).isEqualTo("am_asianmediterranean@harvard.edu");
		Assertions.assertThat(item.getColorCount()).isEqualTo(0);
		Assertions.assertThat(item.getRank()).isEqualTo(124586);
		Assertions.assertThat(item.getState()).isNull();
		Assertions.assertThat(item.getId()).isEqualTo(72476);
		Assertions.assertThat(item.getVerificationLevelDescription()).isEqualTo("Unchecked. Object information has not been verified for completeness and has not been vetted");
		Assertions.assertThat(item.getPeriod()).isEqualTo("Chalcolithic period");
		Assertions.assertThat(item.getImages()).isNotNull();
		Assertions.assertThat(item.getImages().get(0).getDate()).isEqualTo("2006-09-07");
		Assertions.assertThat(item.getImages().get(0).getCopyright()).isEqualTo("President and Fellows of Harvard College");
		Assertions.assertThat(item.getImages().get(0).getImageId()).isEqualTo(195840);
		Assertions.assertThat(item.getImages().get(0).getIdsId()).isEqualTo(20231341);
		Assertions.assertThat(item.getImages().get(0).getFormat()).isEqualTo("image/jpeg");
		Assertions.assertThat(item.getImages().get(0).getDescription()).isNull();
		Assertions.assertThat(item.getImages().get(0).getTechnique()).isNull();
		Assertions.assertThat(item.getImages().get(0).getRenditionNumber()).isEqualTo("INV108178");
		Assertions.assertThat(item.getImages().get(0).getDisplayOrder()).isEqualTo(1);
		Assertions.assertThat(item.getImages().get(0).getBaseImageUrl()).isEqualTo("https://nrs.harvard.edu/urn-3:HUAM:INV108178_dynmc");
		Assertions.assertThat(item.getImages().get(0).getAltText()).isNull();
		Assertions.assertThat(item.getImages().get(0).getPublicCaption()).isNull();
		Assertions.assertThat(item.getImages().get(0).getIiifBaseUri()).isEqualTo("https://ids.lib.harvard.edu/ids/iiif/20231341");
		Assertions.assertThat(item.getImages().get(0).getHeight()).isEqualTo(762);
		Assertions.assertThat(item.getWorkTypes()).isNotNull();
		Assertions.assertThat(item.getWorkTypes().get(0).getWorkTypeId()).isEqualTo("13");
		Assertions.assertThat(item.getWorkTypes().get(0).getWorkType()).isEqualTo("amulet");
		Assertions.assertThat(item.getImageCount()).isEqualTo(1);
		Assertions.assertThat(item.getTotalPageViews()).isEqualTo(71);
		Assertions.assertThat(item.getAccessionYear()).isEqualTo(2003);
		Assertions.assertThat(item.getStandardReferenceNumber()).isNull();
		Assertions.assertThat(item.getSigned()).isNull();
		Assertions.assertThat(item.getClassification()).isEqualTo("Amulets");
		Assertions.assertThat(item.getRelatedCount()).isEqualTo(0);
		Assertions.assertThat(item.getVerificationLevel()).isEqualTo(0);
		Assertions.assertThat(item.getPrimaryImageUrl()).isEqualTo("https://nrs.harvard.edu/urn-3:HUAM:INV108178_dynmc");
		Assertions.assertThat(item.getTitlesCount()).isEqualTo(1);
		Assertions.assertThat(item.getPeopleCount()).isEqualTo(0);
		Assertions.assertThat(item.getStyle()).isNull();
		Assertions.assertThat(item.getLastUpdate()).isEqualTo("2021-06-11T05:06:18-0400");
		Assertions.assertThat(item.getCommentary()).isNull();
		Assertions.assertThat(item.getPeriodId()).isEqualTo(4469);
		Assertions.assertThat(item.getTechnique()).isNull();
		Assertions.assertThat(item.getEdition()).isNull();
		Assertions.assertThat(item.getDescription()).contains("Red stone amulet");
		Assertions.assertThat(item.getMedium()).isEqualTo("Stone");
		Assertions.assertThat(item.getLendingPermissionLevel()).isEqualTo(0);
		Assertions.assertThat(item.getTitle()).isEqualTo("Red Stone Sumerian Amulet Duck");
		Assertions.assertThat(item.getAccessionMethod()).isEqualTo("Gift");
		Assertions.assertThat(item.getProvenance()).isNull();
		Assertions.assertThat(item.getGroupCount()).isEqualTo(0);
		Assertions.assertThat(item.getDated()).isEqualTo("c. 3500 BCE- c. 3000 BCE");
		Assertions.assertThat(item.getDepartment()).isEqualTo("Department of Ancient and Byzantine Art & Numismatics");
		Assertions.assertThat(item.getDateEnd()).isEqualTo(-3000);
		Assertions.assertThat(item.getUrl()).isEqualTo("https://www.harvardartmuseums.org/collections/object/72476");
		Assertions.assertThat(item.getDateOfFirstPageView()).isEqualTo("2009-05-30");
		Assertions.assertThat(item.getCentury()).isEqualTo("4th millennium BCE");
		Assertions.assertThat(item.getCulture()).isEqualTo("Sumerian");
		Assertions.assertThat(item.getExhibitionCount()).isEqualTo(0);
		Assertions.assertThat(item.getImagePermissionLevel()).isEqualTo(0);
		Assertions.assertThat(item.getMediaCount()).isEqualTo(0);
		Assertions.assertThat(item.getObjectId()).isEqualTo(72476);
		Assertions.assertThat(item.getTechniqueId()).isNull();
		Assertions.assertThat(item.getDimensions()).isEqualTo("4.8 x 5.4 x 0.7 cm (1 7/8 x 2 1/8 x 1/4 in.)");
		Assertions.assertThat(item.getSeeAlso()).isNotNull();
		Assertions.assertThat(item.getSeeAlso().get(0).getId()).isEqualTo("https://iiif.harvardartmuseums.org/manifests/object/72476");
		Assertions.assertThat(item.getSeeAlso().get(0).getType()).isEqualTo("IIIF Manifest");
		Assertions.assertThat(item.getSeeAlso().get(0).getFormat()).isEqualTo("application/json");
		Assertions.assertThat(item.getSeeAlso().get(0).getProfile()).isEqualTo("http://iiif.io/api/presentation/2/context.json");
	}
}
