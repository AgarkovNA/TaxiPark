package com.epam.nikita_agarkov.entity.taxi;

import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.TaxiCars;

public class VipTaxi extends TaxiCars{
	
	private String wifiPassword;

	
	public VipTaxi() {
		super();
	}

	public VipTaxi(String model, BigDecimal landingCost, BigDecimal kmCost, Float kmFuel, Integer passengers, String wifiPassword, String parkName) {
		super(model, landingCost, kmCost, kmFuel, passengers, parkName);
		this.wifiPassword = wifiPassword;
	}

	public String getWifiPassword() {
		return wifiPassword;
	}

	public void setWifiPassword(String wifiPassword) {
		this.wifiPassword = wifiPassword;
	}
	
	@Override
	public String toString() {
		return getModel() +" "+ getMaxPassengers() +" "+ getParkName() +" "+ getKmCost() +" "+ getLandingCost() +" "+ getWifiPassword() +" "+ getKmFuel();
	}
}
