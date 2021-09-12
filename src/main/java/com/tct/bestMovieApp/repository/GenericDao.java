package com.tct.bestMovieApp.repository;

import java.util.List;

import com.tct.bestMovieApp.util.SearchFilter;

public interface GenericDao<T> {
	 
	void create(T data );
	
	T update(T data);
	
	T find(Object id);
	
	void delete(Object id);
	
	List<T> listAll(); 
	
	
}
