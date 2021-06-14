package com.dailyarchaeology.museum_artifacts.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetConstituents {
	
	private Integer constituentId;

	private String role;

	private String name;

	@JsonProperty("constituentULAN_URL")
	private String constituentUlanUrl;

	@JsonProperty("constituentWikidata_URL")
	private String constituentWikidataUrl;

	private String gender;

	public Integer getConstituentId() {
		return constituentId;
	}

	public void setConstituentId(Integer constituentId) {
		this.constituentId = constituentId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConstituentUlanUrl() {
		return constituentUlanUrl;
	}

	public void setConstituentUlanUrl(String constituentUlanUrl) {
		this.constituentUlanUrl = constituentUlanUrl;
	}

	public String getConstituentWikidataUrl() {
		return constituentWikidataUrl;
	}

	public void setConstituentWikidataUrl(String constituentWikidataUrl) {
		this.constituentWikidataUrl = constituentWikidataUrl;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
