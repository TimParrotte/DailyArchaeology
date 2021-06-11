package com.dailyarchaeology.museum_artifacts.domain;

import java.util.ArrayList;
import java.util.Objects;

public class MetItem {
    private Integer objectId;
    private Boolean isHighlight;
    private String accessionNumber;
    private String accessionYear;
    private Boolean isPublicDomain;
    private String primaryImage;
    private String primaryImageSmall;
    private ArrayList<String> additionalImages;
    private ArrayList<String> constituents;
    private String department;
    private String objectName;
    private String title;
    private String culture;
    private String period;
    private String dynasty;
    private String reign;
    private String portfolio;
    private String artistRole;
    private String artistPrefix;
    private String artistDisplayName;
    private String artistDisplayBio;
    private String artistSuffix;
    private String artistAlphaSort;
    private String artistNationality;
    private String artistBeginDate;
    private String artistEndDate;
    private String artistGender;
    private String artistWikidata_URL;
    private String artistULAN_URL;
    private String objectDate;
    private Integer objectBeginDate;
    private Integer objectEndDate;
    private String medium;
    private String dimensions;
    private Float dimensionsParsed;
    private ArrayList<String> measurements;
    private String creditLine;
    private String geographyType;
    private String city;
    private String state;
    private String county;
    private String country;
    private String region;
    private String subregion;
    private String locale;
    private String locus;
    private String excavation;
    private String river;
    private String classification;
    private String rightsAndReproduction;
    private String linkResource;
    private String metadataDate;
    private String repository;
    private String objectURL;
    private ArrayList<String> tags;
    private String objectWikidata_URL;
    private Boolean isTimelineWork;
    private String galleryNumber;
    
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Boolean getIsHighlight() {
        return isHighlight;
    }

    public void setIsHighlight(Boolean isHighlight) {
        this.isHighlight = isHighlight;
    }

    public String getAccessionNumber() {
        return accessionNumber;
    }

    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public String getAccessionYear() {
        return accessionYear;
    }

    public void setAccessionYear(String accessionYear) {
        this.accessionYear = accessionYear;
    }

    public Boolean isPublicDomain() {
        return isPublicDomain;
    }

    public void setIsPublicDomain(Boolean isPublicDomain) {
        this.isPublicDomain = isPublicDomain;
    }

    public String getPrimaryImage() {
        return primaryImage;
    }

    public void setPrimaryImage(String primaryImage) {
        this.primaryImage = primaryImage;
    }

    public String getPrimaryImageSmall() {
        return primaryImageSmall;
    }

    public void setPrimaryImageSmall(String primaryImageSmall) {
        this.primaryImageSmall = primaryImageSmall;
    }

    public ArrayList<String> getAdditionalImages() {
        return additionalImages;
    }

    public void setAdditionalImages(ArrayList<String> additionalImages) {
        this.additionalImages = additionalImages;
    }

    public ArrayList<String> getConstituents() {
        return constituents;
    }

