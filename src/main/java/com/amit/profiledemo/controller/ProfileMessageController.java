package com.amit.profiledemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileMessageController {
	
	
	@Value("${message}")
	private String profileMessage;
	
	
	@Value("${spring.profiles.active}")
	private String activeProfile;
	
	
	
	@GetMapping("/profile")
	public String checkProfile() {
		return "Profile message: " + profileMessage + " from active profile: " + activeProfile;
	}
	

}
