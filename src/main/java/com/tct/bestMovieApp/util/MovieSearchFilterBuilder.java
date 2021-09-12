package com.tct.bestMovieApp.util;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import com.tct.bestMovieApp.filters.MovieFilter;

public class MovieSearchFilterBuilder extends SearchFilterBuilder <MovieFilter> {

	//name, imdbRate, rtRate, metascoreRate, IsMovie, country , validity, category

	@Override
	public SearchFilter buildFilter(MovieFilter t) {
		SearchFilter type = new SearchFilter();
		Map<String, Object> filter = new LinkedHashMap<>();
		filter.put("name", t.getName());
		filter.put("imdb_rate", t.getImdbRate());
		filter.put("rt_rate", t.getRtRate());
		filter.put("metascore_rate", t.getMetascoreRate());
		filter.put("is_movie", t.getIsMovie());
		filter.put("country", t.getCountry());
		filter.put("validity", t.getValidity());
		//categoryFilter
		
		type.setParams(filter);
		return type;
	}
	

}
