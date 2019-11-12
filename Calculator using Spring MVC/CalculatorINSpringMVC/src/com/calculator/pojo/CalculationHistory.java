package com.calculator.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CalculationHistory {
	
	@Id
	@GeneratedValue
	int id;
	@Column(name="calculation_Data")
	String calculationData;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalculationData() {
		return calculationData;
	}
	public void setCalculationData(String calculationData) {
		this.calculationData = calculationData;
	}
	
	
}
