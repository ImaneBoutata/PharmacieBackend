package com.example.demo.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Pharmacie;



@Repository
public interface PharmacieRepo extends JpaRepository<Pharmacie, Integer>{

	Pharmacie findById(int id);
	List<Pharmacie> findAll();
	//int updateById(int id);

	Pharmacie save(Pharmacie p);
	//int deleteById(int id);
	
	//List<Pharmacie> findByVilleAndZone(Ville ville, Zone zone);
	
	
}
