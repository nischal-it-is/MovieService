package com.nischal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nischal.bean.OutputList;

@Service
public class MovieDetailserviceImpl implements MovieDetailsService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public OutputList getMovie(String userId) {
		// TODO Auto-generated method stub
		OutputList outputList=restTemplate.getForObject("http://localhost:8083/moviedetails/"+userId, OutputList.class);
		return outputList;
	}
     
		
}


