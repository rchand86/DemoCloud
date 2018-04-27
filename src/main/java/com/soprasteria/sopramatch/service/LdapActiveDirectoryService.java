package com.soprasteria.sopramatch.service;

import java.util.Base64;
import java.util.Hashtable;

import javax.annotation.PostConstruct;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.soprasteria.sopramatch.domain.AdOneUser;

@Service
public class LdapActiveDirectoryService {

	private static Logger LOGGER = Logger.getLogger(LdapActiveDirectoryService.class);

	@Value("${ldap.url}")
	private String ldapUrl;
	
	@Value("${ldap.context.factory}")
	private String ldapCtxFactory;
	
	@Value("${ldap.security.authentication}")
	private String securityAuthentication;
	
	@Value("${ldap.username}")
	private String userName;
	
	@Value("${ldap.password}")
	private String passowrd;
	
	@Value("${ldap.base.dn}")
	private String searchContext;
	
	private InitialDirContext initialDirContext;
	
	static final String[] returningAttributes = { "employeeID", "displayName", "telephoneNumber", "mail",
												  "SteriaStartDate", "department", "thumbnailPhoto" };
	
	static final String userSearchFilter = "(&(objectCategory=User)(userPrincipalName=%s))";
	static final String userSamAccNameFilter = "(&(objectCategory=User)(sAMAccountName=%s))";
	static final String userNamePasswordFilter = "(&(objectCategory=User)(sAMAccountName=%s)(userpassword=%s))";
	
	static final Hashtable<String, String> env = new Hashtable<String, String>();

	@PostConstruct
	public void init() throws NamingException {
		env.put(Context.INITIAL_CONTEXT_FACTORY, ldapCtxFactory);
		env.put(Context.SECURITY_AUTHENTICATION, securityAuthentication);
		env.put(Context.PROVIDER_URL, ldapUrl);
		/*env.put(Context.SECURITY_PRINCIPAL, new String(Base64.getDecoder().decode(userName)));
		env.put(Context.SECURITY_CREDENTIALS,  new String(Base64.getDecoder().decode(passowrd)));*/
		env.put("com.sun.jndi.ldap.connect.pool", "true");
		env.put("com.sun.jndi.ldap.connect.pool.initsize", "5");
		env.put("com.sun.jndi.ldap.connect.pool.timeout ", "300000");
		//this.initialDirContext = new InitialDirContext(env);
	}
	/**
	 * 
	 * @param userName
	 * @param passowrd
	 * @return
	 * @throws NamingException
	 */
	public InitialDirContext getDirContext(final String userName, final String passowrd) throws Exception  {
		env.put(Context.SECURITY_PRINCIPAL, userName );
		env.put(Context.SECURITY_CREDENTIALS,  passowrd);
		return new InitialDirContext(env);
	}
	/**
	 * 
	 * @return InitialDirContext
	 * @throws Exception
	 */
	public InitialDirContext getServiceAccountDirContext() throws Exception  {
		env.put(Context.SECURITY_PRINCIPAL, new String(Base64.getDecoder().decode(userName)) );
		env.put(Context.SECURITY_CREDENTIALS,  new String(Base64.getDecoder().decode(passowrd)));
		return new InitialDirContext(env);
	}

	/**
	 * This method is find the ad-one user based on userName and return null in case
	 * no user found.
	 * 
	 * @param userName
	 * @return AdOneUser
	 * @throws Exception
	 */
	public AdOneUser findUser(final String userName) throws Exception{
		AdOneUser adOneUser = null;
		SearchControls constraints = new SearchControls();
		constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
		constraints.setReturningAttributes(returningAttributes);
		NamingEnumeration<SearchResult> resultsEnum = null;
		InitialDirContext dirContext = null;
		
	try {
			LOGGER.info("Ad-One UserName : " + userName);
			dirContext =  getServiceAccountDirContext();
			resultsEnum = (NamingEnumeration<SearchResult>) dirContext.search(searchContext, String.format(userSamAccNameFilter, userName), constraints);
		
			if (resultsEnum.hasMore()) {
				adOneUser = new AdOneUser();
				final BeanWrapper bw = new BeanWrapperImpl(adOneUser);
				final Attributes attrs = ((SearchResult) resultsEnum.next()).getAttributes();
				for (final String attribute : returningAttributes) {
					if (attrs.get(attribute) != null) {
						bw.setPropertyValue(attribute, attrs.get(attribute).get());
					}
				}
			}
		} catch (NamingException e) {
			LOGGER.error("Threw an NamingException in LdapActiveDirectoryService::findUser", e);
		}finally {
			closeResources(dirContext, resultsEnum);
		}
		return adOneUser;
	}
	
	/**
	 * This method authenticate AD-ONE's user and return its data bases on parameters {@link userName} & {@link pwd}
	 * @param userName Ad-One userID
	 * @param pwd	Password for Ad-One
	 * @return {@link AdOneUser} or throw {@link AuthenticationException} in case Invalid credentials 
	 * @throws Exception throw uncaught exception
	 */
	public AdOneUser authenticateAdOneUser(final String userName, final String pwd) throws Exception{
		AdOneUser adOneUser = null;
		SearchControls constraints = new SearchControls();
		constraints.setSearchScope(SearchControls.SUBTREE_SCOPE);
		constraints.setReturningAttributes(returningAttributes);
		
		NamingEnumeration<SearchResult> resultsEnum = null;
		InitialDirContext dirContext = null;
	try {
			LOGGER.info("UserName : "+userName);
			dirContext =  getDirContext(userName, pwd);
			resultsEnum = (NamingEnumeration<SearchResult>) dirContext.search(searchContext, String.format(userSamAccNameFilter, userName, pwd), constraints);
		
			if (resultsEnum.hasMore()) {
				adOneUser = new AdOneUser();
				final BeanWrapper bw = new BeanWrapperImpl(adOneUser);
				final Attributes attrs = ((SearchResult) resultsEnum.next()).getAttributes();
				for (final String attribute : returningAttributes) {
					if (attrs.get(attribute) != null) {
						bw.setPropertyValue(attribute, attrs.get(attribute).get());
					}
				}
			}
		} catch (AuthenticationException e) {
			LOGGER.error("Threw an AuthenticationException in LdapActiveDirectoryService::authenticateAdOneUser" , e);
			throw e;
		} finally {
			closeResources(dirContext, resultsEnum);
		}
		return adOneUser;
	}

	/**
	 * This method close Ldap directory related open recourses
	 * @param dirContext
	 * @param resultsEnum
	 */
	private void closeResources(final InitialDirContext dirContext, final NamingEnumeration<SearchResult> resultsEnum) {
		try {
			if (resultsEnum != null) {
				resultsEnum.close();
			}
		} catch (Exception eom) {
			LOGGER.error("Finally block Threw an Exception in LdapActiveDirectoryService::closeResources", eom);
		}

		try {
			if (dirContext != null) {
				dirContext.close();
			}
		} catch (Exception eom) {
			LOGGER.error("Finally block Threw an Exception in LdapActiveDirectoryService::closeResources", eom);
		}
	}
	
}
