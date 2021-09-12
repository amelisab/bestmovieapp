package com.tct.bestMovieApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tct.bestMovieApp.commands.MovieResponse;
import com.tct.bestMovieApp.filters.MovieFilter;
import com.tct.bestMovieApp.services.MovieService;

@RequestMapping("movie")
@Controller
public class MovieController {
	
	
	@Autowired 
	MovieService movieService;
	
	
	@RequestMapping("/new")
	public String save(Model model) {
		model.addAttribute("movie", new MovieResponse());
		return null;
	}
	
	@RequestMapping("/edit/{id}")
	public String update(@PathVariable Long id, Model model) {
		model.addAttribute("movie", movieService.find(id));
		return null;
	}
	
	
	@RequestMapping({"/list", "/"})
	public String listAll(MovieFilter filter, Model model) {
		model.addAttribute(movieService.listAll());
		model.addAttribute(null);
		return "movie/list";
	}
	
	@RequestMapping("/show/{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("movie", movieService.find(id));
		return "movie/show{id}";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		movieService.delete(id);
		return "redirect : /movie/list";
	}
	
	
	
	
	
}