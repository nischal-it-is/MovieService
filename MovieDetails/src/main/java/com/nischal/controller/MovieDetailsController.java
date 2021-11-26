package com.nischal.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nischal.bean.Output;
import com.nischal.bean.OutputList;
import com.nischal.service.MovieDetailsService;


@Controller
public class MovieDetailsController {


		@Autowired
		private MovieDetailsService movieService;
	
		@RequestMapping("/")
		public ModelAndView landingController()
		{
			return new ModelAndView("landing");
		}
		@RequestMapping("/output")
		public ModelAndView getServices(@RequestParam("userId") String userId)
		{
			OutputList outputList=movieService.getMovie(userId);
			List<Output> output=outputList.getOutput();
			return new ModelAndView("show","movies",output);
		}
	
	
}
