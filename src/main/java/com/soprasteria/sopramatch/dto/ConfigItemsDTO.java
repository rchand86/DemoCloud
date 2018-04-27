package com.soprasteria.sopramatch.dto;

import java.util.Date;

public class ConfigItemsDTO {

	private Long id;
	private Integer sortNumber;
	private Date dateValidFrom;
	private Date dateValidTo;
	private String displayName;
	private String linkToAndroid;
	private String linkToIos;
	private String pathToIcon;
	private Long appConfigurationId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getSortNumber() {
		return sortNumber;
	}
	public void setSortNumber(Integer sortNumber) {
		this.sortNumber = sortNumber;
	}
	public Date getDateValidFrom() {
		return dateValidFrom;
	}
	public void setDateValidFrom(Date dateValidFrom) {
		this.dateValidFrom = dateValidFrom;
	}
	public Date getDateValidTo() {
		return dateValidTo;
	}
	public void setDateValidTo(Date dateValidTo) {
		this.dateValidTo = dateValidTo;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getLinkToAndroid() {
		return linkToAndroid;
	}
	public void setLinkToAndroid(String linkToAndroid) {
		this.linkToAndroid = linkToAndroid;
	}
	public String getLinkToIos() {
		return linkToIos;
	}
	public void setLinkToIos(String linkToIos) {
		this.linkToIos = linkToIos;
	}
	public String getPathToIcon() {
		return pathToIcon;
	}
	public void setPathToIcon(String pathToIcon) {
		this.pathToIcon = pathToIcon;
	}
	public Long getAppConfigurationId() {
		return appConfigurationId;
	}
	public void setAppConfigurationId(Long appConfigurationId) {
		this.appConfigurationId = appConfigurationId;
	}
	
}
