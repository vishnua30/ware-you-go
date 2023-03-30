package com.bosch.whms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inboundrequesitionform")
public class InBoundRequesitionForm {
	
	//Declaring variables
	@Id
	@Column(name="productname")
	private String ProductName;
	
	@Column(name="suppliername")
	private String SupplierName;
	
	@Column(name="supplierlocation")
	private String SupplierLocation;
	
	@Column(name="batchno")
	private String Batchno;
	
	@Column(name="productcode")
	private int ProductCode;
	
	@Column(name="purchaseorderno")
	private int PurchaseOrderno;
	
	@Column(name="productqty")
	private int ProductQty;
	
	@Column(name="length")
	private double length;
	
	@Column(name="breadth")
	private double breadth;
	
	@Column(name="height")
	private double height;
	
	@Column(name="productweight")
	private float Productweight;
	
	@Column(name="dateofissuance")
	private Date DateofPOIssuance;
	
	@Column(name="dateofdelivery")
	private Date DateofDelivery;
	

	//Parameterized Constructor
	public InBoundRequesitionForm(String ProductName, String SupplierName, String SupplierLocation,int ProductCode, String Batchno, int PurchaseOrderno, double length,double breadth,double height, float Productweight, int ProductQty, Date DateofPOIssuance, Date DateofDelivery)
	{
		//this.ledgerID=ledgerID;
		this.ProductName = ProductName;
		this.SupplierName = SupplierName;
		this.SupplierLocation = SupplierLocation;
		this.ProductCode = ProductCode;
		this.Batchno = Batchno;
		this.PurchaseOrderno = PurchaseOrderno;
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		this.Productweight = Productweight;
		this.ProductQty = ProductQty;
		this.DateofPOIssuance = DateofPOIssuance;
		this.DateofDelivery = DateofDelivery;
	}

	//Default Constructor
	public InBoundRequesitionForm()
	{
		super();
	}

	//Getters and Setters

	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		this.ProductName = productName;
	}


	public String getSupplierName() {
		return SupplierName;
	}


	public void setSupplierName(String supplierName) {
		this.SupplierName = supplierName;
	}


	public String getSupplierLocation() {
		return SupplierLocation;
	}


	public void setSupplierLocation(String supplierLocation) {
		this.SupplierLocation = supplierLocation;
	}


	public int getProductCode() {
		return ProductCode;
	}


	public void setProductCode(int productCode) {
		this.ProductCode = productCode;
	}


	public String getBatchno() {
		return Batchno;
	}


	public void setBatchno(String batchno) {
		this.Batchno = batchno;
	}


	public int getPurchaseOrderno() {
		return PurchaseOrderno;
	}


	public void setPurchaseOrderno(int purchaseOrderno) {
		this.PurchaseOrderno = purchaseOrderno;
	}

	public float getProductweight() {
		return Productweight;
	}


	public void setProductweight(float productweight) {
		this.Productweight = productweight;
	}


	public int getProductQty() {
		return ProductQty;
	}


	public void setProductQty(int productQty) {
		this.ProductQty = productQty;
	}


	public Date getDateofPOIssuance() {
		return DateofPOIssuance;
	}


	public void setDateofPOIssuance(Date dateofPOIssuance) {
		this.DateofPOIssuance = dateofPOIssuance;
	}


	public Date getDateofDelivery() {
		return DateofDelivery;
	}


	public void setDateofDelivery(Date dateofDelivery) {
		this.DateofDelivery = dateofDelivery;
	}
	public double getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}