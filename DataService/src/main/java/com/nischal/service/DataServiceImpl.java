package com.nischal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nischal.bean.Movie;
import com.nischal.bean.Output;
import com.nischal.bean.OutputList;
import com.nischal.bean.Ratings;
import com.nischal.bean.User;

@Service
public class DataServiceImpl implements DataService {

	@Autowired
	private RestTemplate restTemplate;
	List<Output> outputList=new ArrayList<Output>();
	@Override
	public OutputList getMovie(String userId) {
		Ratings ratings=restTemplate.getForObject("http://localhost:8084/users/"+userId, Ratings.class);
		List<User> list=ratings.getRatings();
	
		for(User user:list)
		{
			String movieId=user.getMovieId();
			Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+movieId, Movie.class);
			Output output=new Output(user.getRatingId(),user.getUserId(),movie.getMovieName(),user.getRating());
			outputList.add(output);
		}
		OutputList output=new OutputList();
		output.setOutput(outputList);
		return output;
		
	}

}
