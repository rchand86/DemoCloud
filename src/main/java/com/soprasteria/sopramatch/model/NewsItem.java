package com.soprasteria.sopramatch.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class NewsItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Lob
	private String newsSubject;
	@Lob
	private String newsText;
	private Date newsDate;
	private Integer newsItemType;
	private Integer recipientsId;
	private Integer newsMediaType;
	private String newsPathToMedia;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNewsSubject() {
		return newsSubject;
	}

	public void setNewsSubject(String newsSubject) {
		this.newsSubject = newsSubject;
	}

	public String getNewsText() {
		return newsText;
	}

	public void setNewsText(String newsText) {
		this.newsText = newsText;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public Integer getNewsItemType() {
		return newsItemType;
	}

	public void setNewsItemType(Integer newsItemType) {
		this.newsItemType = newsItemType;
	}

	public Integer getRecipientsId() {
		return recipientsId;
	}

	public void setRecipientsId(Integer recipientsId) {
		this.recipientsId = recipientsId;
	}

	public Integer getNewsMediaType() {
		return newsMediaType;
	}

	public void setNewsMediaType(Integer newsMediaType) {
		this.newsMediaType = newsMediaType;
	}

	public String getNewsPathToMedia() {
		return newsPathToMedia;
	}

	public void setNewsPathToMedia(String newsPathToMedia) {
		this.newsPathToMedia = newsPathToMedia;
	}
	
	
}
