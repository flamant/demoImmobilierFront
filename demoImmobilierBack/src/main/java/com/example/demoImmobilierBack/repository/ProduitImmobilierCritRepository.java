package com.example.demoImmobilierBack.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoImmobilierBack.model.ProduitImmobilier;

public interface ProduitImmobilierCritRepository extends CrudRepository<ProduitImmobilier, Long>, ProduitImmobilierCritRepositoryCustom {

}
