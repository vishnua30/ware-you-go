package com.bosch.whms.model;

public class LocationAnalyzer
{
    private int rack,lane,shelf;
    private Product product;
    private Location location;
    private int length, height, width;
 
    public LocationAnalyzer() {}
    public LocationAnalyzer(int rack,int lane,int shelf,Product product,Location location,int length,int height,int width) {
		 
   	this.rack = rack;
   	this.lane = lane;
   	this.shelf = shelf;
   	this.product = product;
   	this.location = location;
   	this.length = length;
   	this.width = width;
   	this.height = height;
   }
    
    public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
    public int getRack()
    {
        return rack;
    }
    public int getLane()
    {
        return lane;
    }
    public int getShelf()
    {
        return shelf;
    }
 
    public Product getProduct()
    {
        return product;
    }
    public Location getLocation()
    {
        return location;
    }
 
    public void setShelf(int shelf)
    {
        this.shelf=shelf;
    }
    public void setLane(int lane)
    {
        this.lane=lane;
    }
    public void setRack(int rack)
    {
        this.rack=rack;
    }
    public void setLocation(Location location)
    {
        this.location=location;
    }
    public void setProduct(Product product)
    {
        this.product=product;
    }
}
 