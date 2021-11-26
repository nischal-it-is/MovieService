package com.nischal.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nischal.bean.Output;
import com.nischal.bean.OutputList;
import com.nischal.bean.User;
import com.nischal.service.DataService;

@RestController
public class DataServiceController {


		@Autowired
		private DataService dataService;
	
		@GetMapping(path="/moviedetails/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
		public OutputList getServices(@PathVariable("id") String userId)
		{
			return dataService.getMovie(userId);
		}
	
	
}
