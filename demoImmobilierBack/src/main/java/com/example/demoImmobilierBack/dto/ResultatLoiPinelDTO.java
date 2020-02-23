package com.example.demoImmobilierBack.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ResultatLoiPinelDTO {
	
    private double loyerMaximum;
    
    private double reductionImpots;
    
    private double montantEmprunt;
    
    private double economyImpots;
    
    private double mensualiteCredit;
    
    private double fraisAnnexe;
    
    private double effortEpargne;

	public double getLoyerMaximum() {
		return loyerMaximum;
	}

	public void setLoyerMaximum(double loyerMaximum) {
		this.loyerMaximum = loyerMaximum;
	}

	public double getReductionImpots() {
		return reductionImpots;
	}

	public void setReductionImpots(double reductionImpots) {
		this.reductionImpots = reductionImpots;
	}

	public double getMontantEmprunt() {
		return montantEmprunt;
	}

	public void setMontantEmprunt(double montantEmprunt) {
		this.montantEmprunt = montantEmprunt;
	}

	public double getEconomyImpots() {
		return economyImpots;
	}

	public void setEconomyImpots(double economyImpots) {
		this.economyImpots = economyImpots;
	}

	public double getMensualiteCredit() {
		return mensualiteCredit;
	}

	public void setMensualiteCredit(double mensualiteCredit) {
		this.mensualiteCredit = mensualiteCredit;
	}

	public double getFraisAnnexe() {
		return fraisAnnexe;
	}

	public void setFraisAnnexe(double fraisAnnexe) {
		this.fraisAnnexe = fraisAnnexe;
	}

	public double getEffortEpargne() {
		return effortEpargne;
	}

	public void setEffortEpargne(double effortEpargne) {
		this.effortEpargne = effortEpargne;
	}
}
