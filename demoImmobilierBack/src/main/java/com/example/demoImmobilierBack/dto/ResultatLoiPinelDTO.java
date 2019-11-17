package com.example.demoImmobilierBack.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ResultatLoiPinelDTO {
    private Double loyerMaximum;
    private Double reductionImpots6ans;
    private Double reductionImpots9ans;
    private Double reductionImpots12ans;
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
    
    
}
