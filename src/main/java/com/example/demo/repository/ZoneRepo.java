package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Zone;



@Repository
public interface ZoneRepo extends JpaRepository<Zone, Integer>  {

	Zone findById(int id);
	List<Zone> findAll();
	//int update(int id);

	Zone save(Zone z);
	//int deleteById(int id);
	
	List<Zone> findByVilleId(int id);
	
	Zone findByNom(String nom);
	
}
