package com.bosch.whms.model;

import java.sql.Timestamp;
import javax.persistence.*;
@Entity
@Table(name = "outledger")
public class OutLedger {
    
    @Id
    @Column(name = "ledgerid")
    private Integer ledgerId;
    
    @Column(name = "outdate")
    private Timestamp outDate;
    
    @Column(name = "productcode")
    private Integer productCode;
    
    @Column(name = "quantity")
    private Integer quantity;
    
    public OutLedger() {}
    
    public OutLedger(Integer ledgerId, Timestamp outDate, Integer productCode, Integer quantity) {
        this.ledgerId = ledgerId;
        this.outDate = outDate;
        this.productCode = productCode;
        this.quantity = quantity;
    }
    
    // getters and setters
    
    public Integer getLedgerId() {
        return ledgerId;
    }
    
    public void setLedgerId(Integer ledgerId) {
        this.ledgerId = ledgerId;
    }
    
    public Timestamp getOutDate() {
        return outDate;
    }
    
    public void setOutDate(Timestamp outDate) {
        this.outDate = outDate;
    }
    
    public Integer getProductCode() {
        return productCode;
    }
    
    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

