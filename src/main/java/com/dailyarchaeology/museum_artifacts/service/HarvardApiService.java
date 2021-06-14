package com.dailyarchaeology.museum_artifacts.service;

import java.io.IOException;
import org.springframework.stereotype.Service;
import com.dailyarchaeology.museum_artifacts.domain.HarvardItem;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class HarvardApiService extends MuseumApiCommon {
	
	private final String harvardApiKey = "e8bc310d-3fb5-4cf9-8b9a-b458ce65140b";

}
