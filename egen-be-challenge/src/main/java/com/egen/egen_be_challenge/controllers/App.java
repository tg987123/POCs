package com.egen.egen_be_challenge.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@ComponentScan
@EnableAutoConfiguration
public class App implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	@Override
    public void run(String... args) throws Exception {
        //RestTemplate restTemplate = new RestTemplate();
        //Sensor sensor = restTemplate.getForObject("http://localhost:8080/abc", Sensor.class);
        //System.out.println(sensor.toString());
    }
}
