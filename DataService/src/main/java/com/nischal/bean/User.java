package com.nischal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class User {
	private String userId;
	private String movieId;
	private int rating;
	
	private int ratingId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userId, String movieId, int rating, int ratingId) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
		this.ratingId = ratingId;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
}
