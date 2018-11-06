package com.epam.nikita_agarkov.entity.base;

import java.math.BigDecimal;

public class TaxiCars extends CommonEntity {

	private String parkName;
	private String model;
	private BigDecimal landingCost;
	private BigDecimal kmCost;
	private Float kmFuel; 
	private Integer maxPassengers;
	
	public TaxiCars(String model, BigDecimal landingCost, BigDecimal kmCost, Float kmFuel, Integer passengers, String parkName) {
		super();
		this.model = model;
		this.landingCost = landingCost;
		this.kmCost = kmCost;
		this.kmFuel = kmFuel;
		this.maxPassengers = passengers;
		this.parkName = parkName;
	}

	public TaxiCars() {
	}

	public String getParkName() {
		return parkName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getLandingCost() {
		return landingCost;
	}

	public void setLandingCost(BigDecimal landingCost) {
		this.landingCost = landingCost;
	}

	public BigDecimal getKmCost() {
		return kmCost;
	}

	public void setKmCost(BigDecimal kmCost) {
		this.kmCost = kmCost;
	}

	public Float getKmFuel() {
		return kmFuel;
	}

	public void setKmFuel(Float kmFuel) {
		this.kmFuel = kmFuel;
	}

	public Integer getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(Integer maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	
	
}
