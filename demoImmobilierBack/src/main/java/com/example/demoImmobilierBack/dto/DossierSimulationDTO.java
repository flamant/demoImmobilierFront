package com.example.demoImmobilierBack.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DossierSimulationDTO {

    private ProduitImmobilierDTO produitImmobilierDTO;

    private ResultatLoiPinelDTO resultatLoiPinel6DTO;

    private ResultatLoiPinelDTO resultatLoiPinel9DTO;

    private ResultatLoiPinelDTO resultatLoiPinel12DTO;

    private ResultatLmnpDto resultatLmnpReelDto;

    private ResultatLmnpDto resultatLmnpMicroDto;

    private ResultatBouvardDTO resultatBouvardDTO;

	public ProduitImmobilierDTO getProduitImmobilierDTO() {
		return produitImmobilierDTO;
	}

	public void setProduitImmobilierDTO(ProduitImmobilierDTO produitImmobilierDTO) {
		this.produitImmobilierDTO = produitImmobilierDTO;
	}

	public ResultatLoiPinelDTO getResultatLoiPinel6DTO() {
		return resultatLoiPinel6DTO;
	}

	public void setResultatLoiPinel6DTO(ResultatLoiPinelDTO resultatLoiPinel6DTO) {
		this.resultatLoiPinel6DTO = resultatLoiPinel6DTO;
	}

	public ResultatLoiPinelDTO getResultatLoiPinel9DTO() {
		return resultatLoiPinel9DTO;
	}

	public void setResultatLoiPinel9DTO(ResultatLoiPinelDTO resultatLoiPinel9DTO) {
		this.resultatLoiPinel9DTO = resultatLoiPinel9DTO;
	}

	public ResultatLoiPinelDTO getResultatLoiPinel12DTO() {
		return resultatLoiPinel12DTO;
	}

	public void setResultatLoiPinel12DTO(ResultatLoiPinelDTO resultatLoiPinel12DTO) {
		this.resultatLoiPinel12DTO = resultatLoiPinel12DTO;
	}

	public ResultatLmnpDto getResultatLmnpReelDto() {
		return resultatLmnpReelDto;
	}

	public void setResultatLmnpReelDto(ResultatLmnpDto resultatLmnpReelDto) {
		this.resultatLmnpReelDto = resultatLmnpReelDto;
	}

	public ResultatLmnpDto getResultatLmnpMicroDto() {
		return resultatLmnpMicroDto;
	}

	public void setResultatLmnpMicroDto(ResultatLmnpDto resultatLmnpMicroDto) {
		this.resultatLmnpMicroDto = resultatLmnpMicroDto;
	}

	public ResultatBouvardDTO getResultatBouvardDTO() {
		return resultatBouvardDTO;
	}

	public void setResultatBouvardDTO(ResultatBouvardDTO resultatBouvardDTO) {
		this.resultatBouvardDTO = resultatBouvardDTO;
	}
    
    

}
