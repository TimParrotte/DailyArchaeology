package com.dailyarchaeology.museum_artifacts.domain;

public class MetMeasurements {
	
	private String elementName;
	private String elementDescription;
	private MetElementMeasurements elementMeasurements;

	public String getElementName() {
		return elementName;
	}
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}
	public String getElementDescription() {
		return elementDescription;
	}
	public void setElementDescription(String elementDescription) {
		this.elementDescription = elementDescription;
	}
	public MetElementMeasurements getElementMeasurements() {
		return elementMeasurements;
	}
	public void setElementMeasurements(MetElementMeasurements elementMeasurements) {
		this.elementMeasurements = elementMeasurements;
	}
}
