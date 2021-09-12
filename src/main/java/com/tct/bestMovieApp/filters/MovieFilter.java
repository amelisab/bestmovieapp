package com.tct.bestMovieApp.filters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.springframework.format.annotation.DateTimeFormat;

import com.tct.bestMovieApp.domain.Category;

public class MovieFilter {

	//name, imdbRate, rtRate, metascoreRate, IsMovie, country , validity, category
	
	private String name;

	private double imdbRate;

	private double metascoreRate;

	private double rtRate;

	private String country;

	private int isMovie;

	private int validity;
	
	private List<Category> categories = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getImdbRate() {
		return imdbRate;
	}

	public void setImdbRate(double imdbRate) {
		this.imdbRate = imdbRate;
	}

	public double getMetascoreRate() {
		return metascoreRate;
	}

	public void setMetascoreRate(double metascoreRate) {
		this.metascoreRate = metascoreRate;
	}

	public double getRtRate() {
		return rtRate;
	}

	public void setRtRate(double rtRate) {
		this.rtRate = rtRate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getIsMovie() {
		return isMovie;
	}

	public void setIsMovie(int isMovie) {
		this.isMovie = isMovie;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	
}
