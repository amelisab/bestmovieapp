package com.tct.bestMovieApp.converters;

import com.tct.bestMovieApp.commands.MovieActorResponse;
import com.tct.bestMovieApp.domain.MovieActor;

public class MovieActorConverter implements Converter<MovieActorResponse, MovieActor>{

	private static MovieConverter movieConverter = new MovieConverter();
	
	@Override
	public MovieActorResponse convert(MovieActor e) {
		MovieActorResponse response = new MovieActorResponse();
		response.setId(e.getId());
		response.setMovie(movieConverter.convert(e.getMovie()));
		response.setName(e.getName());
		return response;
	}

	@Override
	public MovieActor reverseConvert(MovieActorResponse r) {
		MovieActor response = new MovieActor();
		response.setId(r.getId());
		response.setMovie(movieConverter.reverseConvert(r.getMovie()));
		response.setName(r.getName());
		return response;
	}
	

}
