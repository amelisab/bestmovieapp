package com.tct.bestMovieApp.services;

import java.util.List;

public interface CRUDService<T> {

	T saveOrUpdate(T domain);
	
	void delete(Long id);
	
	T find(Long id);
	
	List<T> listAll();
	
	
}
