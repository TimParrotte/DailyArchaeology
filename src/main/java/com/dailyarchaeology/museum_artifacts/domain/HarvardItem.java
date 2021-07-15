package com.dailyarchaeology.museum_artifacts.domain;

import java.util.List;

public class HarvardItem implements MuseumItem{
	
	private String accessionMethod;
	private Integer accessionYear;
	private Integer accessLevel; // Maybe an ENUM of (0,1).
	private String century;
	private String classification;
	private Integer classificationId;
	private String colors; 
	private Integer colorCount;
	private String commentary;
	private String contact;
	private Integer contextualtextcount;
	private String copyright;
	private String creditLine;
	private String culture;
	private String dated;
	private Integer dateBegin;
	private Integer dateEnd;
	private String dateOfFirstPageView;
	private String dateOfLastPageView;
	private String department;
	private String description;
	private String dimensions;
	private String division;
	private String edition;
	private Integer exhibitionCount;
	private Integer groupCount;
	private Integer id;
	private Integer imageCount;
	private Integer imagePermissionLevel; // ENUM (0, 1, 2)
	private List<HarvardImage> images;
	private String labelText;
	private String lastUpdate;
	private Integer lendingPermissionLevel; // ENUM (0, 1, 2)
	private Integer marksCount;
	private String medium;
	private Integer mediaCount;
	private Integer objectId;
	private String objectNumber;
	private String period;
	private Integer periodId;
	private Integer peopleCount;
	private String primaryImageUrl;
	private String provenance;
	private Integer publicationCount;
	private Integer rank; 
	private Integer relatedCount;
	private List<HarvardSeeAlso> seeAlso;
	private String signed;
	private String standardReferenceNumber;
	private String state;
	private String style;
	private String technique;
	private Integer techniqueId;
	private String title;
	private Integer titlesCount;
	private Integer totalPageViews;
	private Integer totalUniquePageViews;
	private String url;
	private Integer verificationLevel; // ENUM 0-4
	private String verificationLevelDescription;
	private List<HarvardWorkType> workTypes;
	
	public HarvardItem() {};
	
	public String getAccessionMethod() {
		return accessionMethod;
	}

	public void setAccessionMethod(String accessionMethod) {
		this.accessionMethod = accessionMethod;
	}

	public Integer getAccessionYear() {
		return accessionYear;
	}

	public void setAccessionYear(Integer accessionYear) {
		this.accessionYear = accessionYear;
	}

