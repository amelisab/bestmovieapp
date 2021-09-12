package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.SeasonResponse;
import com.tct.bestMovieApp.converters.SeasonConverter;
import com.tct.bestMovieApp.domain.Season;
import com.tct.bestMovieApp.repository.SeasonRepository;

@Service
public class SeasonServiceImpl implements SeasonService {

	@Autowired
	SeasonRepository seasonRepository;
	
	SeasonConverter converter = new SeasonConverter();
	
	
	@Override
	public SeasonResponse saveOrUpdate(SeasonResponse domain) {
		return converter.convert(seasonRepository.update(converter.reverseConvert(domain)));
	}

	@Override
	public void delete(Long id) {
		seasonRepository.delete(id);		
	}

	@Override
	public SeasonResponse find(Long id) {
		return converter.convert(seasonRepository.find(id));
	}

	@Override
	public List<SeasonResponse> listAll() {
		List<SeasonResponse> responseList = new ArrayList<>();
		for (Season e : seasonRepository.listAll()) {
			responseList.add(converter.convert(e));
		}
		return responseList;
	}

}
