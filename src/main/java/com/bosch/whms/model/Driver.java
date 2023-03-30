package com.bosch.whms.model;

import javax.persistence.*;

@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @Column(name = "driverid")
    private int driverId;

    @Column(name = "name")
    private String name;

    @Column(name = "licensenumber")
    private String licenseNumber;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "rateperkm")
    private int ratePerkm;

    // Constructors
    public Driver() {}

    public Driver(String name, String licenseNumber, String phoneNumber, int ratePerkm) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
        this.ratePerkm = ratePerkm;
    }

    // Getters and Setters
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRatePerkm() {
        return ratePerkm;
    }

    public void setRatePerkm(int ratePerkm) {
        this.ratePerkm = ratePerkm;
    }

    // toString method
    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ratePerkm=" + ratePerkm +
                '}';
    }
}