	public Integer getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(Integer accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getCentury() {
		return century;
	}

	public void setCentury(String century) {
		this.century = century;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public Integer getClassificationId() {
		return classificationId;
	}

	public void setClassificationId(Integer classificationId) {
		this.classificationId = classificationId;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public Integer getColorCount() {
		return colorCount;
	}

	public void setColorCount(Integer colorCount) {
		this.colorCount = colorCount;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getContextualTextCount() {
		return contextualtextcount;
	}

	public void setContextualTextCount(Integer contextualtextcount) {
		this.contextualtextcount = contextualtextcount;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(String creditLine) {
		this.creditLine = creditLine;
	}

	public String getCulture() {
		return culture;
	}

	public void setCulture(String culture) {
		this.culture = culture;
	}

	public String getDated() {
		return dated;
	}

	public void setDated(String dated) {
		this.dated = dated;
	}

	public Integer getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(Integer dateBegin) {
		this.dateBegin = dateBegin;
	}

	public Integer getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Integer dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getDateOfFirstPageView() {
		return dateOfFirstPageView;
	}

	public void setDateOfFirstPageView(String dateOfFirstPageView) {
		this.dateOfFirstPageView = dateOfFirstPageView;
	}

	public String getDateOfLastPageView() {
		return dateOfLastPageView;
	}

	public void setDateOfLastPageView(String dateOfLastPageView) {
		this.dateOfLastPageView = dateOfLastPageView;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Integer getExhibitionCount() {
		return exhibitionCount;
	}

	public void setExhibitionCount(Integer exhibitionCount) {
		this.exhibitionCount = exhibitionCount;
	}

	public Integer getGroupCount() {
		return groupCount;
	}

	public void setGroupCount(Integer groupCount) {
		this.groupCount = groupCount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getImageCount() {
		return imageCount;
	}

	public void setImageCount(Integer imageCount) {
		this.imageCount = imageCount;
	}

	public Integer getImagePermissionLevel() {
		return imagePermissionLevel;
	}

	public void setImagePermissionLevel(Integer imagePermissionLevel) {
		this.imagePermissionLevel = imagePermissionLevel;
	}

	public List<HarvardImage> getImages() {
		return images;
	}

	public void setImages(List<HarvardImage> images) {
		this.images = images;
	}

	public String getLabelText() {
		return labelText;
	}

	public void setLabelText(String labelText) {
		this.labelText = labelText;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Integer getLendingPermissionLevel() {
		return lendingPermissionLevel;
	}

	public void setLendingPermissionLevel(Integer lendingPermissionLevel) {
		this.lendingPermissionLevel = lendingPermissionLevel;
	}

	public Integer getMarksCount() {
		return marksCount;
	}

	public void setMarksCount(Integer marksCount) {
		this.marksCount = marksCount;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public Integer getMediaCount() {
		return mediaCount;
	}

	public void setMediaCount(Integer mediaCount) {
		this.mediaCount = mediaCount;
	}

	public Integer getObjectId() {
		return objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public String getObjectNumber() {
		return objectNumber;
	}

	public void setObjectNumber(String objectNumber) {
		this.objectNumber = objectNumber;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public Integer getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

	public Integer getPeopleCount() {
		return peopleCount;
	}

	public void setPeopleCount(Integer peopleCount) {
		this.peopleCount = peopleCount;
	}

	public String getPrimaryImageUrl() {
		return primaryImageUrl;
	}

	public void setPrimaryImageUrl(String primaryImageUrl) {
		this.primaryImageUrl = primaryImageUrl;
	}

	public String getProvenance() {
		return provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public Integer getPublicationCount() {
		return publicationCount;
	}

	public void setPublicationCount(Integer publicationCount) {
		this.publicationCount = publicationCount;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getRelatedCount() {
		return relatedCount;
	}

	public void setRelatedCount(Integer relatedCount) {
		this.relatedCount = relatedCount;
	}

	public List<HarvardSeeAlso> getSeeAlso() {
		return seeAlso;
	} 

	public void setSeeAlso(List<HarvardSeeAlso> seeAlso) {
		this.seeAlso = seeAlso;
	}
	
	public String getSigned() {
		return signed;
	}

	public void setSigned(String signed) {
		this.signed = signed;
	}

	public String getStandardReferenceNumber() {
		return standardReferenceNumber;
	}

	public void setStandardReferenceNumber(String standardReferenceNumber) {
		this.standardReferenceNumber = standardReferenceNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTechnique() {
		return technique;
	}

	public void setTechnique(String technique) {
		this.technique = technique;
	}

	public Integer getTechniqueId() {
		return techniqueId;
	}

	public void setTechniqueId(Integer techniqueId) {
		this.techniqueId = techniqueId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTitlesCount() {
		return titlesCount;
	}

	public void setTitlesCount(Integer titlesCount) {
		this.titlesCount = titlesCount;
	}

	public Integer getTotalPageViews() {
		return totalPageViews;
	}

	public void setTotalPageViews(Integer totalPageViews) {
		this.totalPageViews = totalPageViews;
	}

	public Integer getTotalUniquePageViews() {
		return totalUniquePageViews;
	}

	public void setTotalUniquePageViews(Integer totalUniquePageViews) {
		this.totalUniquePageViews = totalUniquePageViews;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getVerificationLevel() {
		return verificationLevel;
	}

	public void setVerificationLevel(Integer verificationLevel) {
		this.verificationLevel = verificationLevel;
	}
	
	public String getVerificationLevelDescription() {
		return verificationLevelDescription;
	}
	
	public void setVerificationLevelDescription(String verificationLevelDescription) {
		this.verificationLevelDescription = verificationLevelDescription;
	}

	public List<HarvardWorkType> getWorkTypes() {
		return workTypes;
	}

	public void setWorkTypes(List<HarvardWorkType> workTypes) {
		this.workTypes = workTypes;
	}

	@Override
	public UniversalItemDto toUniversalItemDto() {
		return null;
	}
}
