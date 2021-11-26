package com.nischal.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Movie {

	public Movie(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	private String movieId;

	private String movieName;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	
	
}
