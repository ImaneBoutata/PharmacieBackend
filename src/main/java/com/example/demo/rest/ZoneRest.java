package com.example.demo.rest;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Zone;
import com.example.demo.service.ZoneService;

@RestController

@RequestMapping("/api/zones")
public class ZoneRest {

	@Autowired
	private ZoneService zoneService;

	@PostMapping("/save")
	public Zone save(@RequestBody Zone z) {
		return zoneService.save(z);
	}
	
	@GetMapping("/findById/{id}")
	public Zone findById(@PathVariable int id) {
		return zoneService.findById(id);
	}

	@GetMapping("/")
	public List<Zone> findAll() {
		return zoneService.findAll();
	}
	

	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		zoneService.delete(id);
	}

	@GetMapping("/count")
	public long count() {
		return zoneService.count();
	}

	 @DeleteMapping("/deleteAll")
	public void deleteAll() {
		zoneService.deleteAll();
	}

	 @PutMapping("/update")
	public void update(@RequestBody Zone z) {
		zoneService.update(z);
	}
	
	
}
