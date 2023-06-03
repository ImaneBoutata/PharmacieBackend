package com.example.demo.rest;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Ville;
import com.example.demo.service.VilleService;



@RestController
@RequestMapping("/api/villes")
public class VilleRest {
	
	@Autowired
	private VilleService villeService;

	@GetMapping("/findById/{id}")
	public Ville findById(@PathVariable int id) {
		return villeService.findById(id);
	}

	@GetMapping("/")
	public List<Ville> findAll() {
		return villeService.findAll();
	}

	

	@PostMapping("/save")
	public Ville save(@RequestBody Ville v) {
		return villeService.save(v);
	}



	@PutMapping("/update/")
	public void update(@RequestBody Ville v) {
		villeService.save(v);
	}

	@GetMapping("/count")
	public long count() {
		return villeService.count();
	}

	@Transactional
	@DeleteMapping("/delete/all")
	public void deleteAll() {
		villeService.deleteAll();
	}


	

	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		villeService.delete(id);
	}

	@GetMapping("/{ville}/{zone}/pharmacies")
	public List<Pharmacie> pharmacieByVilleAndZone(@PathVariable String ville, @PathVariable String zone) {
		return villeService.pharmacieByVilleAndZone(ville, zone);
	}

	@GetMapping("/{ville}/{zone}/{periode}/pharmacies")
	public List<Pharmacie> pharmacieByVilleZonePeriode(@PathVariable String ville,@PathVariable String zone, @PathVariable String periode) {
		return villeService.pharmacieByVilleZonePeriode(ville, zone, periode);
	}

	
	


}
