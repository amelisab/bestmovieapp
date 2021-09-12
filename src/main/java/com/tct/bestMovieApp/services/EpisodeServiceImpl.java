package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.EpisodeResponse;
import com.tct.bestMovieApp.converters.EpisodeConverter;
import com.tct.bestMovieApp.domain.Episode;
import com.tct.bestMovieApp.repository.EpisodeRepository;

@Service
public class EpisodeServiceImpl implements EpisodeService {

	@Autowired
	EpisodeRepository episodeRepository;
	
	EpisodeConverter converter = new EpisodeConverter();
	
	
	
	@Override
	public EpisodeResponse saveOrUpdate(EpisodeResponse domain) {
		return converter.convert(episodeRepository.update(converter.reverseConvert(domain)));
	}

	@Override
	public void delete(Long id) {
		episodeRepository.delete(id);
		
	}

	@Override
	public EpisodeResponse find(Long id) {
		return converter.convert(episodeRepository.find(id));
	}

	@Override
	public List<EpisodeResponse> listAll() {
		List<EpisodeResponse> responseList = new ArrayList<>();
		for (Episode e : episodeRepository.listAll()) {
			responseList.add(converter.convert(e));
		}
		return responseList;
	}

}
