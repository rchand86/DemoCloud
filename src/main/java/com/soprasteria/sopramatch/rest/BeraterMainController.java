package com.soprasteria.sopramatch.rest;

import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.sopramatch.domain.AdOneUser;
import com.soprasteria.sopramatch.domain.ServerlessRequest;
import com.soprasteria.sopramatch.domain.ServerlessResponse;
import com.soprasteria.sopramatch.dto.ConfigItemsDTO;
import com.soprasteria.sopramatch.dto.HomeDTO;
import com.soprasteria.sopramatch.dto.QuestionDTO;
import com.soprasteria.sopramatch.model.NewsItem;
import com.soprasteria.sopramatch.model.Question;
import com.soprasteria.sopramatch.service.AdOneService;
import com.soprasteria.sopramatch.service.AppConfigService;
import com.soprasteria.sopramatch.service.NewsService;
import com.soprasteria.sopramatch.service.QuestionAnswerService;
import com.soprasteria.sopramatch.utils.Constants;

@RestController
public class BeraterMainController {

	@Autowired
	AdOneService adOneService;
	
	@Autowired
	NewsService newsService;
	@Autowired
	AppConfigService appConfigService;
	
	@Autowired
	QuestionAnswerService qaService;

	@RequestMapping(value = "/api/authUser", method = { RequestMethod.GET, RequestMethod.POST } )
	public ServerlessResponse<AdOneUser> authenticateAdOneUser(
			@RequestParam(value = "adUser", defaultValue = "") String adUser,
			@RequestParam(value = "pwd", defaultValue = "") String pwd) throws Exception {

		ServerlessRequest serverlessRequest = new ServerlessRequest();
		serverlessRequest.setUserName(new String(Base64.getDecoder().decode(adUser)));
		serverlessRequest.setPwd(new String(Base64.getDecoder().decode(pwd)));

		return adOneService.authenticateAdOneUser(serverlessRequest);
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/getAllNews", method = { RequestMethod.GET} )
	public ServerlessResponse<List<NewsItem>> getNewsNotifications() throws Exception {
		ServerlessRequest serverlessRequest = new ServerlessRequest();
		ServerlessResponse<List<NewsItem>> newsItems = newsService.getAllNewsItems(serverlessRequest);
		return newsItems;
	}
	
	/**
	 *  
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/getNewsByType", method = { RequestMethod.GET})
	public ServerlessResponse<List<NewsItem>> getNewsByType(@RequestParam(value = "type") Integer newsType) throws Exception {
		ServerlessRequest serverlessRequest = new ServerlessRequest();
		serverlessRequest.setNewsType(newsType);
		ServerlessResponse<List<NewsItem>> newsItems = newsService.getNewsByType(serverlessRequest);
		return newsItems;
	}
	
	/**
	 *  
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/getAppConfigurations", method = { RequestMethod.GET} )
	public ServerlessResponse<List<HomeDTO>> getAllAppConfigurations() throws Exception {
		ServerlessResponse<List<HomeDTO>> appConfigurations = appConfigService.getAllAppConfigurations(new ServerlessRequest());
		return appConfigurations;
	}
	/**
	 * 
	 * @param configID
	 * @return List<AppConfigItem>
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/getAppConfigItems", method = { RequestMethod.GET} )
	public ServerlessResponse<List<ConfigItemsDTO>> getConfigItemsByConfiguration(@RequestParam(value = "cid") Long configID) throws Exception {
		final ServerlessRequest serverlessRequest = new ServerlessRequest();
		serverlessRequest.setCid(configID);
		return appConfigService.getConfigItemsByConfiguration(serverlessRequest);
	}
	
	@RequestMapping(value = "/api/getAllQuestions", method = { RequestMethod.GET} )
	public ServerlessResponse<List<QuestionDTO>> getAllQuestions() throws Exception {
		final ServerlessRequest serverlessRequest = new ServerlessRequest();
		return qaService.getAllQuestions(serverlessRequest);
	}
	/**
	 * 
	 * @param questionName
	 * @param questionText
	 * @param dateAsked
	 * @return ServerlessResponse<Question>
	 * @throws Exception
	 */
	@RequestMapping(value = "/api/addQuestion", method = { RequestMethod.GET, RequestMethod.POST })
	public ServerlessResponse<Question> addQuestion(
			@RequestParam(value = "qName", defaultValue = Constants.EMPTY) String questionName,
			@RequestParam(value = "qTxt", defaultValue = Constants.EMPTY) String questionText,
			@RequestParam(value = "dateAsked") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date dateAsked
			) throws Exception {

		final ServerlessRequest serverlessRequest = new ServerlessRequest();
		serverlessRequest.setqName(questionName);
		serverlessRequest.setqTxt(questionText);
		serverlessRequest.setDateAsked(dateAsked);
		return qaService.addQuestion(serverlessRequest);
	}
}
