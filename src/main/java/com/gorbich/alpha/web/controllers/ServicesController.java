package com.gorbich.alpha.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicesController {
	@RequestMapping("/services")
	public String about() {
		return "services/services";
	}
}
