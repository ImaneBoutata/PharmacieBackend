package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Pharmacie_service {
	@EmbeddedId
	private Garde_PharmaciePK id;
	
	private LocalDate date_debut;


	private LocalDate date_fin;

	@ManyToOne
	@MapsId("pharmacie_id")
	@JoinColumn(name = "pharmacie_id")
	
	private Pharmacie pharmacie;

	public Garde_PharmaciePK getId() {
		return id;
	}

	public void setId(Garde_PharmaciePK id) {
		this.id = id;
	}

	public LocalDate getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(LocalDate date_debut) {
		this.date_debut = date_debut;
	}

	public LocalDate getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(LocalDate date_fin) {
		this.date_fin = date_fin;
	}

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}
	
	

}
