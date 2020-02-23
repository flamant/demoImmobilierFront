package com.example.demoImmobilierBack.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Getter
@Setter
public class ProduitImmobilierDTO {

    private Long id;

    private String type;

    private String telephone;

    private String description;   

    private Integer nbrLots;

    private Byte isParking;
    
    private Byte isBox;
    
    private Byte isCave;
    
    private Byte isBalcon;
    
    private Byte isTerasse;
    
    private Byte isLoggia;
    
    private Byte isSurfaceAnnexe;
    
    private Byte isDuplex;
    
    private Byte isTriplex;

    private Byte isLift;

    private Byte isGardien;  

    private Byte isCheminee; 

    private Byte isInterphone;

    private Byte isDigicode; 

    private String orientation;    

    private String dpe;

    private Integer etage; 
    
    private Integer nbrEtage;

    private Integer nbrPiece;

    private Integer nbrChambre;

    private Integer nbrSalleDeBain;

    private Integer nbrSalleDeDouche;

    private Integer nbrToiletteSepare;

    private Integer nbrToiletteNonSepare;

    private Double chargesCoprop;

    private Double taxeFonciaire;

    private long dateConstruction;

    private long dateMiseEnLigne;    

    private String adresse;

    private String codePostal;

    private String ville;
    
    private String zone;

    private Double prix;

    private Double surfaceHabitable;
    
    private Double surfaceLoiQuarez;

    private Double surfaceBalcon;

    private Double surfaceTerrasse;

    private Double surfaceVerandas;


    private Double surfaceCave;

    private Double surfaceLoggia;

    private Double autreSurfaceAnnexe;
    
    private Double loyerMaximum;
    
    private String venteLocation;
    
    
    private int collectionSize;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNbrLots() {
		return nbrLots;
	}

	public void setNbrLots(Integer nbrLots) {
		this.nbrLots = nbrLots;
	}

	public Byte getIsParking() {
		return isParking;
	}

	public void setIsParking(Byte isParking) {
		this.isParking = isParking;
	}

	public Byte getIsLift() {
		return isLift;
	}

	public void setIsLift(Byte isLift) {
		this.isLift = isLift;
	}

	public Byte getIsGardien() {
		return isGardien;
	}

	public void setIsGardien(Byte isGardien) {
		this.isGardien = isGardien;
	}

	public Byte getIsCheminee() {
		return isCheminee;
	}

	public void setIsCheminee(Byte isCheminee) {
		this.isCheminee = isCheminee;
	}

	public Byte getIsInterphone() {
		return isInterphone;
	}

	public void setIsInterphone(Byte isInterphone) {
		this.isInterphone = isInterphone;
	}

	public Byte getIsDigicode() {
		return isDigicode;
	}

