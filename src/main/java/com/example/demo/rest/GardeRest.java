package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Pharmacie_service;
import com.example.demo.service.GardeService;

@RestController
@RequestMapping("/api/gardes")
public class GardeRest {
	
	@Autowired
	private GardeService gardeService;

	@PostMapping("/save")
	public Garde save(@RequestBody Garde entity) {
		return gardeService.save(entity);
	}

	@GetMapping("/")
	public List<Garde> findAll() {
		return gardeService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<Garde> findById(@PathVariable Integer id) {
		return gardeService.findById(id);
	}

	public void deleteAll() {
		gardeService.deleteAll();
	}

	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		gardeService.delete(id);
	}
	
	
	
/*
	@PostMapping("/save")
	public Pharmacie_service save(@RequestBody Pharmacie_service p) {
		return gardeService.save(p);
	}

	@GetMapping("/")
	public List<Pharmacie_service> findAll() {
		return gardeService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Pharmacie_service findById(@PathVariable int id) {
		return gardeService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		gardeService.deleteById(id);
	}
	*/
	

}
