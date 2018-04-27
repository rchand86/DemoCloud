package com.soprasteria.sopramatch.service;


import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soprasteria.sopramatch.domain.ServerlessRequest;
import com.soprasteria.sopramatch.domain.ServerlessResponse;
import com.soprasteria.sopramatch.domain.ServerlessResponse.Code;
import com.soprasteria.sopramatch.dto.AnswerDTO;
import com.soprasteria.sopramatch.dto.QuestionDTO;
import com.soprasteria.sopramatch.model.Question;
import com.soprasteria.sopramatch.repository.AnswerRepository;
import com.soprasteria.sopramatch.repository.QuestionRepository;


@Service
public class QuestionAnswerService {

	private static Logger LOGGER = Logger.getLogger(QuestionAnswerService.class);

	@Autowired
	AnswerRepository answerRepository;

	@Autowired
	QuestionRepository questionRepository;

	public ServerlessResponse<List<QuestionDTO>> getAllQuestions(ServerlessRequest serverlessRequest) {
		try {
			final List<Question> qa = (List<Question>) questionRepository.findAllByOrderByDateAskedDesc();
			if (qa != null & qa.size() > 0) {
				List<QuestionDTO> dtoList = qa.stream().map(e -> {
					final QuestionDTO hdto = new QuestionDTO();
					BeanUtils.copyProperties(e, hdto, new String[] {"answer"});
					List<AnswerDTO> answerList = e.getAnswer()
			                .stream()
			                .map(a ->  { 
			                	final AnswerDTO adto = new AnswerDTO();
			                	BeanUtils.copyProperties(a, adto, new String [] {"questionId"}); 
			                	return adto;})
			                .collect(Collectors.toList());
					hdto.setAnswer(answerList);
					return hdto;
				}).collect(Collectors.toList());
				return new ServerlessResponse<List<QuestionDTO>>(Code.OK, dtoList);
			} else {
				return new ServerlessResponse<List<QuestionDTO>>(Code.NO_DATA);
			}
		} catch (Exception e) {
			LOGGER.error("Exception in QuestionAnswerService::getAllQuestions ", e);
			return new ServerlessResponse<List<QuestionDTO>>(Code.INTERNAL_ERROR);
		}
	}
	/**
	 * 
	 * @param Req
	 * @return ServerlessResponse<Question>
	 */
	public ServerlessResponse<Question> addQuestion(final ServerlessRequest req) {
		try {
			Question q = new Question();
			q.setQuestionName(req.getqName());
			q.setQuestionText(req.getqTxt());
			q.setDateAsked(req.getDateAsked());
			
			q = questionRepository.save(q);
			if (q != null & q.getId() >= 0) {
				return new ServerlessResponse<Question>(Code.OK, q);
			} else {
				return new ServerlessResponse<Question>(Code.SAVE_ERROR);
			}
		} catch (Exception e) {
			LOGGER.error("Exception in QuestionAnswerService::addQuestion ", e);
			return new ServerlessResponse<Question>(Code.INTERNAL_ERROR);
		}
	}

}
