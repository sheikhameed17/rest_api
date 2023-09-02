package com.sheik.restapi.Day8.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sheik.restapi.Day8.model.BikeModel;
import com.sheik.restapi.Day8.service.BikeService;

@RestController
public class BikeController {
	
	@Autowired
	BikeService bser;
	@PostMapping("add")
	public BikeModel save(@RequestBody BikeModel s) {
		return bser.add(s);
	}
	@GetMapping("/year/{year}")
	public List<BikeModel> showByYear(@PathVariable int year) {
		return bser.getByYear(year);
	}
	@GetMapping("/year/name/{year}/{name}")
	public List<BikeModel> getYearandName(@PathVariable int year,@PathVariable String name){
		return bser.getByYearAndName(year, name);
	}
	@GetMapping("/name/{name}")
	public List<BikeModel> getbyname(@PathVariable String name){
		return bser.getByName(name);
	}

}