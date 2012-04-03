package com.wiley.wps.gettest;

public enum WebResource {
	NATIVE() {
		@Override
		public void get(String testUri) throws Exception {
			new NativeJavaWebResource(testUri).get();
		}
	},
	JERSEY() {
		@Override
		public void get(String testUri) throws Exception {
			new JerseyWebResource(testUri).get();
		}
	},
	APACHE() {
		@Override
		public void get(String testUri) throws Exception {
			new ApacheCommonsClientWebResource(testUri).get();
		}
	},
	SPRING() {
		@Override
		public void get(String testUri) throws Exception {
			new SpringRestTemplateWebResource(testUri).get();
		}
	};


	public abstract void get(String testUri) throws Exception;
}
