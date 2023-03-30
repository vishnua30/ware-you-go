package com.bosch.whms.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "outboundrequesitionform")
public class OutBoundRequesitionForm {
	
	@Id
	@Column(name="productname")
	private String ProductName;
	
	@Column(name="productcode")
	private int ProductCode;
	
	@Column(name="deliverylocation")
	private String DeliveryLocation;
	

	//Parameterized Constructor
	public OutBoundRequesitionForm(String ProductName,int ProductCode, String DeliveryLocation)
	{
		
		this.ProductName = ProductName;
		this.ProductCode = ProductCode;
		this.DeliveryLocation=DeliveryLocation;
	}

	//Default Constructor
	public OutBoundRequesitionForm()
	{
		super();
	}

	//Getters and Setters
	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getProductCode() {
		return ProductCode;
	}

	public void setProductCode(int productCode) {
		ProductCode = productCode;
	}

	public String getDeliveryLocation() {
		return DeliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		DeliveryLocation = deliveryLocation;
	}

	
	
    
}
