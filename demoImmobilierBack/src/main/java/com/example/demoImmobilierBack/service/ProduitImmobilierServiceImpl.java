package com.example.demoImmobilierBack.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demoImmobilierBack.dto.DossierSimulationDTO;
import com.example.demoImmobilierBack.dto.ProduitImmobilierDTO;
import com.example.demoImmobilierBack.dto.ResultatBouvardDTO;
import com.example.demoImmobilierBack.dto.ResultatLmnpDto;
import com.example.demoImmobilierBack.dto.ResultatLoiPinel12DTO;
import com.example.demoImmobilierBack.dto.ResultatLoiPinel6DTO;
import com.example.demoImmobilierBack.dto.ResultatLoiPinel9DTO;
import com.example.demoImmobilierBack.dto.Search;
import com.example.demoImmobilierBack.model.DBFile;
import com.example.demoImmobilierBack.model.DossierSimulation;
import com.example.demoImmobilierBack.model.ProduitImmobilier;
import com.example.demoImmobilierBack.repository.DBFileRepository;
import com.example.demoImmobilierBack.repository.DossierSimulationRepository;
import com.example.demoImmobilierBack.repository.ProduitImmobilierCritRepositoryCustom;
import com.example.demoImmobilierBack.repository.ProduitImmobilierRepository;

@Service
public class ProduitImmobilierServiceImpl implements ProduitImmobilierService {
	
    @Autowired
    private DBFileRepository dbFileRepository;

    @Autowired
    private ProduitImmobilierRepository repository;
    
    @Autowired
    private DossierSimulationRepository dossierSimulationRepository;

    //@Autowired
    private ProduitImmobilierCritRepositoryCustom customRepository;
    @Autowired
    public ProduitImmobilierServiceImpl(@Qualifier("search") ProduitImmobilierCritRepositoryCustom customRepository) {
    	this.customRepository = customRepository;
    }
    
    public ProduitImmobilierServiceImpl() {}
    
    @Override
    public void uploadFiles (DBFile[] files, Long id) {
    	ProduitImmobilier produitImmobilier = repository.findById(id).get();
    	for (DBFile dbFile : files) {
	    	dbFile.setProduitImmobilier(produitImmobilier);
	    	dbFileRepository.save(dbFile);
    	}
    }
    
    public DossierSimulationDTO findDossierSimulationById(long id) {
    	DossierSimulation dossierSimulation = dossierSimulationRepository.findOne(id);
    	ProduitImmobilier produitImmobilier = repository.findOne(id);
    	DossierSimulationDTO dossierSimulationDTO = convertDossierSimulationAndProduitImmobilierToDossierSimulationDTO(produitImmobilier, dossierSimulation);
    	return dossierSimulationDTO;
    }
    
    private DossierSimulationDTO convertDossierSimulationAndProduitImmobilierToDossierSimulationDTO(ProduitImmobilier produitImmobilier, DossierSimulation p) {
    	ProduitImmobilierDTO produitImmobilierDTO = convertProduitImmobilierToProduitImmobilierDTO(produitImmobilier, 1);
    	DossierSimulationDTO dossierSimulationDTO = new DossierSimulationDTO();
    	
    	dossierSimulationDTO.setProduitImmobilierDTO(produitImmobilierDTO);
    	
    	ResultatLoiPinel6DTO resultatLoiPinel6DTO = convertDossierSimulationToResultatLoiPinel6DTO(p);
    	dossierSimulationDTO.setResultatLoiPinel6DTO(resultatLoiPinel6DTO);
    	
    	ResultatLoiPinel9DTO resultatLoiPinel9DTO = convertDossierSimulationToResultatLoiPinel9DTO(p);
    	dossierSimulationDTO.setResultatLoiPinel9DTO(resultatLoiPinel9DTO);
    	
    	ResultatLoiPinel12DTO resultatLoiPinel12DTO = convertDossierSimulationToResultatLoiPinel12DTO(p);
    	dossierSimulationDTO.setResultatLoiPinel12DTO(resultatLoiPinel12DTO);
    	
    	ResultatLmnpDto resultatLmnpReelDto = convertDossierSimulationToResultatLmnpReelDto(p);
    	dossierSimulationDTO.setResultatLmnpReelDto(resultatLmnpReelDto);
    	
    	ResultatLmnpDto resultatLmnpMicroDto = convertDossierSimulationToResultatLmnpMicroDto(p);
    	dossierSimulationDTO.setResultatLmnpMicroDto(resultatLmnpMicroDto);
    	
    	ResultatBouvardDTO resultatBouvardDTO = convertDossierSimulationToResultatBouvardDTO(p);
    	dossierSimulationDTO.setResultatBouvardDTO(resultatBouvardDTO);
    	
    	return dossierSimulationDTO;
    }
    
