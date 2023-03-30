package com.bosch.whms.model;
import javax.persistence.*;

@Entity
@Table(name = "inledgerlocation")
public class InLedgerLocation {

    @Id
    private int id;

    @Column(name = "ledgerid")
    private int ledgerId;

    @Column(name = "locationid")
    private int locationId;

    public InLedgerLocation() {}

    public InLedgerLocation(int ledgerId, int locationId) {
        this.ledgerId = ledgerId;
        this.locationId = locationId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(int ledgerId) {
        this.ledgerId = ledgerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}

