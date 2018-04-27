package com.soprasteria.sopramatch.dto;

import java.util.Date;

public class AnswerDTO {
	private Long id;
	private String answerText;
	private String answerStatus;
	private Date dateAnswered;
	private Date dateSolved;
	private Long consultantId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public String getAnswerStatus() {
		return answerStatus;
	}
	public void setAnswerStatus(String answerStatus) {
		this.answerStatus = answerStatus;
	}
	public Date getDateAnswered() {
		return dateAnswered;
	}
	public void setDateAnswered(Date dateAnswered) {
		this.dateAnswered = dateAnswered;
	}
	public Date getDateSolved() {
		return dateSolved;
	}
	public void setDateSolved(Date dateSolved) {
		this.dateSolved = dateSolved;
	}
	public Long getConsultantId() {
		return consultantId;
	}
	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}
	
}
