package com.tct.bestMovieApp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tct.bestMovieApp.commands.LinkResponse;
import com.tct.bestMovieApp.converters.LinkConverter;
import com.tct.bestMovieApp.domain.Link;
import com.tct.bestMovieApp.repository.LinkRepository;

@Service
public class LinkServiceImpl implements LinkService {

	@Autowired
	LinkRepository linkRepository;
	
	LinkConverter converter = new LinkConverter();
	
	
	@Override
	public LinkResponse saveOrUpdate(LinkResponse domain) {
		return converter.convert(linkRepository.update(converter.reverseConvert(domain)));
	}

	@Override
	public void delete(Long id) {
		linkRepository.delete(id);
		
	}

	@Override
	public LinkResponse find(Long id) {
		// TODO Auto-generated method stub
		return converter.convert(linkRepository.find(id));
	}

	@Override
	public List<LinkResponse> listAll() {
		List<LinkResponse> responseList = new ArrayList<>();
		for (Link e : linkRepository.listAll()) {
			responseList.add(converter.convert(e));
		}
		return responseList;
	}

}
