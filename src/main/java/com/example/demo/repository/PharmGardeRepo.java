package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Pharmacie_service;

@Repository

public interface PharmGardeRepo extends JpaRepository<Pharmacie_service, Integer>{

	//Garde findById(int id);
	//Garde findByType(String type);
	Pharmacie_service save(Pharmacie_service p);
	List<Pharmacie_service> findAll();
	Pharmacie_service findById(int id);
	
	
	
	
}
