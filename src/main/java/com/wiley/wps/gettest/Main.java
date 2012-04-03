package com.wiley.wps.gettest;


public class Main {
	
	public static void main(String[] args) throws Exception {
		String testUri = args[0];
		int times = Integer.valueOf(args[1]);

		System.out.println("== BEGIN ==");
		System.out.println("Calling HTTP GET on " + testUri + " " + times
				+ " times");
		for (WebResource webResource : WebResource.values()) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < times; i++) {
				webResource.get(testUri);
			}
			long end = System.currentTimeMillis();
			System.out.println(" done");
			System.out.println(webResource.name().toLowerCase()
					+ " client takes: " + (end - start) + "ms");
		}
		System.out.println("== END ==");
	}
}