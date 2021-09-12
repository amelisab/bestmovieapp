package com.tct.bestMovieApp.commands;

public class CategoryResponse {

	private Long id;

	private String name;

	private MovieResponse movie;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MovieResponse getMovie() {
		return movie;
	}

	public void setMovie(MovieResponse movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}

	public void setId(Long id) {
		this.id = id;
		
	}

	public Long getId() {
		return id;
	}

}
