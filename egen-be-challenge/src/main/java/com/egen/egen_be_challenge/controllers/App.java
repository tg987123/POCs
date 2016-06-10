package com.egen.egen_be_challenge.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.web.client.RestTemplate;


public class App implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	@Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Sensor sensor = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Sensor.class);
        System.out.println(sensor.toString());
    }
}
