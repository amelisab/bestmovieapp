package com.tct.bestMovieApp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutController {
	
	@RequestMapping("/default")
	public String defaultAfterLogin(HttpServletRequest request) {
		if(request.isUserInRole("ROLE_ADMIN")) {
			return "redirect:/movie/list";
		} 
		return "redirect:/movie/index";
	}
	
}
