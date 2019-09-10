package com.vruksha.restclient;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplatBuild {

	@Bean
	public RestTemplate restBuilder(RestTemplateBuilder rtb)
	{
		
		return rtb.build();
	}
	
	
	
}

