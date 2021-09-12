package com.tct.bestMovieApp.commands;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class MovieResponse {


	private Long id;

	private String name;

	private String description;

	private String trailerLink;

	private double imdbRate;

	private double metascoreRate;

	private double rtRate;

	@Column(name = "photo_url")
	private String photoUrl;

	private Date releasedDate;

	private int runTime;

	private String country;

	private int votes;

	private int isMovie;
	
	private List<CategoryResponse> categories = new ArrayList<>();

	private List<SeasonResponse> seasons = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long long1) {
		this.id = long1;
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

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public double getImdbRate() {
		return imdbRate;
	}

	public void setImdbRate(double imdbRate) {
		this.imdbRate = imdbRate;
	}

	public double getMetascoreRate() {
		return metascoreRate;
	}

	public void setMetascoreRate(double metascoreRate) {
		this.metascoreRate = metascoreRate;
	}

	public double getRtRate() {
		return rtRate;
	}

	public void setRtRate(double rtRate) {
		this.rtRate = rtRate;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public int getIsMovie() {
		return isMovie;
	}

	public void setIsMovie(int isMovie) {
		this.isMovie = isMovie;
	}

	public List<CategoryResponse> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryResponse> categories) {
		this.categories = categories;
	}

	public List<SeasonResponse> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<SeasonResponse> seasons) {
		this.seasons = seasons;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", trailerLink=" + trailerLink
				+ ", imdbRate=" + imdbRate + ", metascoreRate=" + metascoreRate + ", rtRate=" + rtRate + ", photoUrl="
				+ photoUrl + ", releaseddDate=" + releasedDate + ", runTime=" + runTime + ", country=" + country
				+ ", votes=" + votes + ", isMovie=" + isMovie + ", status=" + "]";
	}

}
