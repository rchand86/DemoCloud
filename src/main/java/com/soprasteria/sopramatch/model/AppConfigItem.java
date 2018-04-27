package com.soprasteria.sopramatch.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AppConfigItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="sort_number")
	private Integer sortNumber;
	
	@Column(name="date_valid_from")
	private Date dateValidFrom;
	
	@Column(name="date_valid_to")
	private Date dateValidTo;
	
	@Column(name="display_name")
	private String displayName;
	
	@Column(name="link_to_android")
	private String linkToAndroid;
	
	@Column(name="link_to_ios")
	private String linkToIos;
	
	@Column(name="path_to_icon")
	private String pathToIcon;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_configuration_id")
	private AppConfiguration appConfig;

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

	public AppConfiguration getAppConfig() {
		return appConfig;
	}

	public void setAppConfig(AppConfiguration appConfig) {
		this.appConfig = appConfig;
	}
	
}
