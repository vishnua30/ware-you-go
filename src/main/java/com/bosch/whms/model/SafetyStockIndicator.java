package com.bosch.whms.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "safetystockindicator")
public class SafetyStockIndicator {
	
	@Id
	@Column(name="slno")
	 private int slno;
	
	@Column(name="minimumexpectedstock")
	 private int MinimumExpectedStock;
	
	@Column(name="thresholddefined")
	 private int ThresholdDefined;
	
	@Column(name="currentstock")
	 private int CurrentStock; 
	
	@Column(name="productcode")
	 private int ProductCode;
	
	//constructor
	 
	 public SafetyStockIndicator() {}
	 public SafetyStockIndicator(int slno, int minimumExpectedStock, int thresholdDefined, int currentStock,
				int productcode) {
			this.slno = slno;
			this.MinimumExpectedStock = minimumExpectedStock;
			this.ThresholdDefined = thresholdDefined;
			this.CurrentStock = currentStock;
			this.ProductCode = productcode;
		}
	
	//getters and setters
	public int getSlno() {
	return slno;
	}

	public void setSlno(int slno) {
	this.slno = slno;
	}

	
	public int getMinimumExpectedStock() {
	return MinimumExpectedStock;
	}

	public void setMinimumExpectedStock(int minimumExpectedStock) {
	this.MinimumExpectedStock = minimumExpectedStock;
	} 

	public int getThresholdDefined() {
	return ThresholdDefined;
	}

	public void setThresholdDefined(int thresholdDefined) {
	this.ThresholdDefined = thresholdDefined;
	}

	public int getCurrentStock() {
	return CurrentStock;
	}

	public void setCurrentStock(int currentStock) {
	this.CurrentStock = currentStock;
	}
	
	public int getProductCode() {
	return ProductCode;
	}

	public void setProducCode(int productcode) {
	this.ProductCode = productcode;
	}
}
