package com.tct.bestMovieApp.commands;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class EpisodeResponse {

	private Long id;

	private String name;

	private String description;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date releasedDate;

	private List<LinkResponse> links = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReleaseddDate() {
		return releasedDate;
	}

	public void setReleaseddDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}


	public List<LinkResponse> getLinks() {
		return links;
	}

	public void setLinks(List<LinkResponse> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Episode [id=" + id + ", name=" + name + ", description=" + description + ", releaseddDate="
				+ releasedDate + "]";
	}

}

