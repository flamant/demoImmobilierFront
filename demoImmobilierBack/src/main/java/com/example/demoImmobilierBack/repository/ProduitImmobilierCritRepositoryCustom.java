package com.example.demoImmobilierBack.repository;

import java.util.List;

import com.example.demoImmobilierBack.dto.Search;
import com.example.demoImmobilierBack.model.ProduitImmobilier;

public interface ProduitImmobilierCritRepositoryCustom {
	
	List<ProduitImmobilier> findBySearch(Search search);

}
