package com.nischal.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Output {

	private int ratingId;
	private String userId;
	private String movieName;
	private int rating;
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Output(int ratingId, String userId, String movieName, int rating) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.movieName = movieName;
		this.rating = rating;
	}
	public Output() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Output [ratingId=" + ratingId + ", userId=" + userId + ", movieName=" + movieName + ", rating=" + rating
				+ "]";
	}
	
}
