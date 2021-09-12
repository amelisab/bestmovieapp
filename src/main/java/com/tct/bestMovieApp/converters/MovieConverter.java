package com.tct.bestMovieApp.converters;

import java.util.ArrayList;
import java.util.List;

import com.tct.bestMovieApp.commands.MovieResponse;
import com.tct.bestMovieApp.commands.SeasonResponse;
import com.tct.bestMovieApp.commands.CategoryResponse;
import com.tct.bestMovieApp.domain.Category;
import com.tct.bestMovieApp.domain.Movie;
import com.tct.bestMovieApp.domain.Season;



public class MovieConverter implements Converter<MovieResponse, Movie> {


	private static CategoryConverter categoryConverter = new CategoryConverter();
	private static SeasonConverter seasonConverter = new SeasonConverter();
	
	
	@Override
	public MovieResponse convert(Movie e) {
		MovieResponse response = new MovieResponse();
		List<CategoryResponse> categoriesResp = new ArrayList<>();
		for (Category c : e.getCategories() ) {
			categoriesResp.add(categoryConverter.convert(c));
		}
		response.setCategories(categoriesResp);
		response.setCountry(e.getCountry());
		response.setDescription(e.getDescription());
		response.setId(e.getId());
		response.setImdbRate(e.getImdbRate());
		response.setIsMovie(e.getIsMovie());
		response.setMetascoreRate(e.getMetascoreRate());
		response.setName(e.getName());
		response.setPhotoUrl(e.getPhotoUrl());
		response.setReleasedDate(e.getReleasedDate());
		response.setRtRate(e.getRtRate());
		response.setRunTime(e.getRunTime());
		List<SeasonResponse> seasonsResp = new ArrayList<>();
		for(Season s : e.getSeasons()) {
			seasonsResp.add(seasonConverter.convert(s));
		}
		response.setSeasons(seasonsResp);
		response.setTrailerLink(e.getTrailerLink());
		response.setVotes(e.getVotes());
		
		return response;
	}

	@Override
	public Movie reverseConvert(MovieResponse r) {
		Movie response= new Movie();
		List<Category> categories = new ArrayList<>();
		for (CategoryResponse c : r.getCategories() ) {
			categories.add(categoryConverter.reverseConvert(c));
		}
		response.setCategories(categories);
		response.setCountry(r.getCountry());
		response.setDescription(r.getDescription());
		response.setId(r.getId());
		response.setImdbRate(r.getImdbRate());
		response.setIsMovie(r.getIsMovie());
		response.setMetascoreRate(r.getMetascoreRate());
		response.setName(r.getName());
		response.setPhotoUrl(r.getPhotoUrl());
		response.setReleasedDate(r.getReleasedDate());
		response.setRtRate(r.getRtRate());
		response.setRunTime(r.getRunTime());
		List<Season> seasons = new ArrayList<>();
		for(SeasonResponse s : r.getSeasons()) {
			seasons.add(seasonConverter.reverseConvert(s));
		}
		response.setSeasons(seasons);
		response.setTrailerLink(r.getTrailerLink());
		response.setVotes(r.getVotes());		
		return response;
	}

}
