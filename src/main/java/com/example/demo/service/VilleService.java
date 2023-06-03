package com.example.demo.service;

import java.util.ArrayList;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Garde;
import com.example.demo.entity.Pharmacie;
import com.example.demo.entity.Ville;
import com.example.demo.entity.Zone;
import com.example.demo.repository.VilleRepo;


@Service
public class VilleService {

	@Autowired
	private VilleRepo villeRepo;
	
	@Autowired
	private ZoneService zoneService;
	
	@Autowired
	private PharmacieService pharmacieService;
	@Autowired
	private GardeService gardeService;
	
	

	public Ville findById(int id) {
		return villeRepo.findById(id);
	}

	public List<Ville> findAll() {
		return villeRepo.findAll();
	}

	

	public Ville save(Ville v) {
		return villeRepo.save(v);
	}

	

	public void delete(int id) {
		villeRepo.deleteById(id);
	}
	
	public void update(Ville v) {
		villeRepo.save(v);
	}
	public long count() {
		return villeRepo.count();
	}

	public void deleteAll() {
		villeRepo.deleteAll();
	}
	
	public List<Pharmacie> pharmacieByVilleAndZone(String nomVille, String nomZone) {
		Ville ville = villeRepo.findByNom(nomVille);
		Zone zone = zoneService.findByNom(nomZone);
		List<Zone> zones = ville.getZones();
		for(Zone z : zones) {
			if(z.equals(zone)) {
				return z.getPharmacies();
			}
			 
		}
		return null;
	}
	
	public List<Pharmacie> pharmacieByVilleZonePeriode(String nomVille, String nomZone, String periode){
		Ville ville = villeRepo.findByNom(nomVille);
		Zone zone = zoneService.findByNom(nomZone);
		Garde garde = gardeService.findByType(periode); 
		
		List<Zone> zones = ville.getZones();
		List<Pharmacie> pharmacies = new ArrayList<>();
		
		for(Zone z : zones) {
			if(z.equals(zone)) {
				for(Pharmacie p : z.getPharmacies()) {
					if(p.getGardes().contains(garde)) {
						pharmacies.add(p);
						
					}
				}
			}
			
		}
		return pharmacies;
	}
	
}
