package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages="com.nischal")
public class DataServiceApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DataServiceApplication.class, args);
	}
	
	

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
