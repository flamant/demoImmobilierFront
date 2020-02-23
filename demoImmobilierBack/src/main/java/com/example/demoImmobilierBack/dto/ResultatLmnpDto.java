package com.example.demoImmobilierBack.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultatLmnpDto {

    private double loyerAnnuel;
    private double amortissementImmobilier;
    private double amortissementMobilier;
    private double InteretEmprunt;
    private double autresCharges;
    private double abbatement50;
    private double impots;
    private double totalCharges;
    private double totalImpots;
    private double Resultat;
    private double effort;
	public double getLoyerAnnuel() {
		return loyerAnnuel;
	}
	public void setLoyerAnnuel(double loyerAnnuel) {
		this.loyerAnnuel = loyerAnnuel;
	}
	public double getAmortissementImmobilier() {
		return amortissementImmobilier;
	}
	public void setAmortissementImmobilier(double amortissementImmobilier) {
		this.amortissementImmobilier = amortissementImmobilier;
	}
	public double getAmortissementMobilier() {
		return amortissementMobilier;
	}
	public void setAmortissementMobilier(double amortissementMobilier) {
		this.amortissementMobilier = amortissementMobilier;
	}
	public double getInteretEmprunt() {
		return InteretEmprunt;
	}
	public void setInteretEmprunt(double interetEmprunt) {
		InteretEmprunt = interetEmprunt;
	}
	public double getAutresCharges() {
		return autresCharges;
	}
	public void setAutresCharges(double autresCharges) {
		this.autresCharges = autresCharges;
	}
	public double getAbbatement50() {
		return abbatement50;
	}
	public void setAbbatement50(double abbatement50) {
		this.abbatement50 = abbatement50;
	}
	public double getImpots() {
		return impots;
	}
	public void setImpots(double impots) {
		this.impots = impots;
	}
	public double getTotalCharges() {
		return totalCharges;
	}
	public void setTotalCharges(double totalCharges) {
		this.totalCharges = totalCharges;
	}
	public double getTotalImpots() {
		return totalImpots;
	}
	public void setTotalImpots(double totalImpots) {
		this.totalImpots = totalImpots;
	}
	public double getResultat() {
		return Resultat;
	}
	public void setResultat(double resultat) {
		Resultat = resultat;
	}
	public double getEffort() {
		return effort;
	}
	public void setEffort(double effort) {
		this.effort = effort;
	}
    
    

}
