package com.jv.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {"com.jv", "com.jv.web.advice"}) 
//@EnableConfigurationProperties({Config.class})  
//@SpringBootApplication
public class JvWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JvWebApplication.class, args);
	}
}
