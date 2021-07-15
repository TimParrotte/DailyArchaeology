package com.dailyarchaeology.museum_artifacts.domain;

public class UniversalItemDto {

    private String title;
    private String imageUrl;
    private String description;
    private String culture;
    private String era;
    private String medium;
    private Object fullData;

    public UniversalItemDto(String title, String imageUrl, String description, String culture,
                            String era, String medium) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.culture = culture;
        this.era = era;
        this.medium = medium;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Object getFullData() {
        return fullData;
    }

    public void setFullData(Object fullData) {
        this.fullData = fullData;
    }

    @Override
    public String toString() {
        return "UniversalItemDto{" +
                "title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", culture='" + culture + '\'' +
                ", era='" + era + '\'' +
                ", medium='" + medium + '\'' +
                ", fullData=" + fullData +
                '}';
    }
}
