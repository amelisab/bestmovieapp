package com.tct.bestMovieApp.converters;

import com.tct.bestMovieApp.commands.SeasonResponse;
import com.tct.bestMovieApp.domain.Season;

public class SeasonConverter implements Converter<SeasonResponse, Season> {

	private static MovieConverter movieConverter = new MovieConverter();
	
	@Override
	public SeasonResponse convert(Season e) {
		SeasonResponse response = new SeasonResponse();
		response.setDescription(e.getDescription());
		response.setId(e.getId());
		response.setMovie(movieConverter.convert(e.getMovie()));
		response.setName(e.getName());
		return response;
	}

	@Override
	public Season reverseConvert(SeasonResponse r) {
			Season response = new Season();
			response.setDescription(r.getDescription());
			response.setId(r.getId());
			response.setMovie(movieConverter.reverseConvert(r.getMovie()));
			response.setName(r.getName());
			return response;
	}

	
}
