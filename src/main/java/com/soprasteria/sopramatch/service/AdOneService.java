package com.soprasteria.sopramatch.service;

import javax.naming.AuthenticationException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soprasteria.sopramatch.domain.AdOneUser;
import com.soprasteria.sopramatch.domain.ServerlessRequest;
import com.soprasteria.sopramatch.domain.ServerlessResponse;
import com.soprasteria.sopramatch.domain.ServerlessResponse.Code;

@Service
public class AdOneService {
	
	private static Logger LOGGER = Logger.getLogger(AdOneService.class);

	@Autowired
	LdapActiveDirectoryService ldapActiveDirectoryService;

	/**
	 * This function authenticate ad-one user and returns its properties 
	 * 
	 * @param serverlessRequest
	 * @return ServerlessResponse<AdOneUser> 
	 * @throws Exception
	 */
	public ServerlessResponse<AdOneUser> authenticateAdOneUser(final ServerlessRequest serverlessRequest) {
		AdOneUser adOneUser;
		try {
			adOneUser = ldapActiveDirectoryService.findUser(serverlessRequest.getUserName());
			
			if (adOneUser != null) {
				return new ServerlessResponse<AdOneUser>(Code.OK, adOneUser);
			} else {
				return new ServerlessResponse<AdOneUser>(Code.NO_DATA);
			}
			
		} catch (AuthenticationException e) {
			return new ServerlessResponse<AdOneUser>(Code.AUTHENTICATION_ERROR);
		}catch (Exception e) {
			LOGGER.error("Threw an Exception in AdOneService::authenticateAdOneUser ", e);
			return new ServerlessResponse<AdOneUser>(Code.INTERNAL_ERROR);
		}

	}
	
	/**
	 * This is used for test user
	 * @param serverlessRequest
	 * @return
	 */
	public ServerlessResponse<AdOneUser> authenticateTestAdOneUser(final ServerlessRequest serverlessRequest) {
		AdOneUser adOneUser;
		try {
			
			if ("test".equalsIgnoreCase(serverlessRequest.getUserName()) && "test".equals(serverlessRequest.getPwd())) {
				adOneUser = new AdOneUser();
				adOneUser.setDisplayName("Test User");
				adOneUser.setMail("test.user@soprasteria.com");
				adOneUser.setDepartment("B773");
				adOneUser.setEmployeeID("000000");
				adOneUser.setSteriaStartDate("1999/01/01");
				return new ServerlessResponse<AdOneUser>(Code.OK, adOneUser);
			} else {
				return new ServerlessResponse<AdOneUser>(Code.NO_DATA);
			}
		}catch (Exception e) {
			LOGGER.error("Threw an Exception in AdOneService::authenticateAdOneUser ", e);
			return new ServerlessResponse<AdOneUser>(Code.INTERNAL_ERROR);
		}

	}

}
