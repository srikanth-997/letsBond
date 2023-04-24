package com.lancesoft.letsbond.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/register")
public class UserRegistrationController {
	
	@PostMapping("/sendOtp")
	public ResponseEntity<Boolean> getOtp(@RequestParam String phoneNumber )
	{
		
		
		return null;
	}
	

}
