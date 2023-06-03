package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ville;



@Repository

public interface VilleRepo extends JpaRepository<Ville, Integer>{

	Ville findById(int id);
	List<Ville> findAll();
	//int update(int id);

	Ville save(Ville v);
	//int deleteById(int id);

	Ville findByNom(String nom);
	
}
