package com.soprasteria.sopramatch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soprasteria.sopramatch.model.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
	public Answer findByQuestionId(final Long question_id);
}
