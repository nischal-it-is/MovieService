package com.nischal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nischal.beans.Movie;
import com.nischal.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	@Override
	public Movie getMovieById(String movieId) {
		// TODO Auto-generated method stub
		return movieDao.getById(movieId);
	}

}
