package com.soprasteria.sopramatch.dto;

import java.util.Date;
import java.util.List;
import java.util.Set;



import com.soprasteria.sopramatch.model.Answer;

public class QuestionDTO {
	private Long id;
	private String questionName;
	private String questionText;
	private Date dateAsked;
	private Date dateClosed;
	private Long consultantId;
	private List<AnswerDTO> answer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public Date getDateAsked() {
		return dateAsked;
	}
	public void setDateAsked(Date dateAsked) {
		this.dateAsked = dateAsked;
	}
	public Date getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(Date dateClosed) {
		this.dateClosed = dateClosed;
	}
	public Long getConsultantId() {
		return consultantId;
	}
	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}
	public List<AnswerDTO> getAnswer() {
		return answer;
	}
	public void setAnswer(List<AnswerDTO> answer) {
		this.answer = answer;
	}
	
	
}
