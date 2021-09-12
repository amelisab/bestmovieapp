package com.tct.bestMovieApp.converters;

import com.tct.bestMovieApp.commands.CategoryResponse;
import com.tct.bestMovieApp.domain.Category;

public class CategoryConverter implements Converter<CategoryResponse, Category> {

	private static MovieConverter movieConverter = new MovieConverter();
	
	@Override
	public CategoryResponse convert(Category e) {
		CategoryResponse response = new CategoryResponse();
		response.setId(e.getId());
		//response.setMovie(movieConverter.convert(e.getMovie()));
		response.setName(e.getName());
		return response;
	}

	@Override
	public Category reverseConvert(CategoryResponse r) {
		Category response = new Category();
		response.setId(r.getId());
		//response.setMovie(movieConverter.reverseConvert(r.getMovie()));
		response.setName(r.getName());
		return response;
	}

}
