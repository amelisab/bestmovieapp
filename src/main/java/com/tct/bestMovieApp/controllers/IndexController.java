package com.tct.bestMovieApp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tct.bestMovieApp.services.MovieService;

@Controller
public class IndexController {

	@Autowired
	MovieService movieService;
	
	@RequestMapping({"/", "/index"})
	public String getIndexPage(Model model) {
		model.addAttribute("movies", movieService.listAll());
		return "index";
	}
	
	@RequestMapping("/404")
	public String get404Page() {
		return "404";
	}
	
	@RequestMapping("/about")
	public String getAboutPage() {
		return "about";
	}
	
	@RequestMapping("/pricing")
	public String getPricingPage() {
		return "pricing";
	}
	
	@RequestMapping("/faq")
	public String getFaqPage() {
		return "faq";
	}


}


