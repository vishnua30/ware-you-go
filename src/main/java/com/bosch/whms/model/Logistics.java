package com.bosch.whms.model;

import java.sql.Timestamp;
import javax.persistence.*;
@Entity
@Table(name = "logistics")
public class Logistics {

    @Id
    @Column(name = "requestid")
    private int requestId;

    @Column(name = "productcode")
    private int productCode;

    @Column(name = "quantity")
    private int quantity;

    //@ManyToOne
    @Column(name = "truckid")
    private int truck;

    //@ManyToOne
    @Column(name = "driverid")
    private int driver;

    @Column(name = "deliverydate")
    private Timestamp deliveryDate;

    @Column(name = "deliverylocation")
    private String deliveryLocation;

    public Logistics() {}

    public Logistics(int requestId, int productCode, int quantity, int truck, int driver, Timestamp deliveryDate, String deliveryLocation) {
        this.requestId = requestId;
        this.productCode = productCode;
        this.quantity = quantity;
        this.truck = truck;
        this.driver = driver;
        this.deliveryDate = deliveryDate;
        this.deliveryLocation = deliveryLocation;
    }

    // getters and setters

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTruck() {
        return truck;
    }

    public void setTruck(int truck) {
        this.truck = truck;
    }

    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
}