    public void setConstituents(ArrayList<String> constituents) {
        this.constituents = constituents;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDynasty() {
        return dynasty;
    }

    public void setDynasty(String dynasty) {
        this.dynasty = dynasty;
    }

    public String getReign() {
        return reign;
    }

    public void setReign(String reign) {
        this.reign = reign;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getArtistRole() {
        return artistRole;
    }

    public void setArtistRole(String artistRole) {
        this.artistRole = artistRole;
    }

    public String getArtistPrefix() {
        return artistPrefix;
    }

    public void setArtistPrefix(String artistPrefix) {
        this.artistPrefix = artistPrefix;
    }

    public String getArtistDisplayName() {
        return artistDisplayName;
    }

    public void setArtistDisplayName(String artistDisplayName) {
        this.artistDisplayName = artistDisplayName;
    }

    public String getArtistDisplayBio() {
        return artistDisplayBio;
    }

    public void setArtistDisplayBio(String artistDisplayBio) {
        this.artistDisplayBio = artistDisplayBio;
    }

    public String getArtistSuffix() {
        return artistSuffix;
    }

    public void setArtistSuffix(String artistSuffix) {
        this.artistSuffix = artistSuffix;
    }

    public String getArtistAlphaSort() {
        return artistAlphaSort;
    }

    public void setArtistAlphaSort(String artistAlphaSort) {
        this.artistAlphaSort = artistAlphaSort;
    }

    public String getArtistNationality() {
        return artistNationality;
    }

    public void setArtistNationality(String artistNationality) {
        this.artistNationality = artistNationality;
    }

    public String getArtistBeginDate() {
        return artistBeginDate;
    }

    public void setArtistBeginDate(String artistBeginDate) {
        this.artistBeginDate = artistBeginDate;
    }

    public String getArtistEndDate() {
        return artistEndDate;
    }

    public void setArtistEndDate(String artistEndDate) {
        this.artistEndDate = artistEndDate;
    }

    public String getArtistGender() {
        return artistGender;
    }

    public void setArtistGender(String artistGender) {
        this.artistGender = artistGender;
    }

    public String getArtistWikidata_URL() {
        return artistWikidata_URL;
    }

    public void setArtistWikidata_URL(String artistWikidata_URL) {
        this.artistWikidata_URL = artistWikidata_URL;
    }

    public String getArtistULAN_URL() {
        return artistULAN_URL;
    }

    public void setArtistULAN_URL(String artistULAN_URL) {
        this.artistULAN_URL = artistULAN_URL;
    }

    public String getObjectDate() {
        return objectDate;
    }

    public void setObjectDate(String objectDate) {
        this.objectDate = objectDate;
    }

    public Integer getObjectBeginDate() {
        return objectBeginDate;
    }

    public void setObjectBeginDate(Integer objectBeginDate) {
        this.objectBeginDate = objectBeginDate;
    }

    public Integer getObjectEndDate() {
        return objectEndDate;
    }

    public void setObjectEndDate(Integer objectEndDate) {
        this.objectEndDate = objectEndDate;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public float getDimensionsParsed() {
        return dimensionsParsed;
    }

    public void setDimensionsParsed(float dimensionsParsed) {
        this.dimensionsParsed = dimensionsParsed;
    }

    public ArrayList<String> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(ArrayList<String> measurements) {
        this.measurements = measurements;
    }

    public String getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(String creditLine) {
        this.creditLine = creditLine;
    }

    public String getGeographyType() {
        return geographyType;
    }

    public void setGeographyType(String geographyType) {
        this.geographyType = geographyType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }
    
    public String getLocale() {
    	return locale;
    }
    
    public void setLocale(String locale) {
    	this.locale = locale;
    }

    public String getLocus() {
        return locus;
    }

    public void setLocus(String locus) {
        this.locus = locus;
    }

    public String getExcavation() {
        return excavation;
    }

    public void setExcavation(String excavation) {
        this.excavation = excavation;
    }

    public String getRiver() {
        return river;
    }

    public void setRiver(String river) {
        this.river = river;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getRightsAndReproduction() {
        return rightsAndReproduction;
    }

    public void setRightsAndReproduction(String rightsAndReproduction) {
        this.rightsAndReproduction = rightsAndReproduction;
    }

    public String getLinkResource() {
        return linkResource;
    }

    public void setLinkResource(String linkResource) {
        this.linkResource = linkResource;
    }

    public String getMetadataDate() {
        return metadataDate;
    }

    public void setMetadataDate(String metadataDate) {
        this.metadataDate = metadataDate;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getObjectURL() {
        return objectURL;
    }

    public void setObjectURL(String objectURL) {
        this.objectURL = objectURL;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getObjectWikidata_URL() {
        return objectWikidata_URL;
    }

    public void setObjectWikidata_URL(String objectWikidata_URL) {
        this.objectWikidata_URL = objectWikidata_URL;
    }

    public Boolean getIsTimelineWork() {
        return isTimelineWork;
    }

    public void setIsTimelineWork(Boolean isTimelineWork) {
        this.isTimelineWork = isTimelineWork;
    }

    public String getGalleryNumber() {
        return galleryNumber;
    }

    public void setGalleryNumber(String galleryNumber) {
        this.galleryNumber = galleryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetItem item = (MetItem) o;
        return getObjectId() == item.getObjectId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getObjectId());
    }

    @Override
	public String toString() {
		return "Item [objectId=" + objectId + ", isHighlight=" + isHighlight + ", accessionNumber=" + accessionNumber
				+ ", accessionYear=" + accessionYear + ", isPublicDomain=" + isPublicDomain + ", primaryImage="
				+ primaryImage + ", primaryImageSmall=" + primaryImageSmall + ", additionalImages=" + additionalImages
				+ ", constituents=" + constituents + ", department=" + department + ", objectName=" + objectName
				+ ", title=" + title + ", culture=" + culture + ", period=" + period + ", dynasty=" + dynasty
				+ ", reign=" + reign + ", portfolio=" + portfolio + ", artistRole=" + artistRole + ", artistPrefix="
				+ artistPrefix + ", artistDisplayName=" + artistDisplayName + ", artistDisplayBio=" + artistDisplayBio
				+ ", artistSuffix=" + artistSuffix + ", artistAlphaSort=" + artistAlphaSort + ", artistNationality="
				+ artistNationality + ", artistBeginDate=" + artistBeginDate + ", artistEndDate=" + artistEndDate
				+ ", artistGender=" + artistGender + ", artistWikidata_URL=" + artistWikidata_URL + ", artistULAN_URL="
				+ artistULAN_URL + ", objectDate=" + objectDate + ", objectBeginDate=" + objectBeginDate
				+ ", objectEndDate=" + objectEndDate + ", medium=" + medium + ", dimensions=" + dimensions
				+ ", dimensionsParsed=" + dimensionsParsed + ", measurements=" + measurements + ", creditLine="
				+ creditLine + ", geographyType=" + geographyType + ", city=" + city + ", state=" + state + ", county="
				+ county + ", country=" + country + ", region=" + region + ", subregion=" + subregion + ", locale="
				+ locale + ", locus=" + locus + ", excavation=" + excavation + ", river=" + river + ", classification="
				+ classification + ", rightsAndReproduction=" + rightsAndReproduction + ", linkResource=" + linkResource
				+ ", metadataDate=" + metadataDate + ", repository=" + repository + ", objectURL=" + objectURL
				+ ", tags=" + tags + ", objectWikidata_URL=" + objectWikidata_URL + ", isTimelineWork=" + isTimelineWork
				+ ", galleryNumber=" + galleryNumber + "]";
	}
}
