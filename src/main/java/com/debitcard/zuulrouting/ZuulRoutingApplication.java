package com.debitcard.zuulrouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRoutingApplication.class, args);
	}

}
