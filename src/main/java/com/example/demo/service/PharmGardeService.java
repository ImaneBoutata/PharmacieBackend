package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Pharmacie_service;
import com.example.demo.repository.PharmGardeRepo;

@Service
public class PharmGardeService {

	@Autowired
	private PharmGardeRepo pharmGardeRepo;

	public Pharmacie_service save(Pharmacie_service p) {
		return pharmGardeRepo.save(p);
	}

	public List<Pharmacie_service> findAll() {
		return pharmGardeRepo.findAll();
	}

	public Pharmacie_service findById(int id) {
		return pharmGardeRepo.findById(id);
	}

	public void deleteById(Integer id) {
		pharmGardeRepo.deleteById(id);
	}

	public void update(Pharmacie_service p) {
		pharmGardeRepo.save(p);
	}
	
}
