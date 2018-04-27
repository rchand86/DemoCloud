package com.soprasteria.sopramatch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.soprasteria.sopramatch.model.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {

	List<Question> findAllByOrderByDateAskedDesc();
}
