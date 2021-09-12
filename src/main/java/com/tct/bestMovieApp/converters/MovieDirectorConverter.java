package com.tct.bestMovieApp.converters;

import com.tct.bestMovieApp.commands.MovieDirectorResponse;
import com.tct.bestMovieApp.domain.MovieDirector;

public class MovieDirectorConverter implements Converter<MovieDirectorResponse, MovieDirector>{

	private static MovieConverter movieConverter = new MovieConverter();
	
	@Override
	public MovieDirectorResponse convert(MovieDirector e) {
		MovieDirectorResponse response = new MovieDirectorResponse();
		response.setId(e.getId());
		response.setName(e.getName());
		response.setMovie(movieConverter.convert(e.getMovie()));
		return response;
	}

	@Override
	public MovieDirector reverseConvert(MovieDirectorResponse r) {
		MovieDirector response = new MovieDirector();
		response.setId(r.getId());
		response.setName(r.getName());
		response.setMovie(movieConverter.reverseConvert(r.getMovie()));
		return response;
	}
	

}
