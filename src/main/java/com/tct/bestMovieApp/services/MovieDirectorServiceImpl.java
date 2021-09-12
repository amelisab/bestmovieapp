package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.MovieDirectorResponse;
import com.tct.bestMovieApp.converters.MovieDirectorConverter;
import com.tct.bestMovieApp.domain.MovieDirector;
import com.tct.bestMovieApp.repository.MovieDirectorRepository;

@Service
public class MovieDirectorServiceImpl implements MovieDirectorService {

	
	@Autowired
	MovieDirectorRepository movieDirectorRep;
	
	MovieDirectorConverter converter = new MovieDirectorConverter();
	
	
	@Override
	public MovieDirectorResponse saveOrUpdate(MovieDirectorResponse domain) {
		return converter.convert(movieDirectorRep.update(converter.reverseConvert(domain)));
	}

	@Override
	public void delete(Long id) {
		movieDirectorRep.delete(id);
		
	}

	@Override
	public MovieDirectorResponse find(Long id) {
		return converter.convert(movieDirectorRep.find(id));
	}

	@Override
	public List<MovieDirectorResponse> listAll() {
		List<MovieDirectorResponse> responseList = new ArrayList<>();
		for (MovieDirector e : movieDirectorRep.listAll()) {
			responseList.add(converter.convert(e));
		}
		return responseList;
	}

	
}
