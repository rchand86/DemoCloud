package com.soprasteria.sopramatch.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Base64;

import javax.naming.AuthenticationException;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.soprasteria.sopramatch.SopraMatchBackendApplication;
import com.soprasteria.sopramatch.domain.AdOneUser;
import com.soprasteria.sopramatch.utils.Constants;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SopraMatchBackendApplication.class)
@AutoConfigureMockMvc
public class LdapActiveDirectoryServiceTest {

	@Autowired
	private LdapActiveDirectoryService ldapActiveDirectoryService;
	
	private static Logger LOGGER = Logger.getLogger(LdapActiveDirectoryServiceTest.class);
	
	static final String UK_ADONE = "raamir"+Constants.ADONE_DOMAIN;
	static final String DE_ADONE = "sadakci"+Constants.ADONE_DOMAIN;
	static final String IN_ADONE = "ranvsing"+Constants.ADONE_DOMAIN;

    @Test
    public void ukAdOneUserSearchTest() throws Exception {
    	AdOneUser adOneUser = ldapActiveDirectoryService.findUser(UK_ADONE);
    	assertNotNull(adOneUser);
    	assertTrue(adOneUser.getEmployeeID().length() > 1);
    }
    
    @Test
    public void deAdOneUserSearchTest() throws Exception {
    	AdOneUser adOneUser = ldapActiveDirectoryService.findUser(DE_ADONE);
    	assertNotNull(adOneUser);
    	assertTrue(adOneUser.getEmployeeID().length() > 1);
    }
    
    @Test
    public void inAdOneUserSearchTest() throws Exception {
    	AdOneUser adOneUser = ldapActiveDirectoryService.findUser(IN_ADONE);
    	assertNotNull(adOneUser);
    	assertTrue(adOneUser.getEmployeeID().length() > 1);
    }
    
    @Test
    public void adOneServiceAccountTest() throws Exception{
    	String username= "IN-SVC-Consultant";
    	String password = "Berater@2018";
		try {
			AdOneUser adOneUser = ldapActiveDirectoryService.authenticateAdOneUser(username+Constants.ADONE_DOMAIN, password);
			//assertNotNull(adOneUser);
		} catch (AuthenticationException e) {
			assertFalse("Authentication Error For Service account: "+username, true);
		}
    }
    
    @Test
    public void encodeDecodeTest() throws Exception {
    	String userId = Base64.getEncoder().encodeToString("IN-SVC-Consultant@one.steria.dom".getBytes("utf-8"));
    	String password = Base64.getEncoder().encodeToString("Berater@2018".getBytes("utf-8"));
    	LOGGER.info("Encoded Service UserName:"+ userId);
    	LOGGER.info("Encoded Service Password:"+ password);
    	
		assertArrayEquals("IN-SVC-Consultant@one.steria.dom".getBytes("utf-8"),
				new String(Base64.getDecoder().decode(userId)).getBytes());
		
		assertArrayEquals("Berater@2018".getBytes("utf-8"),
				new String(Base64.getDecoder().decode(password)).getBytes());
    }

}
