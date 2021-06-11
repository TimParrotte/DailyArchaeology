package com.dailyarchaeology.museum_artifacts.domain;

import java.util.List;

public class HarvardItem {
	
	private String accessionmethod;
	private Integer accessionyear;
	private Integer accesslevel; // Maybe an ENUM of (0,1).
	private String century;
	private String classification;
	private Integer classificationid;
	private String colors;  // ?? Not see below?
	private Integer colorcount;
	private String commentary;
	private String contact;
	private Integer contextualtextcount;
	private String copyright;
	private String creditline;
	private String culture;
	private String dated;
	private Integer datebegin;
	private Integer dateend;
	private String dateoffirepageview;
	private String dateoflastpageview;
	private String department;
	private String description;
	private String dimensions;
	private String division;
	private String edition;
	private Integer exhibitioncount;
	private Integer groupcount;
	private Integer id;
	private Integer imagecount;
	private Integer imagepermissionlevel; // ENUM (0, 1, 2)
	private List<HarvardImage> images;
	private String labeltext;
	private String lastupdate;
	private Integer lendingpermissionlevel; // ENUM (0, 1, 2)
	private Integer markscount;
	private String medium;
	private Integer mediacount;
	private Integer objectid;
	private String objectnumber;
	private String period;
	private String periodid;
	private Integer peoplecount;
	private String primaryimageurl;
	private String provenance;
	private Integer publicationcount;
	private Integer rank; //?? Not seen below?
	private Integer relatedcount;
	private List<String> seeAlso;
	private String singed;
	private String standardreferencenumber;
	private String state;
	private String style;
	private String technique;
	private Integer techniqueid;
	private String title;
	private Integer titlescount;
	private Integer totalpageviews;
	private Integer totaluniquepageviews;
	private String url;
	private String verificationlevel; // ENUM 0-4
	private List<Worktype> worktypes;
	
	public HarvardItem() {};
	
	public String getAccessionmethod() {
		return accessionmethod;
	}

	public void setAccessionmethod(String accessionmethod) {
		this.accessionmethod = accessionmethod;
	}

	public Integer getAccessionyear() {
		return accessionyear;
	}

	public void setAccessionyear(Integer accessionyear) {
		this.accessionyear = accessionyear;
	}

	public Integer getAccesslevel() {
		return accesslevel;
	}

