package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback()
	{
		return "user Service is Down At this time!!!";
	}
	
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback()
	{
		return "contact Service is Down At this time!!!";
	}

}
