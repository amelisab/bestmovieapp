package com.tct.bestMovieApp.commands;

public class LinkResponse {
	
	private Long id;

	private String url;

	private String provider;

	private int views;

	private int reportBroken;

	private int votes;
	
	private QualityResponse quality;

	private EpisodeResponse episode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getReportBroken() {
		return reportBroken;
	}

	public void setReportBroken(int reportBroken) {
		this.reportBroken = reportBroken;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public QualityResponse getQuality() {
		return quality;
	}

	public void setQuality(QualityResponse quality) {
		this.quality = quality;
	}


	public EpisodeResponse getEpisode() {
		return episode;
	}

	public void setEpisode(EpisodeResponse episode) {
		this.episode = episode;
	}

	@Override
	public String toString() {
		return "Link [id=" + id + ", url=" + url + ", provider=" + provider + ", views=" + views + ", reportBroken="
				+ reportBroken + ", votes=" + votes + ", quality=" + quality + "]";
	}

}
