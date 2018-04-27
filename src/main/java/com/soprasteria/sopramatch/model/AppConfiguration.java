package com.soprasteria.sopramatch.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AppConfiguration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="app_short_name", nullable=false)
	private String appShortName;
	
	@Column(name="app_name", nullable=false)
	private String appName;
	
	@OneToMany(
	        mappedBy = "appConfig", 
	        cascade = CascadeType.ALL, 
	        orphanRemoval = true
	    )
	private Set<AppConfigItem> appConfigItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppShortName() {
		return appShortName;
	}

	public void setAppShortName(String appShortName) {
		this.appShortName = appShortName;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Set<AppConfigItem> getAppConfigItems() {
		return appConfigItems;
	}

	public void setAppConfigItems(Set<AppConfigItem> appConfigItems) {
		this.appConfigItems = appConfigItems;
	}

}
