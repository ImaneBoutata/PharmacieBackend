package com.example.demo.service;

import java.util.List;


import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pharmacie;
import com.example.demo.repository.PharmacieRepo;
import com.example.demo.repository.ZoneRepo;


@Service
public class PharmacieService{

	@Autowired
	private PharmacieRepo pharmacieRepo;
	
	@Autowired
	private ZoneRepo zoneRepo;
	
	
/*
	public List<Pharmacie> findByVilleAndZone(Ville ville, Zone zone) {
		return pharmacieRepo.findByVilleAndZone(ville, zone);
	}*/

	public Pharmacie findById(int id) {
		return pharmacieRepo.findById(id);
	}

	/*public int update(int id) {
		return pharmacieRepo.updateById(id);
	}*/
	

	

	public Pharmacie save(Pharmacie p) {
		return pharmacieRepo.save(p);
	}

	public List<Pharmacie> findAll() {
		return pharmacieRepo.findAll();
	}

	public long count() {
		return pharmacieRepo.count();
	}

	public void delete(Pharmacie entity) {
		pharmacieRepo.delete(entity);
	}

	public void deleteAll() {
		pharmacieRepo.deleteAll();
	}
	
	public void update(Pharmacie p) {
		pharmacieRepo.save(p);
	}
	
}
