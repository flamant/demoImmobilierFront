package com.example.demoImmobilierBack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.demoImmobilierBack.model.ProduitImmobilier;

public interface ProduitImmobilierRepository extends JpaRepository<ProduitImmobilier, Long> {
	

	@Query("select h from ProduitImmobilier h order by h.id desc")
	List<ProduitImmobilier> findAll();
	
	@Query("select h from ProduitImmobilier h where h.id = ?1")
	ProduitImmobilier findOne(Long id);

}