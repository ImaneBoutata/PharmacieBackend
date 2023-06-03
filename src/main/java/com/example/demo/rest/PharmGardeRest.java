package com.example.demo.rest;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pharmacie_service;
import com.example.demo.service.PharmGardeService;

@RestController
@RequestMapping("/api/pharmgarde")
public class PharmGardeRest {
	
	@Autowired
	private PharmGardeService pharmGardeService;

	@PostMapping("/save")
	public Pharmacie_service save(@RequestBody Pharmacie_service p) {
		return pharmGardeService.save(p);
	}

	@GetMapping("/")
	public List<Pharmacie_service> findAll() {
		return pharmGardeService.findAll();
	}

	 @GetMapping("/findById/{id}")
	public Pharmacie_service findById(@PathVariable int id) {
		return pharmGardeService.findById(id);
	}

	 @Transactional
	 @DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		pharmGardeService.deleteById(id);
	}

	public void update(@RequestBody Pharmacie_service p) {
		pharmGardeService.update(p);
	}
	
	
	
	

}
