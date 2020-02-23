package com.example.demoImmobilierBack.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demoImmobilierBack.dto.DossierSimulationDTO;
import com.example.demoImmobilierBack.dto.ProduitImmobilierDTO;
import com.example.demoImmobilierBack.dto.Search;
import com.example.demoImmobilierBack.model.DBFile;
import com.example.demoImmobilierBack.model.ProduitImmobilier;

public interface ProduitImmobilierService {
	public List<ProduitImmobilierDTO> findAll(int pageSize, int page, Search search);
//	public DossierPinelDTO findById(long id);
	public ProduitImmobilierDTO convertProduitImmobilierToProduitImmobilierDTO(ProduitImmobilier p, int collectionSize);
	
	public DossierSimulationDTO findDossierSimulationById(long id);
	
	public ProduitImmobilierDTO save(ProduitImmobilierDTO produitImmobilierDTO);
	
	void uploadFiles (DBFile[] files, Long id);
}
