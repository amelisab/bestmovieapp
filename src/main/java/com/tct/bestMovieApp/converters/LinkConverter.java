package com.tct.bestMovieApp.converters;

import com.tct.bestMovieApp.commands.LinkResponse;
import com.tct.bestMovieApp.domain.Link;

public class LinkConverter implements Converter<LinkResponse, Link>{

	private static QualityConverter qualityConverter = new QualityConverter();
	private static EpisodeConverter episodeConverter = new EpisodeConverter();
	
	@Override
	public LinkResponse convert(Link e) {
		LinkResponse response = new LinkResponse();
		response.setEpisode(episodeConverter.convert(e.getEpisode()));
		response.setId(e.getId());
		response.setProvider(e.getProvider());
		response.setQuality(qualityConverter.convert(e.getQuality()));
		response.setReportBroken(e.getReportBroken());
		response.setUrl(e.getUrl());
		response.setViews(e.getViews());
		response.setVotes(e.getVotes());
		return response;
	}

	@Override
	public Link reverseConvert(LinkResponse r) {
		Link response = new Link();
		response.setEpisode(episodeConverter.reverseConvert(r.getEpisode()));
		response.setId(r.getId());
		response.setProvider(r.getProvider());
		response.setQuality(qualityConverter.reverseConvert(r.getQuality()));
		response.setReportBroken(r.getReportBroken());
		response.setUrl(r.getUrl());
		response.setViews(r.getViews());
		response.setVotes(r.getVotes());
		return response;
	}

}
