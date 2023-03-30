package com.bosch.whms.model;
import javax.persistence.*;


@Entity
@Table(name = "truck")
public class Truck {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "truckid")
    private Integer truckId;
    
	@Column(name = "trucknumber")
    private String truckNumber;
    
    @Column(name = "maxload")
    private Integer maxLoad;
    
    // Constructors
    public Truck() {}
    
    public Truck(String truckNumber, Integer maxLoad) {
        this.truckNumber = truckNumber;
        this.maxLoad = maxLoad;
    }
    // Setter and Getters
    public Integer getTruckId() {
		return truckId;
	}

	public void setTruckId(Integer truckId) {
		this.truckId = truckId;
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public Integer getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}

   
    
}
