package com.wiley.wps.gettest;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class ApacheCommonsClientWebResource {

	private static HttpClient httpClient = new HttpClient();

	private final String testUri;

	public ApacheCommonsClientWebResource(String testUri) {
		this.testUri = testUri;
	}

	public void get() throws IOException {
		GetMethod getMethod = new GetMethod(testUri);
		httpClient.executeMethod(getMethod);
		getMethod.getResponseBodyAsString();
		System.out.print(".");
	}

}
