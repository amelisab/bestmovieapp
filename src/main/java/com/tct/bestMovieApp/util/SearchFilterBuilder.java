package com.tct.bestMovieApp.util;

public abstract class SearchFilterBuilder<T> {
	
	public abstract SearchFilter buildFilter(T t);

}
