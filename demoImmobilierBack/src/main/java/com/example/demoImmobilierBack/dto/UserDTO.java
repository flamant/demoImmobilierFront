package com.example.demoImmobilierBack.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDTO {
	
    private Long id;

    private String gender;

    private String lastName;

    private String firstName;   

    private String email;

    private String password;
    
    private String passwordConfirm;

    private String mobileTelephone;

    private String fixedTelephone;    

    private String adress;  

    private String postalCode;

    private String town;

    private String profession;

    private String profile;

    private String maritalSituation;

    private Integer childrenNumber;

    private Integer dependant;

    private String ownedOrRentedAccommodation;

    private Integer monthlyNetSalary;

    private Integer rentAmount;

    private Byte isBankLoan;

    private Integer capitalContribution;

    private Integer creditAmount;

    private Integer monthlyPayment;

    private long creditTerminationDate;

    private String SIRETNumber;
    

    List<ProduitImmobilierDTO> realEstateProperty = new ArrayList<>();
    
    
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
	
	
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
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
	public Byte getIsBankLoan() {
		return isBankLoan;
	}
	public void setIsBankLoan(Boolean isBankLoan) {
		this.isBankLoan = (isBankLoan == null) ? new Byte((byte)0) : new Byte(isBankLoan?(byte)1:(byte)0);
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
	public long getCreditTerminationDate() {
		return creditTerminationDate;
	}
	public void setCreditTerminationDate(Date creditTerminationDate) {
		this.creditTerminationDate = creditTerminationDate == null ? (long)0 : creditTerminationDate.getTime();
	}
	public String getSIRETNumber() {
		return SIRETNumber;
	}
	public void setSIRETNumber(String sIRETNumber) {
		SIRETNumber = sIRETNumber;
	}
	public List<ProduitImmobilierDTO> getRealEstateProperty() {
		return realEstateProperty;
	}
	public void setRealEstateProperty(List<ProduitImmobilierDTO> realEstateProperty) {
		this.realEstateProperty = realEstateProperty;
	}

	
	

}
