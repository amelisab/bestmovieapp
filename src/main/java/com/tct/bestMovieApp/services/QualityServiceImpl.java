package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.QualityResponse;
import com.tct.bestMovieApp.converters.QualityConverter;
import com.tct.bestMovieApp.domain.Quality;
import com.tct.bestMovieApp.repository.QualityRepository;

@Service
public class QualityServiceImpl implements QualityService {

	
	@Autowired
	QualityRepository qualityRepository;
	
	QualityConverter converter = new QualityConverter();
	
	
	@Override
	public QualityResponse saveOrUpdate(QualityResponse domain) {
		return converter.convert(qualityRepository.update(converter.reverseConvert(domain)));
	}

	@Override
	public void delete(Long id) {
		qualityRepository.delete(id);
	}

	@Override
	public QualityResponse find(Long id) {
		return converter.convert(qualityRepository.find(id));
	}

	@Override
	public List<QualityResponse> listAll() {
		List<QualityResponse> responseList = new ArrayList<>();
		for (Quality e : qualityRepository.listAll()) {
			responseList.add(converter.convert(e));
		}
		return responseList;
	}

}
