package com.tct.bestMovieApp.converters;

import com.tct.bestMovieApp.commands.QualityResponse;
import com.tct.bestMovieApp.domain.Quality;

public class QualityConverter implements Converter<QualityResponse, Quality>{

	@Override
	public QualityResponse convert(Quality e) {
		QualityResponse response = new QualityResponse();
		response.setId(e.getId());
		response.setName(e.getName());
		return response;
	}

	@Override
	public Quality reverseConvert(QualityResponse r) {
		Quality response = new Quality();
		response.setId(r.getId());
		response.setName(r.getName());
		return response;
	}
	
	

}
