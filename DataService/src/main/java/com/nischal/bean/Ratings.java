package com.nischal.bean;

import java.util.List;



public class Ratings {

	List<User> ratings;

	public List<User> getRatings() {
		return ratings;
	}

	public void setRatings(List<User> ratings) {
		this.ratings = ratings;
	}

	public Ratings(List<User> ratings) {
		super();
		this.ratings = ratings;
	}

	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
}
