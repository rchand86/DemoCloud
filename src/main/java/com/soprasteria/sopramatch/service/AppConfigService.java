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
import com.soprasteria.sopramatch.dto.ConfigItemsDTO;
import com.soprasteria.sopramatch.dto.HomeDTO;
import com.soprasteria.sopramatch.model.AppConfigItem;
import com.soprasteria.sopramatch.model.AppConfiguration;
import com.soprasteria.sopramatch.repository.AppConfigItemRepository;
import com.soprasteria.sopramatch.repository.AppConfigurationRepository;

@Service
public class AppConfigService {
	
	private static Logger LOGGER = Logger.getLogger(AppConfigService.class);

	@Autowired
	AppConfigurationRepository appConfigurationRepository;
	@Autowired
	AppConfigItemRepository	appConfigItemRepository;
	/**
	 * This method returns list of all the app configuration
	 * @param serverlessRequest
	 * @return List<AppConfiguration>
	 * @throws Exception
	 */
	public ServerlessResponse<List<HomeDTO>> getAllAppConfigurations(final ServerlessRequest serverlessRequest) throws Exception{
		try {
			final List<AppConfiguration> appConfigurations = (List<AppConfiguration>) appConfigurationRepository.findAll();
			if (appConfigurations != null & appConfigurations.size() > 0) {
				List<HomeDTO> HomeDTOList = appConfigurations
		                .stream()
		                .map(e ->  { 
		                	final HomeDTO hdto = new HomeDTO();
		                	BeanUtils.copyProperties(e, hdto, new String [] {"appConfig"}); 
		                	return hdto;})
		                .collect(Collectors.toList());
				
				return new ServerlessResponse<List<HomeDTO>>(Code.OK, HomeDTOList);
			} else {
				return new ServerlessResponse<List<HomeDTO>>(Code.NO_DATA);
			}
		}catch (Exception e) {
			LOGGER.error("Exception in AppConfigService::getAllAppConfigurations ", e);
			return new ServerlessResponse<List<HomeDTO>>(Code.INTERNAL_ERROR);
		}
	}
	
	/**
	 * 
	 * @param serverlessRequest
	 * @return
	 * @throws Exception
	 */
	public ServerlessResponse<List<ConfigItemsDTO>> getConfigItemsByConfiguration(final ServerlessRequest serverlessRequest)
			throws Exception {
		try {
			AppConfiguration appConfig = new AppConfiguration();
			appConfig.setId(serverlessRequest.getCid());
			
			final List<AppConfigItem> appConfigItems = (List<AppConfigItem>) appConfigItemRepository.findByAppConfig(appConfig);
			
			if (appConfigItems != null & appConfigItems.size() > 0) {
				
				List<ConfigItemsDTO> configItemsDTOList = appConfigItems
		                .stream()
		                .map(e ->  { 
		                	final ConfigItemsDTO cdto = new ConfigItemsDTO();
		                	BeanUtils.copyProperties(e, cdto); 
		                	return cdto;})
		                .collect(Collectors.toList());
				
				return new ServerlessResponse<List<ConfigItemsDTO>>(Code.OK, configItemsDTOList);
			} else {
				return new ServerlessResponse<List<ConfigItemsDTO>>(Code.NO_DATA);
			}
		} catch (Exception e) {
			LOGGER.error("Exception in AppConfigService::getConfigItemsByConfiguration ", e);
			return new ServerlessResponse<List<ConfigItemsDTO>>(Code.INTERNAL_ERROR);
		}
	}

}
