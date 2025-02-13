package com.example.Market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
/*@ComponentScan(basePackages = "com.example.Market") */
public class MarketApplication {
	public static void main(String[] args) {
		SpringApplication.run(MarketApplication.class, args);
	}

}
