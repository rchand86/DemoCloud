package com.soprasteria.sopramatch.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewsNotification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="news_item_seen", nullable = false, columnDefinition = "TINYINT(1)")
	private Integer newsItemSeen;
	
	private Date dateSent;
	private Date dateSeen;
	private Integer consultantId;
	private Integer newsItemId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNewsItemSeen() {
		return newsItemSeen;
	}
	public void setNewsItemSeen(Integer newsItemSeen) {
		this.newsItemSeen = newsItemSeen;
	}
	public Date getDateSent() {
		return dateSent;
	}
	public void setDateSent(Date dateSent) {
		this.dateSent = dateSent;
	}
	public Date getDateSeen() {
		return dateSeen;
	}
	public void setDateSeen(Date dateSeen) {
		this.dateSeen = dateSeen;
	}
	public Integer getConsultantId() {
		return consultantId;
	}
	public void setConsultantId(Integer consultantId) {
		this.consultantId = consultantId;
	}
	public Integer getNewsItemId() {
		return newsItemId;
	}
	public void setNewsItemId(Integer newsItemId) {
		this.newsItemId = newsItemId;
	}
	
}
