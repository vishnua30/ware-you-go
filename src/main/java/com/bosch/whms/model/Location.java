package com.bosch.whms.model;
import javax.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @Column(name = "locationid")
    private int locationId;

    @Column(name = "description")
    private String description;

    @Column(name = "statuscode")
    private int statusCode;

    @Column(name = "length")
    private int length;

    @Column(name = "width")
    private int width;

    @Column(name = "height")
    private int height;

    public Location() {}

    public Location(int locationId, String description, int statusCode, int length, int width, int height) {
        this.locationId = locationId;
        this.description = description;
        this.statusCode = statusCode;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // getters and setters
    
	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

    
    
}

