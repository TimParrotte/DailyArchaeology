package com.dailyarchaeology.museum_artifacts.domain;

import com.dailyarchaeology.museum_artifacts.service.HarvardApiService;
import com.dailyarchaeology.museum_artifacts.service.MetApiService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Random;

/**
 * MuseumItemFactory allows the project to select any Museum to display an object from. Available
 * Museums are contained in the Enum 'Museum'.
 */

@Component
public class MuseumItemFactory {

    public UniversalItemDto getMuseumItem() throws IOException, InterruptedException {
        final Museum museum = Museum.getRandomMuseum();

        switch(museum) {
            case METROPOLITAN_MUSEUM_OF_ART:
                return new MetApiService().getRandomItem();
    //        case HARVARD_ART_MUSEUM:
    //            return new HarvardApiService().getRandomItem();
            default:
                throw new RuntimeException("Museum is undefined.");
        }
    }

    protected enum Museum {
        METROPOLITAN_MUSEUM_OF_ART;
      //  HARVARD_ART_MUSEUM;

        private static Museum getRandomMuseum() {
            return Museum.values()[new Random().nextInt(Museum.values().length)];
        }
    }
}
