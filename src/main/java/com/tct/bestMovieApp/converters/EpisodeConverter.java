package com.tct.bestMovieApp.converters;

import java.util.ArrayList;
import java.util.List;

import com.tct.bestMovieApp.commands.EpisodeResponse;
import com.tct.bestMovieApp.commands.LinkResponse;
import com.tct.bestMovieApp.domain.Episode;
import com.tct.bestMovieApp.domain.Link;

public class EpisodeConverter implements Converter<EpisodeResponse, Episode> {

    private static LinkConverter linkConverter = new LinkConverter();
		
	@Override
	public EpisodeResponse convert(Episode e) {
		EpisodeResponse response = new EpisodeResponse();
		response.setDescription(e.getDescription());
		response.setId(e.getId());
		response.setName(e.getName());
		response.setReleaseddDate(e.getReleaseddDate());
		
		List<LinkResponse> linksResp = new ArrayList<>();
		for( Link l : e.getLinks()) {
			linksResp.add(linkConverter.convert(l));
		}
		response.setLinks(linksResp);
		return response;
	}

	@Override
	public Episode reverseConvert(EpisodeResponse r) {
		Episode response = new Episode();
		response.setDescription(r.getDescription());
		response.setId(r.getId());
		response.setName(r.getName());
		response.setReleaseddDate(r.getReleaseddDate());
		
		List<Link> links = new ArrayList<>();
		for( LinkResponse l : r.getLinks()) {
			links.add(linkConverter.reverseConvert(l));
		}
		response.setLinks(links);
		return response;
	}

}
