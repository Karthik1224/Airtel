package com.example.demo.controller;


import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AirtelController {
   
	private static final Logger log = (Logger) LoggerFactory.getLogger(AirtelController.class);
	@PostMapping(path = "/airtel/sms/notify")
	public ResponseEntity<?> onBoardCustomer(@RequestBody String requestBody, HttpServletRequest request )
	{
		log.info("RequestBody :{}",requestBody);
		log.info("URL :{}",request.getRequestURL());
		Dto dto = new Dto();
		dto.setName("karthik");
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
}
