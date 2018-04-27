package com.soprasteria.sopramatch.domain;

import java.util.Date;

import com.soprasteria.sopramatch.utils.Constants;

public class ServerlessRequest {

private String filter = Constants.EMPTY;
private String userName;
private String pwd;
private String input;
private Integer newsType;
private Long cid;

private String qName;
private String qTxt;
private Date dateAsked;

public String getFilter() {
	return filter;
}

public void setFilter(String filter) {
	this.filter = filter;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getInput() {
    return input;
}

public void setInput(final String input) {
    this.input = input;
}

public Integer getNewsType() {
	return newsType;
}

public void setNewsType(Integer newsType) {
	this.newsType = newsType;
}

public Long getCid() {
	return cid;
}

public void setCid(Long cid) {
	this.cid = cid;
}

public String getqName() {
	return qName;
}

public void setqName(String qName) {
	this.qName = qName;
}

public String getqTxt() {
	return qTxt;
}

public void setqTxt(String qTxt) {
	this.qTxt = qTxt;
}

public Date getDateAsked() {
	return dateAsked;
}

public void setDateAsked(Date dateAsked) {
	this.dateAsked = dateAsked;
}}