package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.Test;

@SpringBootApplication
public class AirtelApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirtelApplication.class, args);
		Test obj = new Test();
		obj.addProducts();
		obj.getProducts();
	}

}
