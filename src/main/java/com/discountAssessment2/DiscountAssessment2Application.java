package com.discountAssessment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import test.discountAssessment2.service.CalculateBill;
import test.discountAssessment2.service.CalculateBillImpl;

@SpringBootApplication
public class DiscountAssessment2Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscountAssessment2Application.class, args);
	}

	@Bean
	public static CalculateBill getCalculateBill(){
		return new CalculateBillImpl();
	}
}
