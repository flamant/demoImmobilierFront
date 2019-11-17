package com.example.demoImmobilierBack.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "USER")
@Entity
public class User {
	
    /**
     * the ID of the product.
     */
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    /**
     * male (M) or Female (F).
     */
    @Column(name = "GENDER")
    private String gender;
   
    /**
     * last name.
     */
    @Column(name = "LASTNAME")
    private String lastName;
    
    
    /**
     * first name.
     */
    @Column(name = "FIRSTNAME")
    private String firstName;   
    /**
     * email.
     */
    @Column(name = "EMAIL")
    private String email;
    /**
     * password.
     */
    @Column(name = "PASSWORD")
    private String password;
    /**
     * mobile telephone.
     */
    @Column(name = "MOBILE_TELEPHONE")
    private String mobileTelephone;
    /**
     * mobile telephone.
     */
    @Column(name = "FIXED_TELEPHONE")
    private String fixedTelephone;    
    /**
     * adress.
     */
    @Column(name = "ADRESS")
    private String adress;  
    /**
     * postal code.
     */
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    /**
     * town.
     */
    @Column(name = "TOWN")
    private String town;
    /**
     * profession.
     */
    @Column(name = "PROFESSION")
    private String profession;
    /**
     * profile.
     */
    @Column(name = "PROFILE")
    private String profile;
    /**
     * Marital Situation.
     */
    @Column(name = "MARITAL_SITUATION")
    private String maritalSituation;
    /**
     * number of children.
     */
    @Column(name = "CHILDREN_NUMBER")
    private Integer childrenNumber;
    /**
     * number of dependant.
     */
    @Column(name = "DEPENDANT")
    private Integer dependant;
    /**
     * owned or rented Accommodation.
     */
    @Column(name = "ACCOMODATION")
    private String ownedOrRentedAccommodation;
    /**
     * monthly Net Salary.
     */
    @Column(name = "MONTHLY_NET_SALARY")
    private Integer monthlyNetSalary;
    /**
     * the amount of rent if the user is tenant (locataire).
     */
    @Column(name = "RENT_AMOUNT")
    private Integer rentAmount;
    /**
     * has the user a bank loan (credit en cours).
     */
    @Column(name = "BANK_LOAN", columnDefinition="BIT", nullable = false)
    private Boolean isBankLoan;
    /**
     * the capital contribution if there is a bank loan.
     */
    @Column(name = "CAPITAL_CONTRIBUTION")
    private Integer capitalContribution;
    /**
     * the credit amount if there is a bank loan.
     */
    @Column(name = "CREDIT_AMOUNT")
    private Integer creditAmount;

    /**
     * the monthly payment if there is a bank loan.
     */
    @Column(name = "MONTHLY_PAYMENT")
    private Integer monthlyPayment;
    /**
     * the end date if there is a bank loan.
     */
    @Column(name = "CREDIT_TERMINATION_DATE")
    private Date creditTerminationDate;
    /**
     * SIRET number.
     */
    @Column(name = "SIRET_NUMBER")
    private String SIRETNumber;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "USER_PRODUIT_IMMOBILIER", 
        joinColumns = { @JoinColumn(name = "USER_ID") }, 
        inverseJoinColumns = { @JoinColumn(name = "ID") }
    )
    Set<ProduitImmobilier> realEstateProperty = new HashSet<>();
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileTelephone() {
		return mobileTelephone;
	}
	public void setMobileTelephone(String mobileTelephone) {
		this.mobileTelephone = mobileTelephone;
	}
	
	public String getFixedTelephone() {
		return fixedTelephone;
	}
	public void setFixedTelephone(String fixedTelephone) {
		this.fixedTelephone = fixedTelephone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getMaritalSituation() {
		return maritalSituation;
	}
	public void setMaritalSituation(String maritalSituation) {
		this.maritalSituation = maritalSituation;
	}
	public Integer getChildrenNumber() {
		return childrenNumber;
	}
	public void setChildrenNumber(Integer childrenNumber) {
		this.childrenNumber = childrenNumber;
	}
	public Integer getDependant() {
		return dependant;
	}
	public void setDependant(Integer dependant) {
		this.dependant = dependant;
	}
	public String getOwnedOrRentedAccommodation() {
		return ownedOrRentedAccommodation;
	}
	public void setOwnedOrRentedAccommodation(String ownedOrRentedAccommodation) {
		this.ownedOrRentedAccommodation = ownedOrRentedAccommodation;
	}
	public Integer getMonthlyNetSalary() {
		return monthlyNetSalary;
	}
	public void setMonthlyNetSalary(Integer monthlyNetSalary) {
		this.monthlyNetSalary = monthlyNetSalary;
	}
	public Integer getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(Integer rentAmount) {
		this.rentAmount = rentAmount;
	}
	public Boolean getIsBankLoan() {
		return isBankLoan;
	}
	public void setIsBankLoan(Boolean isBankLoan) {
		this.isBankLoan = isBankLoan;
	}
	public Integer getCapitalContribution() {
		return capitalContribution;
	}
	public void setCapitalContribution(Integer capitalContribution) {
		this.capitalContribution = capitalContribution;
	}
	public Integer getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(Integer creditAmount) {
		this.creditAmount = creditAmount;
	}
	public Integer getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(Integer monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public Date getCreditTerminationDate() {
		return creditTerminationDate;
	}
	public void setCreditTerminationDate(Date creditTerminationDate) {
		this.creditTerminationDate = creditTerminationDate;
	}
	public String getSIRETNumber() {
		return SIRETNumber;
	}
	public void setSIRETNumber(String sIRETNumber) {
		SIRETNumber = sIRETNumber;
	}
	public Set<ProduitImmobilier> getRealEstateProperty() {
		return realEstateProperty;
	}
	public void setRealEstateProperty(Set<ProduitImmobilier> realEstateProperty) {
		this.realEstateProperty = realEstateProperty;
	}

	
	

}
