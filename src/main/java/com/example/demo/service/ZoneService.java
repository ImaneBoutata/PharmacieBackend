package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Zone;
import com.example.demo.repository.ZoneRepo;



@Service
public class ZoneService {

	@Autowired
	private ZoneRepo zoneRepo;

	
	public Zone save(Zone z) {
		return zoneRepo.save(z);
	}
	
	public Zone findByNom(String nom) {
		return zoneRepo.findByNom(nom);
	}

	public List<Zone> findByVilleId(int id) {
		return zoneRepo.findByVilleId(id);
	}

	public Zone findById(int id) {
		return zoneRepo.findById(id);
	}

	public List<Zone> findAll() {
		return zoneRepo.findAll();
	}

	public void delete(int id) {
		zoneRepo.deleteById(id);
	}

	public void update(Zone z) {
		 zoneRepo.save(z);
	}

	

	

	public long count() {
		return zoneRepo.count();
	}

	public void deleteAll() {
		zoneRepo.deleteAll();
	}
	
	
}
