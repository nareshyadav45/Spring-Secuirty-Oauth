package com.security.oauth.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthRestController {

	@GetMapping("/")
	public String welcome() {
		return "Successfullly Implemented OAuth Security";
	}
	
	
}
