package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.MovieResponse;
import com.tct.bestMovieApp.converters.MovieConverter;
import com.tct.bestMovieApp.domain.Movie;
import com.tct.bestMovieApp.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	private MovieConverter converter = new MovieConverter();
	

	@Override
	public MovieResponse saveOrUpdate(MovieResponse domain) {
		Movie movie = movieRepository.update(converter.reverseConvert(domain));
		return converter.convert(movie);
	}

	@Override
	public void delete(Long id) {
		movieRepository.delete(id);
	}

	@Override
	public MovieResponse find(Long id) {
		Movie movie = movieRepository.find(id);
		return converter.convert(movie);
	}

	@Override
	public List<MovieResponse> listAll() {
		List<MovieResponse> list = new ArrayList<>();
		for (Movie m : movieRepository.listAll()) {
			list.add(converter.convert(m));
		}		
		return list;
	}

	
	

}
