package com.example.demoImmobilierBack.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
    private Integer nbrLots;
    /**
     * does it contain a parking.
     */
    @Column(name = "PARKING", columnDefinition="BIT", nullable = false)
    private Boolean isParking;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "BOX", columnDefinition="BIT", nullable = false)
    private Boolean isBox;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "CAVE", columnDefinition="BIT", nullable = false)
    private Boolean isCave;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "BALCON", columnDefinition="BIT", nullable = false)
    private Boolean isBalcon;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "TERASSE", columnDefinition="BIT", nullable = false)
    private Boolean isTerasse;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "LOGGIA", columnDefinition="BIT", nullable = false)
    private Boolean isLoggia;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "SURFACE_ANNEXE", columnDefinition="BIT", nullable = false)
    private Boolean isSurfaceAnnexe;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "DUPLEX", columnDefinition="BIT", nullable = false)
    private Boolean isDuplex;
    
    /**
     * does it contain a parking.
     */
    @Column(name = "TRIPLEX", columnDefinition="BIT", nullable = false)
    private Boolean isTriplex;
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
     * the etage.
     */
    @Column(name = "NOMBRE_ETAGE")
    private Integer nbrEtage;
    /**
     * the nbr_piece.
     */
    @Column(name = "NOMBRE_PIECE")
    private Integer nbrPiece;
    /**
     * the nbr_chambre.
     */
    @Column(name = "NOMBRE_CHAMBRE")
    private Integer nbrChambre;
    /**
     * the nbr_salle_bain.
     */
    @Column(name = "SALLE_BAIN")
    private Integer nbrSalleDeBain;
    /**
     * the nbr_salle_douche.
     */
    @Column(name = "SALLE_DOUCHE")
    private Integer nbrSalleDeDouche;
    /**
     * the nbr_toilette_separe.
     */
    @Column(name = "TOILETTE_SEPARE")
    private Integer nbrToiletteSepare;
    /**
     * the nbr_toilette_non_separe.
     */
    @Column(name = "TOILETTE_NON_SEPARE")
    private Integer nbrToiletteNonSepare;
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

    @Column(name = "SURFACE_HABITABLE")
    private Double surfaceHabitable;
    
    @Column(name = "SURFACE_LOI_QUAREZ")
    private Double surfaceLoiQuarez;

    @Column(name = "SURFACE_BALCON")
    private Double surfaceBalcon;

    @Column(name = "SURFACE_TERRASSE")
    private Double surfaceTerrasse;

    @Column(name = "SURFACE_VERANDAS")
    private Double surfaceVerandas;

    @Column(name = "SURFACE_CAVE")
    private Double surfaceCave;

    @Column(name = "SURFACE_LOGGIA")
    private Double surfaceLoggia;

    @Column(name = "AUTRE_SURFACE_ANNEXE")
    private Double autreSurfaceAnnexe;
    
    /**
     * the type of the product.
     */
    @Column(name = "LOYERMAXIMUM")
    private Double loyerMaximum;
    
    @Column(name = "SALE_RENT")
    private String venteLocation;
    
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "produitImmobilier")
    private List<DBFile> files;
    
    
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

	public Integer getNbrLots() {
		return nbrLots;
	}

	public void setNbrLots(Integer nbrLots) {
		this.nbrLots = nbrLots;
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Boolean getIsBox() {
		return isBox;
	}

	public void setIsBox(Boolean isBox) {
		this.isBox = isBox;
	}

	public Boolean getIsCave() {
		return isCave;
	}

	public void setIsCave(Boolean isCave) {
		this.isCave = isCave;
	}

	public Boolean getIsBalcon() {
		return isBalcon;
	}

	public void setIsBalcon(Boolean isBalcon) {
		this.isBalcon = isBalcon;
	}

	public Boolean getIsTerasse() {
		return isTerasse;
	}

	public void setIsTerasse(Boolean isTerasse) {
		this.isTerasse = isTerasse;
	}

	public Boolean getIsLoggia() {
		return isLoggia;
	}

	public void setIsLoggia(Boolean isLoggia) {
		this.isLoggia = isLoggia;
	}

	public Boolean getIsSurfaceAnnexe() {
		return isSurfaceAnnexe;
	}

	public void setIsSurfaceAnnexe(Boolean isSurfaceAnnexe) {
		this.isSurfaceAnnexe = isSurfaceAnnexe;
	}

	public Boolean getIsDuplex() {
		return isDuplex;
	}

	public void setIsDuplex(Boolean isDuplex) {
		this.isDuplex = isDuplex;
	}

	public Boolean getIsTriplex() {
		return isTriplex;
	}

	public void setIsTriplex(Boolean isTriplex) {
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
