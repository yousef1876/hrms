package com.application.hrms.config.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Configuration
@Component
@EnableOAuth2Client
public class Oauth2Config {

	@Autowired
	OAuth2ClientContext oauth2ClientContext;

	@Value("${config.oauth2.accessTokenUri:http://localhost:8090/hrms/oauth/access_token}")
	private String accessTokenUri;

	@Value("${config.oauth2.userAuthorizationUri:http://localhost:8090/hrms//oauthrize}")
	private String userAuthorizationUri;

	@Value("${config.oauth2.clientID:test}")
	private String clientID;

	@Value("${config.oauth2.clientSecret:test@123}")
	private String clientSecret;

	@Bean
	public RestTemplate oAuthRestTemplate() {
		ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
		resourceDetails.setId("1");
		resourceDetails.setClientId(clientID);
		resourceDetails.setClientSecret(clientSecret);
		resourceDetails.setAccessTokenUri(accessTokenUri);

		OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resourceDetails, new DefaultOAuth2ClientContext());

		return restTemplate;
	}
}
