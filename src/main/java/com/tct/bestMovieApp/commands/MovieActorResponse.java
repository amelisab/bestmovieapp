package com.tct.bestMovieApp.commands;

public class MovieActorResponse {

	private Long id;

	private MovieResponse movie;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MovieResponse getMovie() {
		return movie;
	}

	public void setMovie(MovieResponse movie) {
		this.movie = movie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MovieActor [id=" + id + ", movie=" + movie + ", name=" + name + "]";
	}

}
