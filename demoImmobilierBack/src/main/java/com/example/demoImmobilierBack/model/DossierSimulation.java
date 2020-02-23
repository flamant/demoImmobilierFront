package com.example.demoImmobilierBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "DOSSIER_SIMULATION")
@Entity
public class DossierSimulation {
	
    /**
     * the ID of the product.
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "LOYER_MAXIMUM_6")
    private Double loyerMaximum6;
	  
    @Column(name = "REDUCTION_IMPOTS_6")
    private Double reductionImpots6;
	  
    @Column(name = "MONTANT_EMPRUNT_6")
    private Double montantEmprunt6;
	  
    @Column(name = "ECONOMY_IMPOTS_6")
    private Double economyImpots6;
	  
    @Column(name = "MENSUALITE_CREDIT_6")
    private Double mensualiteCredit6;
	  
    @Column(name = "FRAIS_ANNEXE_6")
    private Double fraisAnnexe6;
	  
    @Column(name = "EFFORT_EPARGNE_6")
    private Double effortEpargne6;
    
    @Column(name = "LOYER_MAXIMUM_9")
    private Double loyerMaximum9;
	  
    @Column(name = "REDUCTION_IMPOTS_9")
    private Double reductionImpots9;
	  
    @Column(name = "MONTANT_EMPRUNT_9")
    private Double montantEmprunt9;
	  
    @Column(name = "ECONOMY_IMPOTS_9")
    private Double economyImpots9;
	  
    @Column(name = "MENSUALITE_CREDIT_9")
    private Double mensualiteCredit9;
	  
    @Column(name = "FRAIS_ANNEXE_9")
    private Double fraisAnnexe9;
	  
    @Column(name = "EFFORT_EPARGNE_9")
    private Double effortEpargne9; 
    
    @Column(name = "LOYER_MAXIMUM_12")
    private Double loyerMaximum12;
	  
    @Column(name = "REDUCTION_IMPOTS_12")
    private Double reductionImpots12;
	  
    @Column(name = "MONTANT_EMPRUNT_12")
    private Double montantEmprunt12;
	  
    @Column(name = "ECONOMY_IMPOTS_12")
    private Double economyImpots12;
	  
    @Column(name = "MENSUALITE_CREDIT_12")
    private Double mensualiteCredit12;
	  
    @Column(name = "FRAIS_ANNEXE_12")
    private Double fraisAnnexe12;
	  
    @Column(name = "EFFORT_EPARGNE_12")
    private Double effortEpargne12;
    
    @Column(name = "LOYER_ANNUEL_R")
    private Double loyerAnnuelR;
    
    @Column(name = "AMMORTISSEMENT_IMMOBILIER_R")
    private Double amortissementImmobilierR;
    
    @Column(name = "AMMORTISSEMENT_MOBILIER_R")
    private Double amortissementMobilierR;
    
    @Column(name = "INTERET_EMPRUNT_R")
    private Double InteretEmpruntR;
    
    @Column(name = "AUTRES_CHARGES_R")
    private Double autresChargesR;
    
    @Column(name = "ABBATEMENT_R")
    private Double abbatement50R;
    
    @Column(name = "IMPOTS_R")
    private Double impotsR;
    
    @Column(name = "TOTAL_CHARGES_R")
    private Double totalChargesR;
    
    @Column(name = "TOTAL_IMPOTS_R")
    private Double totalImpotsR;
    
    @Column(name = "RESULTAT_R")
    private Double ResultatR;
    
    @Column(name = "EFFORT_R")
    private Double effortR;
    
    @Column(name = "LOYER_ANNUEL_M")
    private Double loyerAnnuelM;
    
    @Column(name = "AMMORTISSEMENT_IMMOBILIER_M")
    private Double amortissementImmobilierM;
    
    @Column(name = "AMMORTISSEMENT_MOBILIER_M")
    private Double amortissementMobilierM;
    
    @Column(name = "INTERET_EMPRUNT_M")
    private Double InteretEmpruntM;
    
    @Column(name = "AUTRES_CHARGES_M")
    private Double autresChargesM;
    
    @Column(name = "ABBATEMENT_M")
    private Double abbatement50M;
    
    @Column(name = "IMPOTS_M")
    private Double impotsM;
    
    @Column(name = "TOTAL_CHARGES_M")
    private Double totalChargesM;
    
    @Column(name = "TOTAL_IMPOTS_M")
    private Double totalImpotsM;
    
    @Column(name = "RESULTAT_M")
    private Double ResultatM;
    
    @Column(name = "EFFORT_M")
    private Double effortM;
    
    @Column(name = "MONTANT_LOYER")
    private Double montantLoyer;
    
    @Column(name = "MONTANT_TVA_IMMOBILIER")
    private Double montantTvaImmobilier;
    
    @Column(name = "MONTANT_RECUPERE")
    private Double montantRecuperee;
    
    @Column(name = "COUT_FINAL_INVESTISSEMENT")
    private Double coutFinalInvestissement;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLoyerMaximum6() {
		return loyerMaximum6;
	}

	public void setLoyerMaximum6(Double loyerMaximum6) {
		this.loyerMaximum6 = loyerMaximum6;
	}

	public Double getReductionImpots6() {
		return reductionImpots6;
	}

	public void setReductionImpots6(Double reductionImpots6) {
		this.reductionImpots6 = reductionImpots6;
	}

	public Double getMontantEmprunt6() {
		return montantEmprunt6;
	}

	public void setMontantEmprunt6(Double montantEmprunt6) {
		this.montantEmprunt6 = montantEmprunt6;
	}

	public Double getEconomyImpots6() {
		return economyImpots6;
	}

	public void setEconomyImpots6(Double economyImpots6) {
		this.economyImpots6 = economyImpots6;
	}

	public Double getMensualiteCredit6() {
		return mensualiteCredit6;
	}

	public void setMensualiteCredit6(Double mensualiteCredit6) {
		this.mensualiteCredit6 = mensualiteCredit6;
	}

	public Double getFraisAnnexe6() {
		return fraisAnnexe6;
	}

	public void setFraisAnnexe6(Double fraisAnnexe6) {
		this.fraisAnnexe6 = fraisAnnexe6;
	}

	public Double getEffortEpargne6() {
		return effortEpargne6;
	}

	public void setEffortEpargne6(Double effortEpargne6) {
		this.effortEpargne6 = effortEpargne6;
	}

	public Double getLoyerMaximum9() {
		return loyerMaximum9;
	}

	public void setLoyerMaximum9(Double loyerMaximum9) {
		this.loyerMaximum9 = loyerMaximum9;
	}

	public Double getReductionImpots9() {
		return reductionImpots9;
	}

	public void setReductionImpots9(Double reductionImpots9) {
		this.reductionImpots9 = reductionImpots9;
	}

	public Double getMontantEmprunt9() {
		return montantEmprunt9;
	}

	public void setMontantEmprunt9(Double montantEmprunt9) {
		this.montantEmprunt9 = montantEmprunt9;
	}

	public Double getEconomyImpots9() {
		return economyImpots9;
	}

	public void setEconomyImpots9(Double economyImpots9) {
		this.economyImpots9 = economyImpots9;
	}

	public Double getMensualiteCredit9() {
		return mensualiteCredit9;
	}

	public void setMensualiteCredit9(Double mensualiteCredit9) {
		this.mensualiteCredit9 = mensualiteCredit9;
	}

	public Double getFraisAnnexe9() {
		return fraisAnnexe9;
	}

	public void setFraisAnnexe9(Double fraisAnnexe9) {
		this.fraisAnnexe9 = fraisAnnexe9;
	}

	public Double getEffortEpargne9() {
		return effortEpargne9;
	}

	public void setEffortEpargne9(Double effortEpargne9) {
		this.effortEpargne9 = effortEpargne9;
	}

	public Double getLoyerMaximum12() {
		return loyerMaximum12;
	}

	public void setLoyerMaximum12(Double loyerMaximum12) {
		this.loyerMaximum12 = loyerMaximum12;
	}

	public Double getReductionImpots12() {
		return reductionImpots12;
	}

	public void setReductionImpots12(Double reductionImpots12) {
		this.reductionImpots12 = reductionImpots12;
	}

	public Double getMontantEmprunt12() {
		return montantEmprunt12;
	}

	public void setMontantEmprunt12(Double montantEmprunt12) {
		this.montantEmprunt12 = montantEmprunt12;
	}

	public Double getEconomyImpots12() {
		return economyImpots12;
	}

	public void setEconomyImpots12(Double economyImpots12) {
		this.economyImpots12 = economyImpots12;
	}

	public Double getMensualiteCredit12() {
		return mensualiteCredit12;
	}

	public void setMensualiteCredit12(Double mensualiteCredit12) {
		this.mensualiteCredit12 = mensualiteCredit12;
	}

	public Double getFraisAnnexe12() {
		return fraisAnnexe12;
	}

	public void setFraisAnnexe12(Double fraisAnnexe12) {
		this.fraisAnnexe12 = fraisAnnexe12;
	}

	public Double getEffortEpargne12() {
		return effortEpargne12;
	}

	public void setEffortEpargne12(Double effortEpargne12) {
		this.effortEpargne12 = effortEpargne12;
	}

	public Double getLoyerAnnuelR() {
		return loyerAnnuelR;
	}

	public void setLoyerAnnuelR(Double loyerAnnuelR) {
		this.loyerAnnuelR = loyerAnnuelR;
	}

	public Double getAmortissementImmobilierR() {
		return amortissementImmobilierR;
	}

	public void setAmortissementImmobilierR(Double amortissementImmobilierR) {
		this.amortissementImmobilierR = amortissementImmobilierR;
	}

	public Double getAmortissementMobilierR() {
		return amortissementMobilierR;
	}

	public void setAmortissementMobilierR(Double amortissementMobilierR) {
		this.amortissementMobilierR = amortissementMobilierR;
	}

	public Double getInteretEmpruntR() {
		return InteretEmpruntR;
	}

	public void setInteretEmpruntR(Double interetEmpruntR) {
		InteretEmpruntR = interetEmpruntR;
	}

	public Double getAutresChargesR() {
		return autresChargesR;
	}

	public void setAutresChargesR(Double autresChargesR) {
		this.autresChargesR = autresChargesR;
	}

	public Double getAbbatement50R() {
		return abbatement50R;
	}

	public void setAbbatement50R(Double abbatement50r) {
		abbatement50R = abbatement50r;
	}

	public Double getImpotsR() {
		return impotsR;
	}

	public void setImpotsR(Double impotsR) {
		this.impotsR = impotsR;
	}

	public Double getTotalChargesR() {
		return totalChargesR;
	}

	public void setTotalChargesR(Double totalChargesR) {
		this.totalChargesR = totalChargesR;
	}

	public Double getTotalImpotsR() {
		return totalImpotsR;
	}

	public void setTotalImpotsR(Double totalImpotsR) {
		this.totalImpotsR = totalImpotsR;
	}

	public Double getResultatR() {
		return ResultatR;
	}

	public void setResultatR(Double resultatR) {
		ResultatR = resultatR;
	}

	public Double getEffortR() {
		return effortR;
	}

	public void setEffortR(Double effortR) {
		this.effortR = effortR;
	}

	public Double getLoyerAnnuelM() {
		return loyerAnnuelM;
	}

	public void setLoyerAnnuelM(Double loyerAnnuelM) {
		this.loyerAnnuelM = loyerAnnuelM;
	}

	public Double getAmortissementImmobilierM() {
		return amortissementImmobilierM;
	}

	public void setAmortissementImmobilierM(Double amortissementImmobilierM) {
		this.amortissementImmobilierM = amortissementImmobilierM;
	}

	public Double getAmortissementMobilierM() {
		return amortissementMobilierM;
	}

	public void setAmortissementMobilierM(Double amortissementMobilierM) {
		this.amortissementMobilierM = amortissementMobilierM;
	}

	public Double getInteretEmpruntM() {
		return InteretEmpruntM;
	}

	public void setInteretEmpruntM(Double interetEmpruntM) {
		InteretEmpruntM = interetEmpruntM;
	}

	public Double getAutresChargesM() {
		return autresChargesM;
	}

	public void setAutresChargesM(Double autresChargesM) {
		this.autresChargesM = autresChargesM;
	}

	public Double getAbbatement50M() {
		return abbatement50M;
	}

	public void setAbbatement50M(Double abbatement50m) {
		abbatement50M = abbatement50m;
	}

	public Double getImpotsM() {
		return impotsM;
	}

	public void setImpotsM(Double impotsM) {
		this.impotsM = impotsM;
	}

	public Double getTotalChargesM() {
		return totalChargesM;
	}

	public void setTotalChargesM(Double totalChargesM) {
		this.totalChargesM = totalChargesM;
	}

	public Double getTotalImpotsM() {
		return totalImpotsM;
	}

	public void setTotalImpotsM(Double totalImpotsM) {
		this.totalImpotsM = totalImpotsM;
	}

	public Double getResultatM() {
		return ResultatM;
	}

	public void setResultatM(Double resultatM) {
		ResultatM = resultatM;
	}

	public Double getEffortM() {
		return effortM;
	}

	public void setEffortM(Double effortM) {
		this.effortM = effortM;
	}

	public Double getMontantLoyer() {
		return montantLoyer;
	}

	public void setMontantLoyer(Double montantLoyer) {
		this.montantLoyer = montantLoyer;
	}

	public Double getMontantTvaImmobilier() {
		return montantTvaImmobilier;
	}

	public void setMontantTvaImmobilier(Double montantTvaImmobilier) {
		this.montantTvaImmobilier = montantTvaImmobilier;
	}

	public Double getMontantRecuperee() {
		return montantRecuperee;
	}

	public void setMontantRecuperee(Double montantRecuperee) {
		this.montantRecuperee = montantRecuperee;
	}

	public Double getCoutFinalInvestissement() {
		return coutFinalInvestissement;
	}

	public void setCoutFinalInvestissement(Double coutFinalInvestissement) {
		this.coutFinalInvestissement = coutFinalInvestissement;
	}
    
    

}
