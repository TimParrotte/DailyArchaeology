package com.dailyarchaeology.museum_artifacts.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.stereotype.Service;

import com.dailyarchaeology.museum_artifacts.domain.HarvardItem;
import com.dailyarchaeology.museum_artifacts.domain.HarvardItem.HarvardImage;
import com.dailyarchaeology.museum_artifacts.domain.HarvardItem.SeeAlso;
import com.dailyarchaeology.museum_artifacts.domain.HarvardItem.WorkType;


@Service
public class HarvardApiService extends MuseumApiCommon {
	
	private final String harvardApiKey = "e8bc310d-3fb5-4cf9-8b9a-b458ce65140b";

	@Override
	public HarvardItem convertJsonToItem(String apiResponseJson) {
		HarvardItem item = new HarvardItem();
		JsonParser parser = JsonParserFactory.getJsonParser();
		Map<String, Object> apiResponseMap = parser.parseMap(apiResponseJson);
		item.setAccessionMethod((String) apiResponseMap.get("accessionmethod"));
		item.setAccessionYear((Integer) apiResponseMap.get("accessionyear"));
		item.setAccessLevel((Integer) apiResponseMap.get("accesslevel"));
		item.setCentury((String) apiResponseMap.get("century"));
		item.setClassification((String) apiResponseMap.get("classification"));
		item.setClassificationId((Integer) apiResponseMap.get("classificationid"));
		item.setColors((String) apiResponseMap.get("colors"));
		item.setColorCount((Integer) apiResponseMap.get("colorcount"));
		item.setCommentary((String) apiResponseMap.get("commentary"));
		item.setContact((String) apiResponseMap.get("contact"));
		item.setContextualTextCount((Integer) apiResponseMap.get("contextualtextcount"));
		item.setCopyright((String) apiResponseMap.get("copyright"));
		item.setCreditLine((String) apiResponseMap.get("creditline"));
		item.setCulture((String) apiResponseMap.get("culture"));
		item.setDated((String) apiResponseMap.get("dated"));
		item.setDateBegin((Integer) apiResponseMap.get("datebegin"));
		item.setDateEnd((Integer) apiResponseMap.get("dateend"));
		item.setDateOfFirstPageView((String) apiResponseMap.get("dateoffirstpageview"));
		item.setDateOfLastPageView((String) apiResponseMap.get("dateoflastpageview"));
		item.setDepartment((String) apiResponseMap.get("department"));
		item.setDescription((String) apiResponseMap.get("description"));
		item.setDimensions((String) apiResponseMap.get("dimensions"));
		item.setDivision((String) apiResponseMap.get("division"));
		item.setEdition((String) apiResponseMap.get("edition"));
		item.setExhibitionCount((Integer) apiResponseMap.get("exhibitioncount"));
		item.setGroupCount((Integer) apiResponseMap.get("groupcount"));
		item.setId((Integer) apiResponseMap.get("id"));
		item.setImageCount((Integer) apiResponseMap.get("imagecount"));
		item.setImagePermissionLevel((Integer) apiResponseMap.get("imagepermissionlevel"));
//		item.setImages((List<HarvardImage>) apiResponseMap.get("images"));
		item.setImages((ArrayList<String>) apiResponseMap.get("images"));
		item.setLabelText((String) apiResponseMap.get("labeltext"));
		item.setLastUpdate((String) apiResponseMap.get("lastupdate"));
		item.setLendingPermissionLevel((Integer) apiResponseMap.get("lendingpermissionlevel"));
		item.setMarksCount((Integer) apiResponseMap.get("markscount"));
		item.setMedium((String) apiResponseMap.get("medium"));
		item.setMediaCount((Integer) apiResponseMap.get("mediacount"));
		item.setObjectId((Integer) apiResponseMap.get("objectid"));
		item.setObjectNumber((String) apiResponseMap.get("objectnumber"));
		item.setPeriod((String) apiResponseMap.get("period"));
		item.setPeriodId((Integer) apiResponseMap.get("periodid"));
		item.setPeopleCount((Integer) apiResponseMap.get("peoplecount"));
		item.setPrimaryImageUrl((String) apiResponseMap.get("primaryimageurl"));
		item.setProvenance((String) apiResponseMap.get("provenance"));
		item.setPublicationCount((Integer) apiResponseMap.get("publicationcount"));
		item.setRank((Integer) apiResponseMap.get("rank"));
		item.setRelatedCount((Integer) apiResponseMap.get("relatedcount"));
//		item.setSeeAlso((List<SeeAlso>) apiResponseMap.get("seeAlso"));
  		item.setSeeAlso((ArrayList<String>) apiResponseMap.get("seeAlso"));
		item.setSigned((String) apiResponseMap.get("signed"));
		item.setStandardReferenceNumber((String) apiResponseMap.get("standardreferencenumber"));
		item.setState((String) apiResponseMap.get("state"));
		item.setStyle((String) apiResponseMap.get("style"));
		item.setTechnique((String) apiResponseMap.get("technique"));
		item.setTechniqueId((Integer) apiResponseMap.get("techniqueid"));
		item.setTitle((String) apiResponseMap.get("title"));
		item.setTitlesCount((Integer) apiResponseMap.get("titlescount"));
		item.setTotalPageViews((Integer) apiResponseMap.get("totalpageviews"));
		item.setTotalUniquePageViews((Integer) apiResponseMap.get("totaluniquepageviews"));
		item.setUrl((String) apiResponseMap.get("url"));
		item.setVerificationLevel((Integer) apiResponseMap.get("verificationlevel"));
		item.setVerificationLevelDescription((String) apiResponseMap.get("verificationleveldescription"));
//		item.setWorkTypes((List<WorkType>) apiResponseMap.get("worktypes"));
		item.setWorkTypes((ArrayList<String>) apiResponseMap.get("worktypes"));
		return item;
	}

}
