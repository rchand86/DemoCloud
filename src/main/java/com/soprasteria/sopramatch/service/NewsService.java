package com.soprasteria.sopramatch.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soprasteria.sopramatch.domain.ServerlessRequest;
import com.soprasteria.sopramatch.domain.ServerlessResponse;
import com.soprasteria.sopramatch.domain.ServerlessResponse.Code;
import com.soprasteria.sopramatch.model.NewsItem;
import com.soprasteria.sopramatch.repository.NewsItemRepository;

@Service
public class NewsService {
	
	private static Logger LOGGER = Logger.getLogger(NewsService.class);

	@Autowired
	NewsItemRepository newsItemRepository;

	/**
	 * This method is getting all the news items 
	 * @param serverlessRequest
	 * @return
	 */
	public ServerlessResponse<List<NewsItem>> getAllNewsItems(final ServerlessRequest serverlessRequest) throws Exception{
		try {
			final List<NewsItem> newsItems = (List<NewsItem>) newsItemRepository.findAll();
			if (newsItems != null & newsItems.size() > 0) {
				newsItems.forEach(o -> BeanUtils.copyProperties(o,  new NewsItem()));
				return new ServerlessResponse<List<NewsItem>>(Code.OK, newsItems);
			} else {
				return new ServerlessResponse<List<NewsItem>>(Code.NO_DATA);
			}
		}catch (Exception e) {
			LOGGER.error("Exception in NewsService::getAllNewsItems ", e);
			return new ServerlessResponse<List<NewsItem>>(Code.INTERNAL_ERROR);
		}
	}
	
	/**
	 * 
	 * 
	 * @param serverlessRequest
	 * @return
	 */
	public ServerlessResponse<List<NewsItem>> getNewsByType(final ServerlessRequest serverlessRequest)
			throws Exception {
		try {
			LOGGER.info("NewsService:getNewsByType News Type : "+serverlessRequest.getNewsType());
			final List<NewsItem> newsItems = (List<NewsItem>) newsItemRepository
					.findByNewsItemType(serverlessRequest.getNewsType());
			
			if (newsItems != null & newsItems.size() > 0) {
				newsItems.forEach(o -> BeanUtils.copyProperties(o, new NewsItem()));
				return new ServerlessResponse<List<NewsItem>>(Code.OK, newsItems);
			} else {
				return new ServerlessResponse<List<NewsItem>>(Code.NO_DATA);
			}
		} catch (Exception e) {
			LOGGER.error("Exception in NewsService::getAllNewsItems ", e);
			return new ServerlessResponse<List<NewsItem>>(Code.INTERNAL_ERROR);
		}
	}

}
