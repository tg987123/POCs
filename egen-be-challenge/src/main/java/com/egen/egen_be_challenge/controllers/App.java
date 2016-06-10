package com.egen.egen_be_challenge.controllers;

import org.springframework.web.client.RestTemplate;


public class App {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

		String consumeJSONString = restTemplate
				.getForObject("http://localhost:8080/SampleRESTFulService/consumeJSONString", String.class);
		System.out.println("JSON String: " + consumeJSONString);
	}
}