	public void setIsDigicode(Byte isDigicode) {
		this.isDigicode = isDigicode;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getDpe() {
		return dpe;
	}

	public void setDpe(String dpe) {
		this.dpe = dpe;
	}

	public Integer getEtage() {
		return etage;
	}

	public void setEtage(Integer etage) {
		this.etage = etage;
	}

	public Integer getNbrPiece() {
		return nbrPiece;
	}

	public void setNbrPiece(Integer nbrPiece) {
		this.nbrPiece = nbrPiece;
	}

	public Integer getNbrChambre() {
		return nbrChambre;
	}

	public void setNbrChambre(Integer nbrChambre) {
		this.nbrChambre = nbrChambre;
	}

	public Integer getNbrSalleDeBain() {
		return nbrSalleDeBain;
	}

	public void setNbrSalleDeBain(Integer nbrSalleDeBain) {
		this.nbrSalleDeBain = nbrSalleDeBain;
	}

	public Integer getNbrSalleDeDouche() {
		return nbrSalleDeDouche;
	}

	public void setNbrSalleDeDouche(Integer nbrSalleDeDouche) {
		this.nbrSalleDeDouche = nbrSalleDeDouche;
	}

	public Integer getNbrToiletteSepare() {
		return nbrToiletteSepare;
	}

	public void setNbrToiletteSepare(Integer nbrToiletteSepare) {
		this.nbrToiletteSepare = nbrToiletteSepare;
	}

	public Integer getNbrToiletteNonSepare() {
		return nbrToiletteNonSepare;
	}

	public void setNbrToiletteNonSepare(Integer nbrToiletteNonSepare) {
		this.nbrToiletteNonSepare = nbrToiletteNonSepare;
	}

	public Double getChargesCoprop() {
		return chargesCoprop;
	}

	public void setChargesCoprop(Double chargesCoprop) {
		this.chargesCoprop = chargesCoprop;
	}

	public Double getTaxeFonciaire() {
		return taxeFonciaire;
	}

	public void setTaxeFonciaire(Double taxeFonciaire) {
		this.taxeFonciaire = taxeFonciaire;
	}

	public long getDateConstruction() {
		return dateConstruction;
	}

	public void setDateConstruction(long dateConstruction) {
		this.dateConstruction = dateConstruction;
	}

	public long getDateMiseEnLigne() {
		return dateMiseEnLigne;
	}

	public void setDateMiseEnLigne(long dateMiseEnLigne) {
		this.dateMiseEnLigne = dateMiseEnLigne;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Double getSurfaceBalcon() {
		return surfaceBalcon;
	}

	public void setSurfaceBalcon(Double surfaceBalcon) {
		this.surfaceBalcon = surfaceBalcon;
	}

	public Double getSurfaceTerrasse() {
		return surfaceTerrasse;
	}

	public void setSurfaceTerrasse(Double surfaceTerrasse) {
		this.surfaceTerrasse = surfaceTerrasse;
	}

	public Double getSurfaceVerandas() {
		return surfaceVerandas;
	}

	public void setSurfaceVerandas(Double surfaceVerandas) {
		this.surfaceVerandas = surfaceVerandas;
	}

	public Double getSurfaceCave() {
		return surfaceCave;
	}

	public void setSurfaceCave(Double surfaceCave) {
		this.surfaceCave = surfaceCave;
	}

	public Double getAutreSurfaceAnnexe() {
		return autreSurfaceAnnexe;
	}

	public void setAutreSurfaceAnnexe(Double autreSurfaceAnnexe) {
		this.autreSurfaceAnnexe = autreSurfaceAnnexe;
	}

	public Double getLoyerMaximum() {
		return loyerMaximum;
	}

	public void setLoyerMaximum(Double loyerMaximum) {
		this.loyerMaximum = loyerMaximum;
	}

	public int getCollectionSize() {
		return collectionSize;
	}

	public void setCollectionSize(int collectionSize) {
		this.collectionSize = collectionSize;
	}

	public Byte getIsBox() {
		return isBox;
	}

	public void setIsBox(Byte isBox) {
		this.isBox = isBox;
	}

	public Byte getIsCave() {
		return isCave;
	}

	public void setIsCave(Byte isCave) {
		this.isCave = isCave;
	}

	public Byte getIsBalcon() {
		return isBalcon;
	}

	public void setIsBalcon(Byte isBalcon) {
		this.isBalcon = isBalcon;
	}

	public Byte getIsTerasse() {
		return isTerasse;
	}

	public void setIsTerasse(Byte isTerasse) {
		this.isTerasse = isTerasse;
	}

	public Byte getIsLoggia() {
		return isLoggia;
	}

	public void setIsLoggia(Byte isLoggia) {
		this.isLoggia = isLoggia;
	}

	public Byte getIsSurfaceAnnexe() {
		return isSurfaceAnnexe;
	}

	public void setIsSurfaceAnnexe(Byte isSurfaceAnnexe) {
		this.isSurfaceAnnexe = isSurfaceAnnexe;
	}

	public Byte getIsDuplex() {
		return isDuplex;
	}

	public void setIsDuplex(Byte isDuplex) {
		this.isDuplex = isDuplex;
	}

	public Byte getIsTriplex() {
		return isTriplex;
	}

	public void setIsTriplex(Byte isTriplex) {
		this.isTriplex = isTriplex;
	}

	public Integer getNbrEtage() {
		return nbrEtage;
	}

	public void setNbrEtage(Integer nbrEtage) {
		this.nbrEtage = nbrEtage;
	}

	public Double getSurfaceHabitable() {
		return surfaceHabitable;
	}

	public void setSurfaceHabitable(Double surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	public Double getSurfaceLoiQuarez() {
		return surfaceLoiQuarez;
	}

	public void setSurfaceLoiQuarez(Double surfaceLoiQuarez) {
		this.surfaceLoiQuarez = surfaceLoiQuarez;
	}

	public Double getSurfaceLoggia() {
		return surfaceLoggia;
	}

	public void setSurfaceLoggia(Double surfaceLoggia) {
		this.surfaceLoggia = surfaceLoggia;
	}

	public String getVenteLocation() {
		return venteLocation;
	}

	public void setVenteLocation(String venteLocation) {
		this.venteLocation = venteLocation;
	}


	
	
	

}

