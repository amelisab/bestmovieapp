package com.tct.bestMovieApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tct.bestMovieApp.domain.AppUser;
import com.tct.bestMovieApp.services.UserService;

@Controller
public class SignInController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/signin")
	public String getSignInPage() {
		return "signin";
	}
	
	@RequestMapping("/signup")
	public String getSignupPage(Model model) {
		model.addAttribute("user",new AppUser());
		return "signup";
	}

	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") AppUser user) {
		userService.register(user);
		return "redirect:/signin";
	}
	
	
	
	
	
}
