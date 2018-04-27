package com.soprasteria.sopramatch.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Lob
	private String answerText;
	private String answerStatus;
	private Date dateAnswered;
	private Date dateSolved;

//	@OneToOne(fetch = FetchType.LAZY,targetEntity=Question.class)
	//@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "question_id", nullable = false)
	@ManyToOne
    @JoinColumn(name="question_id")
	private Question questionId;
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

	public Question getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}

	public Long getConsultantId() {
		return consultantId;
	}

	public void setConsultantId(Long consultantId) {
		this.consultantId = consultantId;
	}

}
