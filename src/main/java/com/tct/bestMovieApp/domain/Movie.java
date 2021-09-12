package com.tct.bestMovieApp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", insertable = false, updatable = false)
	private Long id;

	private String name;

	@Column(length = 500)
	private String description;

	@Column(name = "trailer_link")
	private String trailerLink;

	@Column(name = "imdb_rate")
	private double imdbRate;

	@Column(name = "metascore_rate")
	private double metascoreRate;

	@Column(name = "rt_rate")
	private double rtRate;

	@Column(name = "photo_url")
	private String photoUrl;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "released_date")
	private Date releasedDate;

	@Column(name = "runtime")
	private int runTime;

	private String country;

	private int votes;

	@Column(name = "is_movie")
	private int isMovie;

	private int status;

	private int validity;

	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	//cascade//orphanRemoval
	private List<Category> categories = new ArrayList<>();

	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Season> seasons = new ArrayList<>();

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

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", trailerLink=" + trailerLink
				+ ", imdbRate=" + imdbRate + ", metascoreRate=" + metascoreRate + ", rtRate=" + rtRate + ", photoUrl="
				+ photoUrl + ", releaseddDate=" + releasedDate + ", runTime=" + runTime + ", country=" + country
				+ ", votes=" + votes + ", isMovie=" + isMovie + ", status=" + status + ", validity=" + validity + "]";
	}

}
