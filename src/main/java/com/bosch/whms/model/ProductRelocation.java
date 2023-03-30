package com.bosch.whms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
//@Table(name="ProductRelocation")
public class ProductRelocation {
	
	//@Id
	//@Column(name="productname")
	private String ProductName;
	
	//@Column(name="batchno")
	private String Batchno;
	
	//@Column(name="productcode")
	private int ProductCode;
	
	//@Column(name="purchaseorderno")
	private int PurchaseOrderno;
	
	//@Column(name="dateofpoissuance")
	private Date DateofPOIssuance;
	
	//@Column(name="productqty")
	private int ProductQty;
	
	//@Column(name="productweight")
    private double Productweight;
	
	//@Column(name="length")
	private double length;
	
	//@Column(name="breadth")
	private double breadth;
	
	//@Column(name="height")
	private double height;
	
	//@Column(name="relocationreason")
	private String RelocationReason;
	
	//@Column(name="comments")
	private String comments;
	
	//@Column(name="dateofdelivery")
	private Date DateofDelivery;
    
    public ProductRelocation(String productName, String batchno, int productcode, int purchaseorderno,Date DateofPOIssuance, int productqty, double Productweight, double lenght,double breadth,double height,
			String relocationreason, String comments, Date dateofdelivery) {
		// TODO Auto-generated constructor stub
    	this.ProductName=productName;
    	this.Batchno=batchno;
    	this.ProductCode=productcode;
    	this.PurchaseOrderno=purchaseorderno;
    	this.ProductQty=productqty;
    	this.Productweight=Productweight;
    	this.length=lenght;
    	this.breadth=breadth;
    	this.height=height;
    	this.RelocationReason=relocationreason;
    	this.comments=comments;
    	this.DateofDelivery=dateofdelivery;
	}

    public String getProductName() {
        return this.ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getBatchno() {
        return this.Batchno;
    }

    public void setBatchno(String Batchno) {
        this.Batchno = Batchno;
    }

    public int getProductCode() {
        return this.ProductCode;
    }

    public void setProductCode(int ProductCode) {
        this.ProductCode = ProductCode;
    }

    public int getPurchaseOrderno() {
        return this.PurchaseOrderno;
    }

    public void setPurchaseOrderno(int PurchaseOrderno) {
        this.PurchaseOrderno = PurchaseOrderno;
    }

    public Date getDateofPOIssuance() {
		return DateofPOIssuance;
	}

	public void setDateofPOIssuance(Date dateofPOIssuance) {
		DateofPOIssuance = dateofPOIssuance;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getProductQty() {
        return this.ProductQty;
    }

    public void setProductQty(int ProductQty) {
        this.ProductQty = ProductQty;
    }

    public double getProductWeight() {
        return this.Productweight;
    }

    public void setProductWeight(double Productweight) {
        this.Productweight = Productweight;
    }

       public String getRelocationReason() {
        return this.RelocationReason;
    }

    public void setRelocationReason(String RelocationReason) {
        this.RelocationReason = RelocationReason;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDateofDelivery() {
        return this.DateofDelivery;
    }

    public void setDateofDelivery(Date DateofDelivery) {
        this.DateofDelivery = DateofDelivery;
    }
}
