package com.wiley.wps.gettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class NativeJavaWebResource {
	
	private final String testUri;

	public NativeJavaWebResource(String testUri) {
		this.testUri = testUri;
	}

	public void get() throws IOException {
		URL url = new URL(testUri);
		URLConnection yc = url.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
		String inputLine = null;
        StringBuilder body = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
        	body.append(inputLine);
        }
        body.toString();
        System.out.print(".");
        in.close();
	}

}
