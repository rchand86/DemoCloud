package com.soprasteria.sopramatch.functions;

import java.util.Base64;
import java.util.function.Function;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.soprasteria.sopramatch.domain.ServerlessRequest;
import com.soprasteria.sopramatch.domain.ServerlessResponse;
import com.soprasteria.sopramatch.domain.ServerlessResponse.Code;
import com.soprasteria.sopramatch.service.AdOneService;
import com.soprasteria.sopramatch.service.AppConfigService;
import com.soprasteria.sopramatch.utils.Constants;

@Component("authAdOneUserFunction")
public class AuthenticateAdOneUserFunction implements Function<ServerlessRequest, ServerlessResponse<?>> {

	private static Logger LOGGER = Logger.getLogger(AuthenticateAdOneUserFunction.class);

	private final AdOneService adOneService;
	private final AppConfigService appConfigService;

	public AuthenticateAdOneUserFunction(final AdOneService adOneService, final AppConfigService appConfigService) {
		this.adOneService = adOneService;
		this.appConfigService = appConfigService;
	}

	@Override
	public ServerlessResponse<?> apply(final ServerlessRequest serverlessRequest) {
		try {
			LOGGER.info("< authAdOneUserFunction::Lambda > Filter Input Parameter : "+serverlessRequest.getFilter());
			
			switch (serverlessRequest.getFilter()) {
			
			case Constants.USER_AUTH:
				serverlessRequest.setUserName(new String(Base64.getDecoder().decode(serverlessRequest.getUserName())));
				serverlessRequest.setPwd(new String(Base64.getDecoder().decode(serverlessRequest.getPwd())));
				return adOneService.authenticateAdOneUser(serverlessRequest);
				
			case Constants.ALL_CONFIG:
				return appConfigService.getAllAppConfigurations(serverlessRequest);
				
			case Constants.CONFIG_ITEMS:
				return appConfigService.getConfigItemsByConfiguration(serverlessRequest);
				
			default:
				return new ServerlessResponse<Object>(Code.FILTER_PARAM_ERROR);
			}
			
		} catch (final Exception e) {
			LOGGER.error("Exception In AuthenticateAdOneUserFunction::apply", e);
			return new ServerlessResponse<Object>(Code.INTERNAL_ERROR);
		}
	}

}
