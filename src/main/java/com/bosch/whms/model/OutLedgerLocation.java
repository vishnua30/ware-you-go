package com.bosch.whms.model;
import javax.persistence.*;

@Entity
@Table(name = "outLedgerlocation")
public class OutLedgerLocation {

    @Id
    private int id;

    @Column(name = "ledgerid")
    private int outLedger;

    @Column(name = "locationid")
    private int locationId;

    // constructors
	public OutLedgerLocation(int id, int outLedger, int locationId) {
		super();
		this.id = id;
		this.outLedger = outLedger;
		this.locationId = locationId;
	}

	public OutLedgerLocation() {
		
	}


    // getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOutLedger() {
		return outLedger;
	}

	public void setOutLedger(int outLedger) {
		this.outLedger = outLedger;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
    

}
