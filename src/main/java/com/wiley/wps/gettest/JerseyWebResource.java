package com.wiley.wps.gettest;

import java.io.IOException;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;


public class JerseyWebResource {
	
	private static Client client = Client.create();
	
	private final String testUri;
	
	public JerseyWebResource(String testUri) {
		this.testUri = testUri;
	}

	public void get() throws IOException {
		WebResource resource = client.resource(testUri);
		resource.get(String.class);
		System.out.print(".");
	}

}
