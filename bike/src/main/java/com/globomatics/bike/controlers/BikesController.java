package com.globomatics.bike.controlers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;

@RestController
@RequestMapping("/api/v1/bikes")




public class BikesController {
	
	@Autowired
	private BikeRepository bikeRepository;
	
	
	public List<Bike> list(){
		return bikeRepository.findAll();
		
	}
	@PostMapping
	@ResponseStatus(HttpStatus.OK)  			//asa pot sa customizez statusul
	public void create(@RequestBody Bike bike) {
		bikeRepository.save(bike);
	}
	
	@GetMapping("/{id}")  					//ce este pasat in aceasta portiune din url path o sa fie pus in varable id
	public Bike get(@PathVariable("id") long id) {
		return bikeRepository.getOne(id);
	}
	

}