    private ResultatBouvardDTO convertDossierSimulationToResultatBouvardDTO(DossierSimulation dossierSimulation) {
    	ResultatBouvardDTO resultatBouvardDTO = new ResultatBouvardDTO();
    	resultatBouvardDTO.setCoutFinalInvestissement(dossierSimulation.getCoutFinalInvestissement());
    	resultatBouvardDTO.setMontantLoyer(dossierSimulation.getMontantLoyer());
    	resultatBouvardDTO.setMontantRecuperee(dossierSimulation.getMontantRecuperee());
    	resultatBouvardDTO.setMontantTvaImmobilier(dossierSimulation.getMontantTvaImmobilier());
    	return resultatBouvardDTO;
    }	
    
    private ResultatLmnpDto convertDossierSimulationToResultatLmnpMicroDto(DossierSimulation dossierSimulation) {
    	ResultatLmnpDto resultatLmnpReelDto = new ResultatLmnpDto();
    	resultatLmnpReelDto.setAbbatement50(dossierSimulation.getAbbatement50M());
    	resultatLmnpReelDto.setAmortissementImmobilier(dossierSimulation.getAmortissementImmobilierM());
    	resultatLmnpReelDto.setAmortissementMobilier(dossierSimulation.getAmortissementMobilierM());
    	resultatLmnpReelDto.setAutresCharges(dossierSimulation.getAutresChargesM());
    	resultatLmnpReelDto.setEffort(dossierSimulation.getEffortM());
    	resultatLmnpReelDto.setImpots(dossierSimulation.getImpotsM());
    	resultatLmnpReelDto.setInteretEmprunt(dossierSimulation.getInteretEmpruntM());
    	resultatLmnpReelDto.setLoyerAnnuel(dossierSimulation.getLoyerAnnuelM());
    	resultatLmnpReelDto.setResultat(dossierSimulation.getResultatM());
    	resultatLmnpReelDto.setTotalCharges(dossierSimulation.getTotalChargesM());
    	resultatLmnpReelDto.setTotalImpots(dossierSimulation.getTotalImpotsM());
    	return resultatLmnpReelDto;
    }
    
    private ResultatLmnpDto convertDossierSimulationToResultatLmnpReelDto(DossierSimulation dossierSimulation) {
    	ResultatLmnpDto resultatLmnpReelDto = new ResultatLmnpDto();
    	resultatLmnpReelDto.setAbbatement50(dossierSimulation.getAbbatement50R());
    	resultatLmnpReelDto.setAmortissementImmobilier(dossierSimulation.getAmortissementImmobilierR());
    	resultatLmnpReelDto.setAmortissementMobilier(dossierSimulation.getAmortissementMobilierR());
    	resultatLmnpReelDto.setAutresCharges(dossierSimulation.getAutresChargesR());
    	resultatLmnpReelDto.setEffort(dossierSimulation.getEffortR());
    	resultatLmnpReelDto.setImpots(dossierSimulation.getImpotsR());
    	resultatLmnpReelDto.setInteretEmprunt(dossierSimulation.getInteretEmpruntR());
    	resultatLmnpReelDto.setLoyerAnnuel(dossierSimulation.getLoyerAnnuelR());
    	resultatLmnpReelDto.setResultat(dossierSimulation.getResultatR());
    	resultatLmnpReelDto.setTotalCharges(dossierSimulation.getTotalChargesR());
    	resultatLmnpReelDto.setTotalImpots(dossierSimulation.getTotalImpotsR());
    	return resultatLmnpReelDto;
    }
    
