package com.dailyarchaeology.museum_artifacts.service;

import com.dailyarchaeology.museum_artifacts.domain.UniversalItemDto;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HarvardApiService extends MuseumApiService {

    private final String harvardApiKey = "e8bc310d-3fb5-4cf9-8b9a-b458ce65140b";

    @Override
    public UniversalItemDto getRandomItem() throws IOException, InterruptedException {
        return null;
    }
}
