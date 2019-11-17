package com.example.demoImmobilierBack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demoImmobilierBack.dto.DossierPinelDTO;
import com.example.demoImmobilierBack.dto.ProduitImmobilierDTO;
import com.example.demoImmobilierBack.dto.ResultatLoiPinelDTO;
import com.example.demoImmobilierBack.dto.Search;
import com.example.demoImmobilierBack.model.ProduitImmobilier;
import com.example.demoImmobilierBack.repository.ProduitImmobilierCritRepositoryCustom;
import com.example.demoImmobilierBack.repository.ProduitImmobilierRepository;

@Service
public class ProduitImmobilierServiceImpl implements ProduitImmobilierService {

    @Autowired
    private ProduitImmobilierRepository repository;

    //@Autowired
    private ProduitImmobilierCritRepositoryCustom customRepository;
    @Autowired
    public ProduitImmobilierServiceImpl(@Qualifier("search") ProduitImmobilierCritRepositoryCustom customRepository) {
    	this.customRepository = customRepository;
    }
    
    public ProduitImmobilierServiceImpl() {}

    public List<ProduitImmobilierDTO> findAll(int pageSize, int page, Search search) {
    	List<ProduitImmobilierDTO> result = new ArrayList<ProduitImmobilierDTO>();
    	List<ProduitImmobilier> listProduitImmobilier = customRepository.findBySearch(search);
    	int collectionSize = listProduitImmobilier.size();
    	if ((page-1)*pageSize < collectionSize) {
	    	for (int i = (page-1)*pageSize ; i < page*pageSize && i < collectionSize; i++) {
	    		result.add(convertProduitImmobilierToProduitImmobilierDTO(listProduitImmobilier.get(i), collectionSize));
	    	}
    	}
        return result;
    }

    public DossierPinelDTO findById(long id) {
    	ProduitImmobilier produitImmobilier = repository.findOne(id);
    	ProduitImmobilierDTO produitImmobilierDTO = convertProduitImmobilierToProduitImmobilierDTO(produitImmobilier, 1);
    	ResultatLoiPinelDTO resultatLoiPinelDTO = convertProduitImmobilierToResultatLoiPinelDTO(produitImmobilier);
    	DossierPinelDTO dossierPinelDTO = new DossierPinelDTO();
    	dossierPinelDTO.setProduitImmobilierDTO(produitImmobilierDTO);
    	dossierPinelDTO.setResultatLoiPinelDTO(resultatLoiPinelDTO);
        return dossierPinelDTO;
    }
    
    public ProduitImmobilierDTO convertProduitImmobilierToProduitImmobilierDTO(ProduitImmobilier p, int collectionSize) {
    	ProduitImmobilierDTO produitImmobilierDTO = new ProduitImmobilierDTO();
    	produitImmobilierDTO.setId(p.getId());
    	produitImmobilierDTO.setDescription(p.getDescription());
    	produitImmobilierDTO.setAdresse(p.getAdresse());
    	produitImmobilierDTO.setCodePostal(p.getCodePostal());
    	produitImmobilierDTO.setVille(p.getVille());
    	produitImmobilierDTO.setZone(p.getZone());
    	produitImmobilierDTO.setAutreSurfaceAnnexe(p.getAutreSurfaceAnnexe());
    	produitImmobilierDTO.setChargesCoprop(p.getChargesCoprop());
    	produitImmobilierDTO.setDateConstruction(p.getDateConstruction() == null ? 0 : p.getDateConstruction().getTime());
    	produitImmobilierDTO.setDateMiseEnLigne(p.getDateMiseEnLigne() == null ? 0 : p.getDateMiseEnLigne().getTime());
    	produitImmobilierDTO.setDpe(p.getDpe());
    	produitImmobilierDTO.setIsLift(p.getIsLift());
    	produitImmobilierDTO.setIsParking(p.getIsParking());
    	produitImmobilierDTO.setIsGardien(p.getIsGardien());
    	produitImmobilierDTO.setIsCheminee(p.getIsCheminee());
    	produitImmobilierDTO.setIsInterphone(p.getIsInterphone());
    	produitImmobilierDTO.setIsDigicode(p.getIsDigicode());
    	produitImmobilierDTO.setOrientation(p.getOrientation());
    	produitImmobilierDTO.setEtage(p.getEtage());
    	produitImmobilierDTO.setNbr_piece(p.getNbr_piece());
    	produitImmobilierDTO.setNbr_chambre(p.getNbr_chambre());
    	produitImmobilierDTO.setNbr_salle_bain(p.getNbr_salle_bain());
    	produitImmobilierDTO.setNbr_salle_douche(p.getNbr_salle_douche());
    	produitImmobilierDTO.setNbr_toilette_separe(p.getNbr_toilette_separe());
    	produitImmobilierDTO.setNbr_toilette_non_separe(p.getNbr_toilette_non_separe());
    	produitImmobilierDTO.setNbr_lots(p.getNbr_lots());
    	produitImmobilierDTO.setPrix(p.getPrix());
    	produitImmobilierDTO.setSurface(p.getSurface());
    	produitImmobilierDTO.setSurfaceBalcon(p.getSurfaceBalcon());
    	produitImmobilierDTO.setSurfaceCave(p.getSurfaceCave());
    	produitImmobilierDTO.setSurfaceLogias(p.getSurfaceLogias());
    	produitImmobilierDTO.setSurfaceSousSol(p.getSurfaceSousSol());
    	produitImmobilierDTO.setSurfaceTerrasse(p.getSurfaceTerrasse());
    	produitImmobilierDTO.setSurfaceVerandas(p.getSurfaceVerandas());
    	produitImmobilierDTO.setTaxeFonciaire(p.getTaxeFonciaire());
    	produitImmobilierDTO.setTelephone(p.getTelephone());
    	produitImmobilierDTO.setType(p.getType());
    	produitImmobilierDTO.setCollectionSize(collectionSize);
    	return produitImmobilierDTO;
    }
    
    private ResultatLoiPinelDTO convertProduitImmobilierToResultatLoiPinelDTO(ProduitImmobilier p) {
    	ResultatLoiPinelDTO resultatLoiPinelDTO = new ResultatLoiPinelDTO();
    	resultatLoiPinelDTO.setLoyerMaximum(p.getLoyerMaximum());
    	resultatLoiPinelDTO.setReductionImpots6ans(p.getReductionImpots6ans());
    	resultatLoiPinelDTO.setReductionImpots9ans(p.getReductionImpots9ans());
    	resultatLoiPinelDTO.setReductionImpots12ans(p.getReductionImpots12ans());
    	return resultatLoiPinelDTO;
    }
}