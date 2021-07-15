package com.dailyarchaeology.museum_artifacts.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetTags {

	private String term;
	
	@JsonProperty("AAT_URL")
	private String aatUrl;
	
	@JsonProperty("Wikidata_URL")
	private String wikidataUrl;

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getAatUrl() {
		return aatUrl;
	}

	public void setAatUrl(String aatUrl) {
		this.aatUrl = aatUrl;
	}

	public String getWikidataUrl() {
		return wikidataUrl;
	}

	public void setWikidataUrl(String wikidataUrl) {
		this.wikidataUrl = wikidataUrl;
	}
}
