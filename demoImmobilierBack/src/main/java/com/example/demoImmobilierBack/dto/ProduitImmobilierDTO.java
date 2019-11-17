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

    private Integer nbr_lots;

    private Byte isParking;

    private Byte isLift;

    private Byte isGardien;  

    private Byte isCheminee; 

    private Byte isInterphone;

    private Byte isDigicode; 

    private String orientation;    

    private String dpe;

    private Integer etage; 

    private Integer nbr_piece;

    private Integer nbr_chambre;

    private Integer nbr_salle_bain;

    private Integer nbr_salle_douche;

    private Integer nbr_toilette_separe;

    private Integer nbr_toilette_non_separe;

    private Double chargesCoprop;

    private Double taxeFonciaire;

    private long dateConstruction;

    private long dateMiseEnLigne;    

    private String adresse;

    private String codePostal;

    private String ville;
    
    private String zone;

    private Double prix;

    private Double surface;

    private Double surfaceBalcon;

    private Double surfaceTerrasse;

    private Double surfaceVerandas;

    private Double surfaceSousSol;

    private Double surfaceCave;

    private Double surfaceLogias;

    private Double autreSurfaceAnnexe;
    
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

	public Integer getNbr_lots() {
		return nbr_lots;
	}

	public void setNbr_lots(Integer nbr_lots) {
		this.nbr_lots = nbr_lots;
	}

	public Byte getIsParking() {
		return isParking;
	}

	@JsonIgnore
	public void setIsParking(Boolean isParking) {
		this.isParking = (isParking == null) ? new Byte((byte)0) : new Byte(isParking?(byte)1:(byte)0);
	}

	public Byte getIsLift() {
		return isLift;
	}
	@JsonIgnore
	public void setIsLift(Boolean isLift) {
		this.isLift = (isLift == null) ? new Byte((byte)0) : new Byte(isLift?(byte)1:(byte)0);
	}

	public Byte getIsGardien() {
		return isGardien;
	}
	@JsonIgnore
	public void setIsGardien(Boolean isGardien) {
		this.isGardien = (isGardien == null) ? new Byte((byte)0) : new Byte(isGardien?(byte)1:(byte)0);
	}

	public Byte getIsCheminee() {
		return isCheminee;
	}
	@JsonIgnore
	public void setIsCheminee(Boolean isCheminee) {
		this.isCheminee = (isCheminee == null) ? new Byte((byte)0) : new Byte(isCheminee?(byte)1:(byte)0);
	}

	public Byte getIsInterphone() {
		return isInterphone;
	}
	@JsonIgnore
	public void setIsInterphone(Boolean isInterphone) {
		this.isInterphone = (isInterphone == null) ? new Byte((byte)0) : new Byte(isInterphone?(byte)1:(byte)0);
	}

	public Byte getIsDigicode() {
		return isDigicode;
	}
	@JsonIgnore
	public void setIsDigicode(Boolean isDigicode) {
		this.isDigicode = (isDigicode == null) ? new Byte((byte)0) : new Byte(isDigicode?(byte)1:(byte)0);
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

	public Integer getNbr_piece() {
		return nbr_piece;
	}

	public void setNbr_piece(Integer nbr_piece) {
		this.nbr_piece = nbr_piece;
	}

	public Integer getNbr_chambre() {
		return nbr_chambre;
	}

	public void setNbr_chambre(Integer nbr_chambre) {
		this.nbr_chambre = nbr_chambre;
	}

	public Integer getNbr_salle_bain() {
		return nbr_salle_bain;
	}

	public void setNbr_salle_bain(Integer nbr_salle_bain) {
		this.nbr_salle_bain = nbr_salle_bain;
	}

	public Integer getNbr_salle_douche() {
		return nbr_salle_douche;
	}

	public void setNbr_salle_douche(Integer nbr_salle_douche) {
		this.nbr_salle_douche = nbr_salle_douche;
	}

	public Integer getNbr_toilette_separe() {
		return nbr_toilette_separe;
	}

	public void setNbr_toilette_separe(Integer nbr_toilette_separe) {
		this.nbr_toilette_separe = nbr_toilette_separe;
	}

	public Integer getNbr_toilette_non_separe() {
		return nbr_toilette_non_separe;
	}

	public void setNbr_toilette_non_separe(Integer nbr_toilette_non_separe) {
		this.nbr_toilette_non_separe = nbr_toilette_non_separe;
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

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Double getSurface() {
		return surface;
	}

	public void setSurface(Double surface) {
		this.surface = surface;
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

	public Double getSurfaceSousSol() {
		return surfaceSousSol;
	}

	public void setSurfaceSousSol(Double surfaceSousSol) {
		this.surfaceSousSol = surfaceSousSol;
	}

	public Double getSurfaceCave() {
		return surfaceCave;
	}

	public void setSurfaceCave(Double surfaceCave) {
		this.surfaceCave = surfaceCave;
	}

	public Double getSurfaceLogias() {
		return surfaceLogias;
	}

	public void setSurfaceLogias(Double surfaceLogias) {
		this.surfaceLogias = surfaceLogias;
	}

	public Double getAutreSurfaceAnnexe() {
		return autreSurfaceAnnexe;
	}

	public void setAutreSurfaceAnnexe(Double autreSurfaceAnnexe) {
		this.autreSurfaceAnnexe = autreSurfaceAnnexe;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public void setIsParking(Byte isParking) {
		this.isParking = isParking;
	}

	public void setIsLift(Byte isLift) {
		this.isLift = isLift;
	}

	public void setIsGardien(Byte isGardien) {
		this.isGardien = isGardien;
	}

	public void setIsCheminee(Byte isCheminee) {
		this.isCheminee = isCheminee;
	}

	public void setIsInterphone(Byte isInterphone) {
		this.isInterphone = isInterphone;
	}

	public void setIsDigicode(Byte isDigicode) {
		this.isDigicode = isDigicode;
	}

	public int getCollectionSize() {
		return collectionSize;
	}

	public void setCollectionSize(int collectionSize) {
		this.collectionSize = collectionSize;
	}
	
	
	

}

