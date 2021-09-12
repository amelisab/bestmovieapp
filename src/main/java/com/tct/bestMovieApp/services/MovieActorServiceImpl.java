package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.MovieActorResponse;
import com.tct.bestMovieApp.converters.MovieActorConverter;
import com.tct.bestMovieApp.domain.MovieActor;
import com.tct.bestMovieApp.repository.MovieActorRepository;

@Service
public class MovieActorServiceImpl implements MovieActorService {

	@Autowired
	MovieActorRepository movieActorRep;
	
	MovieActorConverter converter = new MovieActorConverter();
	
	@Override
	public MovieActorResponse saveOrUpdate(MovieActorResponse domain) {
		return converter.convert(movieActorRep.update(converter.reverseConvert(domain)));
	}

	@Override
	public void delete(Long id) {
		movieActorRep.delete(id);		
	}

	@Override
	public MovieActorResponse find(Long id) {
		return converter.convert(movieActorRep.find(id));
	}

	@Override
	public List<MovieActorResponse> listAll() {
		List<MovieActorResponse> responseList = new ArrayList<>();
		for (MovieActor e : movieActorRep.listAll()) {
			responseList.add(converter.convert(e));
		}
		return responseList;
	}

}
