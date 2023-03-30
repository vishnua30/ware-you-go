package com.bosch.whms.model;

import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name = "inledger")
public class InLedger {

    @Id
    @Column(name = "ledgerid")
    private int ledgerId;

    @Column(name = "indate")
    private Date inDate;

    @Column(name = "userid")
    private int userId;

    @Column(name = "productcode")
    private int productCode;

    @Column(name = "batchnumber")
    private String batchNumber;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "suppliername")
    private String supplierName;

    @Column(name = "supplierlocation")
    private String supplierLocation;

    @Column(name = "ponumber")
    private String poNumber;

    @Column(name = "podate")
    private Date poDate;

    public InLedger() {
    }

    public InLedger(int ledgerId, Date inDate, int userId, int productCode, String batchNumber, int quantity, String supplierName, String supplierLocation, String poNumber, Date poDate) {
        this.ledgerId = ledgerId;
        this.inDate = inDate;
        this.userId = userId;
        this.productCode = productCode;
        this.batchNumber = batchNumber;
        this.quantity = quantity;
        this.supplierName = supplierName;
        this.supplierLocation = supplierLocation;
        this.poNumber = poNumber;
        this.poDate = poDate;
    }

    public int getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(int ledgerId) {
        this.ledgerId = ledgerId;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierLocation() {
        return supplierLocation;
    }

    public void setSupplierLocation(String supplierLocation) {
        this.supplierLocation = supplierLocation;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }
}

