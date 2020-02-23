package com.example.demoImmobilierBack.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demoImmobilierBack.model.DossierSimulation;
import com.example.demoImmobilierBack.model.ProduitImmobilier;

public interface DossierSimulationRepository extends JpaRepository<ProduitImmobilier, Long> {
	
	@Query("select h from DossierSimulation h where h.id = ?1")
	DossierSimulation findOne(Long id);

}