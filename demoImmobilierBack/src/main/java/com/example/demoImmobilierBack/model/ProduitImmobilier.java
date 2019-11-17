package com.example.demoImmobilierBack.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Table(name = "PRODUIT_IMMOBILIER")
@Entity
public class ProduitImmobilier {

    /**
     * the ID of the product.
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    /**
     * the type of the product.
     */
    @Column(name = "TYPE1")
    private String type;
   
    /**
     * the phone number to contact.
     */
    @Column(name = "TELEPHONE")
    private String telephone;
    
    
    /**
     * the description of the product.
     */
    @Column(name = "DESCRIPTION")
    private String description;   
    /**
     * the number of lots.
     */
    @Column(name = "NOMBRE_LOTS")
    private Integer nbr_lots;
    /**
     * does it contain a parking.
     */
    @Column(name = "PARKING", columnDefinition="BIT", nullable = false)
    private Boolean isParking;
    /**
     * does it contain a lift.
     */
    @Column(name = "ASCENCEUR", columnDefinition="BIT", nullable = false)
    private Boolean isLift;
    /**
     * does it contain a Guardian.
     */
    @Column(name = "GARDIEN", columnDefinition="BIT", nullable = false)
    private Boolean isGardien;  
    /**
     * does it contain a fireplace.
     */
    @Column(name = "CHEMINEE", columnDefinition="BIT", nullable = false)
    private Boolean isCheminee; 
    /**
     * does it contain a Intercom.
     */
    @Column(name = "INTERPHONE", columnDefinition="BIT", nullable = false)
    private Boolean isInterphone;
    /**
     * does it contain a digital code.
     */
    @Column(name = "DIGICODE", columnDefinition="BIT", nullable = false)
    private Boolean isDigicode; 
    /**
     * orientation.
     */
    @Column(name = "ORIENTATION")
    private String orientation;    
    /**
     * the dpe.
     */
    @Column(name = "DPE")
    private String dpe;
    /**
     * the etage.
     */
    @Column(name = "ETAGE")
    private Integer etage; 
    /**
     * the nbr_piece.
     */
    @Column(name = "NOMBRE_PIECE")
    private Integer nbr_piece;
    /**
     * the nbr_chambre.
     */
    @Column(name = "NOMBRE_CHAMBRE")
    private Integer nbr_chambre;
    /**
     * the nbr_salle_bain.
     */
    @Column(name = "SALLE_BAIN")
    private Integer nbr_salle_bain;
    /**
     * the nbr_salle_douche.
     */
    @Column(name = "SALLE_DOUCHE")
    private Integer nbr_salle_douche;
    /**
     * the nbr_toilette_separe.
     */
    @Column(name = "TOILETTE_SEPARE")
    private Integer nbr_toilette_separe;
    /**
     * the nbr_toilette_non_separe.
     */
    @Column(name = "TOILETTE_NON_SEPARE")
    private Integer nbr_toilette_non_separe;
    /**
     * charges copropriété.
     */
    @Column(name = "CHARGES_COPROP")
    private Double chargesCoprop;
    /**
     * taxes fonciaires.
     */
    @Column(name = "TAXES_FONCIAIRES")
    private Double taxeFonciaire;
    /**
     * date de construction.
     */
    @Column(name = "ANNEE_CONSTRUCTION")
    private Date dateConstruction;
    /**
     * date de mise en ligne.
     */
    @Column(name = "DATE_MISE_EN_LIGNE")
    private Date dateMiseEnLigne;    
    /**
     * THE PRODUCT ADDRESS.
     */
    @Column(name = "ADRESSE")
    private String adresse;
    /**
     * THE Postal code.
     */
    @Column(name = "CODE_POSTAL")
    private String codePostal;
    /**
     * THE Postal code.
     */
    @Column(name = "VILLE")
    private String ville;
    /**
     * THE Zone.
     */
    @Column(name = "ZONE1")
    private String zone;
    /**
     * THE PRODUCT PRICE.
     */
    @Column(name = "PRIX")
    private Double prix;

    @Column(name = "SURFACE")
    private Double surface;

    @Column(name = "SURFACE_BALCON")
    private Double surfaceBalcon;

    @Column(name = "SURFACE_TERRASSE")
    private Double surfaceTerrasse;

    @Column(name = "SURFACE_VERANDAS")
    private Double surfaceVerandas;

    @Column(name = "SURFACE_SOUS_SOL")
    private Double surfaceSousSol;

    @Column(name = "SURFACE_CAVE")
    private Double surfaceCave;

    @Column(name = "SURFACE_LOGIAS")
    private Double surfaceLogias;

    @Column(name = "AUTRE_SURFACE_ANNEXE")
    private Double autreSurfaceAnnexe;
    
    /**
     * the type of the product.
     */
    @Column(name = "LOYERMAXIMUM")
    private Double loyerMaximum;
    
    @Column(name = "REDUCTIONIMPOTS6ANS")
    private Double reductionImpots6ans;
    
    @Column(name = "REDUCTIONIMPOTS9ANS")
    private Double reductionImpots9ans;
    
    @Column(name = "REDUCTIONIMPOTS12ANS")
    private Double reductionImpots12ans;
    
    @ManyToMany(mappedBy = "realEstateProperty")
    private Set<User> users = new HashSet<>();

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

	public Boolean getIsParking() {
		return isParking;
	}

	public void setIsParking(Boolean isParking) {
		this.isParking = isParking;
	}

	public Boolean getIsLift() {
		return isLift;
	}

	public void setIsLift(Boolean isLift) {
		this.isLift = isLift;
	}

	public Boolean getIsGardien() {
		return isGardien;
	}

	public void setIsGardien(Boolean isGardien) {
		this.isGardien = isGardien;
	}

	public Boolean getIsCheminee() {
		return isCheminee;
	}

	public void setIsCheminee(Boolean isCheminee) {
		this.isCheminee = isCheminee;
	}

	public Boolean getIsInterphone() {
		return isInterphone;
	}

	public void setIsInterphone(Boolean isInterphone) {
		this.isInterphone = isInterphone;
	}

	public Boolean getIsDigicode() {
		return isDigicode;
	}

	public void setIsDigicode(Boolean isDigicode) {
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

	public Date getDateConstruction() {
		return dateConstruction;
	}

	public void setDateConstruction(Date dateConstruction) {
		this.dateConstruction = dateConstruction;
	}

	public Date getDateMiseEnLigne() {
		return dateMiseEnLigne;
	}

	public void setDateMiseEnLigne(Date dateMiseEnLigne) {
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

	public Double getLoyerMaximum() {
		return loyerMaximum;
	}

	public void setLoyerMaximum(Double loyerMaximum) {
		this.loyerMaximum = loyerMaximum;
	}

	public Double getReductionImpots6ans() {
		return reductionImpots6ans;
	}

	public void setReductionImpots6ans(Double reductionImpots6ans) {
		this.reductionImpots6ans = reductionImpots6ans;
	}

	public Double getReductionImpots9ans() {
		return reductionImpots9ans;
	}

	public void setReductionImpots9ans(Double reductionImpots9ans) {
		this.reductionImpots9ans = reductionImpots9ans;
	}

	public Double getReductionImpots12ans() {
		return reductionImpots12ans;
	}

	public void setReductionImpots12ans(Double reductionImpots12ans) {
		this.reductionImpots12ans = reductionImpots12ans;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

    
}
