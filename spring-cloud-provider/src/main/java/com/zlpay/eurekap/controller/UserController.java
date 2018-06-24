package com.zlpay.eurekap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserController {

	@RequestMapping("/login")
	public String  login() {
		
		return "ok";
	}
}
