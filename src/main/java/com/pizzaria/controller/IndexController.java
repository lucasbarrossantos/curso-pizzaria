package com.pizzaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	private static final String INDEX = "index";
	
	@GetMapping
	public String index () {
		return INDEX;
	}
	
}
