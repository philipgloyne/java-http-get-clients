package com.wiley.wps.gettest;

import java.io.IOException;

import org.springframework.web.client.RestTemplate;


public class SpringRestTemplateWebResource {
	
	private static RestTemplate client = new RestTemplate();
	
	private final String testUri;
	
	public SpringRestTemplateWebResource(String testUri) {
		this.testUri = testUri;
	}

	public void get() throws IOException {
		client.getForObject(testUri, String.class);
		System.out.print(".");
	}

}
