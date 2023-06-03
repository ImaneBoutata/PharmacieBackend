package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Pharmacie_service;
import com.example.demo.repository.GardeRepo;
import com.example.demo.repository.PharmGardeRepo;

@Service
public class GardeService {

	@Autowired
	private GardeRepo gardeRepo;

	public Garde save(Garde entity) {
		return gardeRepo.save(entity);
	}

	public List<Garde> findAll() {
		return gardeRepo.findAll();
	}

	public Optional<Garde> findById(Integer id) {
		return gardeRepo.findById(id);
	}

	public void deleteAll() {
		gardeRepo.deleteAll();
	}

	public void delete(int id) {
		gardeRepo.deleteById(id);
	}

	public Garde findByType(String type) {
		return gardeRepo.findByType(type);
	}
	
	
}
