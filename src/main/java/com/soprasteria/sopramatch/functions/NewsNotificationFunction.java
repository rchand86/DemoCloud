package com.soprasteria.sopramatch.functions;

import java.util.function.Function;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.soprasteria.sopramatch.domain.ServerlessRequest;
import com.soprasteria.sopramatch.domain.ServerlessResponse;
import com.soprasteria.sopramatch.domain.ServerlessResponse.Code;
import com.soprasteria.sopramatch.service.NewsService;
import com.soprasteria.sopramatch.service.QuestionAnswerService;
import com.soprasteria.sopramatch.utils.Constants;

@Component("newsNotificationFunction")
public class NewsNotificationFunction implements Function<ServerlessRequest, ServerlessResponse<?>> {
	
	private static Logger LOGGER = Logger.getLogger(NewsNotificationFunction.class);
	
	private final NewsService newsService;
	private final QuestionAnswerService qaService;

	public NewsNotificationFunction(final NewsService newsService, final QuestionAnswerService qaService) {
		this.newsService = newsService;
		this.qaService = qaService;
	}
	
	@Override
	public ServerlessResponse<?> apply(final ServerlessRequest serverlessRequest) {
		try {
				LOGGER.info("< newsNotificationFunction::Lambda > Filter Input Parameter : "+serverlessRequest.getFilter());
				
				switch (serverlessRequest.getFilter()) {
				case Constants.ALL_NEWS:
					return newsService.getAllNewsItems(serverlessRequest);
				case Constants.NEWS_BY_TYPE:
					return newsService.getNewsByType(serverlessRequest);
				case Constants.ALL_QUESTIONS:
					return qaService.getAllQuestions(serverlessRequest);
				case Constants.ADD_QUESTION:
					return qaService.addQuestion(serverlessRequest);
				default:
					return new ServerlessResponse<Object>(Code.FILTER_PARAM_ERROR);
				}
			} catch (final Exception e) {
				LOGGER.error("Exception In NewsNotificationFunction::apply", e);
				return new ServerlessResponse<Object>(Code.INTERNAL_ERROR);
			}
	}
}