	public void setAccesslevel(Integer accesslevel) {
		this.accesslevel = accesslevel;
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

	public Integer getClassificationid() {
		return classificationid;
	}

	public void setClassificationid(Integer classificationid) {
		this.classificationid = classificationid;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public Integer getColorcount() {
		return colorcount;
	}

	public void setColorcount(Integer colorcount) {
		this.colorcount = colorcount;
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

	public Integer getContextualtextcount() {
		return contextualtextcount;
	}

	public void setContextualtextcount(Integer contextualtextcount) {
		this.contextualtextcount = contextualtextcount;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getCreditline() {
		return creditline;
	}

	public void setCreditline(String creditline) {
		this.creditline = creditline;
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

	public Integer getDatebegin() {
		return datebegin;
	}

	public void setDatebegin(Integer datebegin) {
		this.datebegin = datebegin;
	}

	public Integer getDateend() {
		return dateend;
	}

	public void setDateend(Integer dateend) {
		this.dateend = dateend;
	}

	public String getDateoffirepageview() {
		return dateoffirepageview;
	}

	public void setDateoffirepageview(String dateoffirepageview) {
		this.dateoffirepageview = dateoffirepageview;
	}

	public String getDateoflastpageview() {
		return dateoflastpageview;
	}

	public void setDateoflastpageview(String dateoflastpageview) {
		this.dateoflastpageview = dateoflastpageview;
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

	public Integer getExhibitioncount() {
		return exhibitioncount;
	}

	public void setExhibitioncount(Integer exhibitioncount) {
		this.exhibitioncount = exhibitioncount;
	}

	public Integer getGroupcount() {
		return groupcount;
	}

	public void setGroupcount(Integer groupcount) {
		this.groupcount = groupcount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getImagecount() {
		return imagecount;
	}

	public void setImagecount(Integer imagecount) {
		this.imagecount = imagecount;
	}

	public Integer getImagepermissionlevel() {
		return imagepermissionlevel;
	}

	public void setImagepermissionlevel(Integer imagepermissionlevel) {
		this.imagepermissionlevel = imagepermissionlevel;
	}

	public List<HarvardImage> getImages() {
		return images;
	}

	public void setImages(List<HarvardImage> images) {
		this.images = images;
	}

	public String getLabeltext() {
		return labeltext;
	}

	public void setLabeltext(String labeltext) {
		this.labeltext = labeltext;
	}

	public String getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

	public Integer getLendingpermissionlevel() {
		return lendingpermissionlevel;
	}

	public void setLendingpermissionlevel(Integer lendingpermissionlevel) {
		this.lendingpermissionlevel = lendingpermissionlevel;
	}

	public Integer getMarkscount() {
		return markscount;
	}

	public void setMarkscount(Integer markscount) {
		this.markscount = markscount;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public Integer getMediacount() {
		return mediacount;
	}

	public void setMediacount(Integer mediacount) {
		this.mediacount = mediacount;
	}

	public Integer getObjectid() {
		return objectid;
	}

	public void setObjectid(Integer objectid) {
		this.objectid = objectid;
	}

	public String getObjectnumber() {
		return objectnumber;
	}

	public void setObjectnumber(String objectnumber) {
		this.objectnumber = objectnumber;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPeriodid() {
		return periodid;
	}

	public void setPeriodid(String periodid) {
		this.periodid = periodid;
	}

	public Integer getPeoplecount() {
		return peoplecount;
	}

	public void setPeoplecount(Integer peoplecount) {
		this.peoplecount = peoplecount;
	}

	public String getPrimaryimageurl() {
		return primaryimageurl;
	}

	public void setPrimaryimageurl(String primaryimageurl) {
		this.primaryimageurl = primaryimageurl;
	}

	public String getProvenance() {
		return provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public Integer getPublicationcount() {
		return publicationcount;
	}

	public void setPublicationcount(Integer publicationcount) {
		this.publicationcount = publicationcount;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getRelatedcount() {
		return relatedcount;
	}

	public void setRelatedcount(Integer relatedcount) {
		this.relatedcount = relatedcount;
	}

	public List<String> getSeeAlso() {
		return seeAlso;
	}

	public void setSeeAlso(List<String> seeAlso) {
		this.seeAlso = seeAlso;
	}

	public String getSinged() {
		return singed;
	}

	public void setSinged(String singed) {
		this.singed = singed;
	}

	public String getStandardreferencenumber() {
		return standardreferencenumber;
	}

	public void setStandardreferencenumber(String standardreferencenumber) {
		this.standardreferencenumber = standardreferencenumber;
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

	public Integer getTechniqueid() {
		return techniqueid;
	}

	public void setTechniqueid(Integer techniqueid) {
		this.techniqueid = techniqueid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTitlescount() {
		return titlescount;
	}

	public void setTitlescount(Integer titlescount) {
		this.titlescount = titlescount;
	}

	public Integer getTotalpageviews() {
		return totalpageviews;
	}

	public void setTotalpageviews(Integer totalpageviews) {
		this.totalpageviews = totalpageviews;
	}

	public Integer getTotaluniquepageviews() {
		return totaluniquepageviews;
	}

	public void setTotaluniquepageviews(Integer totaluniquepageviews) {
		this.totaluniquepageviews = totaluniquepageviews;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVerificationlevel() {
		return verificationlevel;
	}

	public void setVerificationlevel(String verificationlevel) {
		this.verificationlevel = verificationlevel;
	}

	public List<Worktype> getWorktypes() {
		return worktypes;
	}

	public void setWorktypes(List<Worktype> worktypes) {
		this.worktypes = worktypes;
	}

	private class HarvardImage {
		private String alttext;
		private String baseimageurl;
		private String description;
		private Integer displayorder;
		private String format;
		private Integer height;
		private Integer idsid;
		private String iiifbaseuri;
		private Integer imageid;
		private String renditionnumber;
		private String date;
		private String technique;
		private Integer width;
		
		public HarvardImage() {};
		
		public String getAlttext() {
			return alttext;
		}
		public void setAlttext(String alttext) {
			this.alttext = alttext;
		}
		public String getBaseimageurl() {
			return baseimageurl;
		}
		public void setBaseimageurl(String baseimageurl) {
			this.baseimageurl = baseimageurl;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Integer getDisplayorder() {
			return displayorder;
		}
		public void setDisplayorder(Integer displayorder) {
			this.displayorder = displayorder;
		}
		public String getFormat() {
			return format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public Integer getHeight() {
			return height;
		}
		public void setHeight(Integer height) {
			this.height = height;
		}
		public Integer getIdsid() {
			return idsid;
		}
		public void setIdsid(Integer idsid) {
			this.idsid = idsid;
		}
		public String getIiifbaseuri() {
			return iiifbaseuri;
		}
		public void setIiifbaseuri(String iiifbaseuri) {
			this.iiifbaseuri = iiifbaseuri;
		}
		public Integer getImageid() {
			return imageid;
		}
		public void setImageid(Integer imageid) {
			this.imageid = imageid;
		}
		public String getRenditionnumber() {
			return renditionnumber;
		}
		public void setRenditionnumber(String renditionnumber) {
			this.renditionnumber = renditionnumber;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTechnique() {
			return technique;
		}
		public void setTechnique(String technique) {
			this.technique = technique;
		}
		public Integer getWidth() {
			return width;
		}
		public void setWidth(Integer width) {
			this.width = width;
		}
	}
	
	private class Worktype {
		private String worktypeid;
		private String weight;
		
		public Worktype() {}

		public String getWorktypeid() {
			return worktypeid;
		}

		public void setWorktypeid(String worktypeid) {
			this.worktypeid = worktypeid;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		};
	}

	private class SeeAlso {
		private String id;
		private String type;
		private String format;
		private String profile;
		
		public SeeAlso() {}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFormat() {
			return format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getProfile() {
			return profile;
		}

		public void setProfile(String profile) {
			this.profile = profile;
		};
	}
}