    private ResultatLoiPinel6DTO convertDossierSimulationToResultatLoiPinel6DTO(DossierSimulation dossierSimulation) {
    	ResultatLoiPinel6DTO resultatLoiPinel6DTO = new ResultatLoiPinel6DTO();
    	resultatLoiPinel6DTO.setEconomyImpots(dossierSimulation.getEconomyImpots6());
    	resultatLoiPinel6DTO.setEffortEpargne(dossierSimulation.getEffortEpargne6());
    	resultatLoiPinel6DTO.setFraisAnnexe(dossierSimulation.getFraisAnnexe6());
    	resultatLoiPinel6DTO.setLoyerMaximum(dossierSimulation.getLoyerMaximum6());
    	resultatLoiPinel6DTO.setMensualiteCredit(dossierSimulation.getMensualiteCredit6());
    	resultatLoiPinel6DTO.setMontantEmprunt(dossierSimulation.getMontantEmprunt6());
    	resultatLoiPinel6DTO.setReductionImpots(dossierSimulation.getReductionImpots6());
    	return resultatLoiPinel6DTO;
    }
    
    private ResultatLoiPinel9DTO convertDossierSimulationToResultatLoiPinel9DTO(DossierSimulation dossierSimulation) {
    	ResultatLoiPinel9DTO resultatLoiPinel9DTO = new ResultatLoiPinel9DTO();
    	resultatLoiPinel9DTO.setEconomyImpots(dossierSimulation.getEconomyImpots9());
    	resultatLoiPinel9DTO.setEffortEpargne(dossierSimulation.getEffortEpargne9());
    	resultatLoiPinel9DTO.setFraisAnnexe(dossierSimulation.getFraisAnnexe9());
    	resultatLoiPinel9DTO.setLoyerMaximum(dossierSimulation.getLoyerMaximum9());
    	resultatLoiPinel9DTO.setMensualiteCredit(dossierSimulation.getMensualiteCredit9());
    	resultatLoiPinel9DTO.setMontantEmprunt(dossierSimulation.getMontantEmprunt9());
    	resultatLoiPinel9DTO.setReductionImpots(dossierSimulation.getReductionImpots9());
    	return resultatLoiPinel9DTO;
    }
    
    private ResultatLoiPinel12DTO convertDossierSimulationToResultatLoiPinel12DTO(DossierSimulation dossierSimulation) {
    	ResultatLoiPinel12DTO resultatLoiPinel12DTO = new ResultatLoiPinel12DTO();
    	resultatLoiPinel12DTO.setEconomyImpots(dossierSimulation.getEconomyImpots12());
    	resultatLoiPinel12DTO.setEffortEpargne(dossierSimulation.getEffortEpargne12());
    	resultatLoiPinel12DTO.setFraisAnnexe(dossierSimulation.getFraisAnnexe12());
    	resultatLoiPinel12DTO.setLoyerMaximum(dossierSimulation.getLoyerMaximum12());
    	resultatLoiPinel12DTO.setMensualiteCredit(dossierSimulation.getMensualiteCredit12());
    	resultatLoiPinel12DTO.setMontantEmprunt(dossierSimulation.getMontantEmprunt12());
    	resultatLoiPinel12DTO.setReductionImpots(dossierSimulation.getReductionImpots12());
    	return resultatLoiPinel12DTO;
    }    

    public List<ProduitImmobilierDTO> findAll(int pageSize, int page, Search search) {
    	List<ProduitImmobilierDTO> result = new ArrayList<ProduitImmobilierDTO>();
    	List<ProduitImmobilier> listProduitImmobilier = customRepository.findBySearch(search);
    	int collectionSize = listProduitImmobilier.size();
    	if ((page-1)*pageSize < collectionSize) {
	    	for (int i = (page-1)*pageSize ; i < page*pageSize && i < collectionSize; i++) {
	    		result.add(convertProduitImmobilierToProduitImmobilierDTO(listProduitImmobilier.get(i), collectionSize));
	    	}
    	}
    	Collections.sort(result,new Comparator<ProduitImmobilierDTO>(){
            public int compare(ProduitImmobilierDTO s1,ProduitImmobilierDTO s2){
            	return s1.getId().compareTo(s2.getId());
                  // Write your logic here.
            }});
        return result;
    }
    
