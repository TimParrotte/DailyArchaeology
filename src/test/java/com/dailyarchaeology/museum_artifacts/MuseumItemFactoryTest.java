package com.dailyarchaeology.museum_artifacts;

import com.dailyarchaeology.museum_artifacts.domain.MuseumItemFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
public class MuseumItemFactoryTest {

    @Autowired
    MuseumItemFactory museumItemFactory;

    @Test
    public void assertThatGetMuseumItemWorks() throws IOException, InterruptedException {

        Assertions.assertThat(museumItemFactory.getMuseumItem().getImageUrl()).isNotEmpty();
    }

}
