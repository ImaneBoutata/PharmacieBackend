package com.example.demo.rest;

import java.util.List;


import java.util.Optional;
import java.util.function.Function;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pharmacie;
import com.example.demo.repository.PharmacieRepo;
import com.example.demo.service.PharmacieService;

@RestController
@RequestMapping("/api/pharmacies")
public class PharmacieRest {
	
	@Autowired
	private PharmacieService pharmacieService;

	
	@GetMapping("/findById/{id}")
	public Pharmacie findById(@PathVariable int id) {
		return pharmacieService.findById(id);
	}

	@GetMapping("/")
	public List<Pharmacie> findAll() {
		return pharmacieService.findAll();
	}


	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@RequestBody Pharmacie entity) {
		pharmacieService.delete(entity);
	}
	
	@Transactional
	@DeleteMapping("/delete/all")
	public void deleteAll() {
		pharmacieService.deleteAll();
	}

	@PutMapping("/update")
	public void update(@RequestBody Pharmacie p) {
		pharmacieService.update(p);
	}

	@PostMapping("/save")
	public Pharmacie save(@RequestBody Pharmacie p) {
		return pharmacieService.save(p);
	}
	
	
	/*
	@PostMapping("/save")
	public void save(@RequestBody Pharmacie pharmacie) {
		pharmacieService.save(pharmacie);
	}

	@GetMapping("/id/{id}")
	public Pharmacie findById(@PathVariable int id) {
		return pharmacieRepo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable (required = true) int id) {
		Pharmacie p = pharmacieRepo.findById(id);
		pharmacieRepo.delete(p);
	}
	
	@GetMapping("/")
	public List<Pharmacie> findAll() {
		return pharmacieRepo.findAll();
		
	}
*/
	
	
}