    public ProduitImmobilierDTO save(ProduitImmobilierDTO produitImmobilierDTO) {
    	ProduitImmobilier produitImmobilier = convertProduitImmobilierDTOToProduitImmobilier(produitImmobilierDTO);
    	produitImmobilier = repository.save(produitImmobilier);
    	return convertProduitImmobilierToProduitImmobilierDTO(produitImmobilier, 0);
    }

//    public DossierPinelDTO findById(long id) {
//    	ProduitImmobilier produitImmobilier = repository.findOne(id);
//    	ProduitImmobilierDTO produitImmobilierDTO = convertProduitImmobilierToProduitImmobilierDTO(produitImmobilier, 1);
//    	ResultatLoiPinelDTO resultatLoiPinelDTO = convertProduitImmobilierToResultatLoiPinelDTO(produitImmobilier);
//    	DossierPinelDTO dossierPinelDTO = new DossierPinelDTO();
//    	dossierPinelDTO.setProduitImmobilierDTO(produitImmobilierDTO);
//    	dossierPinelDTO.setResultatLoiPinelDTO(resultatLoiPinelDTO);
//        return dossierPinelDTO;
//    }
    
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
    	produitImmobilierDTO.setIsLift(p.getIsLift() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsParking(p.getIsParking() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsBox(p.getIsBox() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsCave(p.getIsCave() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsBalcon(p.getIsBalcon() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsTerasse(p.getIsTerasse() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsLoggia(p.getIsLoggia() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsSurfaceAnnexe(p.getIsSurfaceAnnexe() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsDuplex(p.getIsDuplex() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsTriplex(p.getIsTriplex() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsGardien(p.getIsGardien() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsCheminee(p.getIsCheminee() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsInterphone(p.getIsInterphone() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setIsDigicode(p.getIsDigicode() ? (byte)1 : (byte)0);
    	produitImmobilierDTO.setOrientation(p.getOrientation());
    	produitImmobilierDTO.setEtage(p.getEtage());
    	produitImmobilierDTO.setNbrEtage(p.getNbrEtage());
    	produitImmobilierDTO.setNbrPiece(p.getNbrPiece());
    	produitImmobilierDTO.setNbrChambre(p.getNbrChambre());
    	produitImmobilierDTO.setNbrSalleDeBain(p.getNbrSalleDeBain());
    	produitImmobilierDTO.setNbrSalleDeDouche(p.getNbrSalleDeBain());
    	produitImmobilierDTO.setNbrToiletteSepare(p.getNbrToiletteSepare());
    	produitImmobilierDTO.setNbrToiletteNonSepare(p.getNbrToiletteNonSepare());
    	produitImmobilierDTO.setNbrLots(p.getNbrLots());
    	produitImmobilierDTO.setPrix(p.getPrix());
    	produitImmobilierDTO.setSurfaceHabitable(p.getSurfaceHabitable());
    	produitImmobilierDTO.setSurfaceLoiQuarez(p.getSurfaceLoiQuarez());
    	produitImmobilierDTO.setSurfaceBalcon(p.getSurfaceBalcon());
    	produitImmobilierDTO.setSurfaceCave(p.getSurfaceCave());
    	produitImmobilierDTO.setSurfaceLoggia(p.getSurfaceLoggia());
    	produitImmobilierDTO.setSurfaceTerrasse(p.getSurfaceTerrasse());
    	produitImmobilierDTO.setSurfaceVerandas(p.getSurfaceVerandas());
    	produitImmobilierDTO.setTaxeFonciaire(p.getTaxeFonciaire());
    	produitImmobilierDTO.setTelephone(p.getTelephone());
    	produitImmobilierDTO.setType(p.getType());
    	produitImmobilierDTO.setLoyerMaximum(p.getLoyerMaximum());
    	produitImmobilierDTO.setCollectionSize(collectionSize);
    	produitImmobilierDTO.setVenteLocation(p.getVenteLocation());
    	return produitImmobilierDTO;
    }
    
    private ProduitImmobilier convertProduitImmobilierDTOToProduitImmobilier(ProduitImmobilierDTO p) {
    	ProduitImmobilier produitImmobilier = new ProduitImmobilier();
    	produitImmobilier.setId(p.getId());
    	produitImmobilier.setDescription(p.getDescription());
    	produitImmobilier.setAdresse(p.getAdresse());
    	produitImmobilier.setCodePostal(p.getCodePostal());
    	produitImmobilier.setVille(p.getVille());
    	produitImmobilier.setZone(p.getZone());
    	produitImmobilier.setAutreSurfaceAnnexe(p.getAutreSurfaceAnnexe());
    	produitImmobilier.setChargesCoprop(p.getChargesCoprop());
    	produitImmobilier.setDateConstruction(new Date(p.getDateConstruction()));
    	produitImmobilier.setDateMiseEnLigne(new Date(p.getDateMiseEnLigne()));
    	produitImmobilier.setDpe(p.getDpe());
    	produitImmobilier.setIsLift(p.getIsLift().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsParking(p.getIsParking().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsBox(p.getIsBox().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsCave(p.getIsCave().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsBalcon(p.getIsBalcon().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsTerasse(p.getIsTerasse().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsLoggia(p.getIsLoggia().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsSurfaceAnnexe(p.getIsSurfaceAnnexe().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsDuplex(p.getIsDuplex().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsTriplex(p.getIsTriplex().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsGardien(p.getIsGardien().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsCheminee(p.getIsCheminee().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsInterphone(p.getIsInterphone().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setIsDigicode(p.getIsDigicode().equals(new Byte((byte)1)) ? true : false);
    	produitImmobilier.setOrientation(p.getOrientation());
    	produitImmobilier.setEtage(p.getEtage());
    	produitImmobilier.setNbrEtage(p.getNbrEtage());
    	produitImmobilier.setNbrPiece(p.getNbrPiece());
    	produitImmobilier.setNbrChambre(p.getNbrChambre());
    	produitImmobilier.setNbrSalleDeBain(p.getNbrSalleDeBain());
    	produitImmobilier.setNbrSalleDeDouche(p.getNbrSalleDeBain());
    	produitImmobilier.setNbrToiletteSepare(p.getNbrToiletteSepare());
    	produitImmobilier.setNbrToiletteNonSepare(p.getNbrToiletteNonSepare());
    	produitImmobilier.setNbrLots(p.getNbrLots());
    	produitImmobilier.setPrix(p.getPrix());
    	produitImmobilier.setSurfaceHabitable(p.getSurfaceHabitable());
    	produitImmobilier.setSurfaceLoiQuarez(p.getSurfaceLoiQuarez());
    	produitImmobilier.setSurfaceBalcon(p.getSurfaceBalcon());
    	produitImmobilier.setSurfaceCave(p.getSurfaceCave());
    	produitImmobilier.setSurfaceLoggia(p.getSurfaceLoggia());
    	produitImmobilier.setSurfaceTerrasse(p.getSurfaceTerrasse());
    	produitImmobilier.setSurfaceVerandas(p.getSurfaceVerandas());
    	produitImmobilier.setTaxeFonciaire(p.getTaxeFonciaire());
    	produitImmobilier.setTelephone(p.getTelephone());
    	produitImmobilier.setType(p.getType());
    	produitImmobilier.setLoyerMaximum(p.getLoyerMaximum());
    	produitImmobilier.setVenteLocation(p.getVenteLocation());
    	return produitImmobilier;
    }
    
//    private ResultatLoiPinelDTO convertProduitImmobilierToResultatLoiPinelDTO(ProduitImmobilier p) {
//    	ResultatLoiPinelDTO resultatLoiPinelDTO = new ResultatLoiPinelDTO();
//    	resultatLoiPinelDTO.setLoyerMaximum(p.getLoyerMaximum());
//    	resultatLoiPinelDTO.setReductionImpots6ans(p.getReductionImpots6ans());
//    	resultatLoiPinelDTO.setReductionImpots9ans(p.getReductionImpots9ans());
//    	resultatLoiPinelDTO.setReductionImpots12ans(p.getReductionImpots12ans());
//    	return resultatLoiPinelDTO;
//    }
}