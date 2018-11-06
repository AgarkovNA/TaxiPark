package com.epam.nikita_agarkov.entity.taxi;

import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.TaxiCars;

public class RegularTaxi extends TaxiCars {
	
	private String music;

	
	public RegularTaxi() {
		super();
	}

	public RegularTaxi(String model, BigDecimal landingCost, BigDecimal kmCost, Float kmFuel, Integer passengers, String music, String parkName) {
		super(model, landingCost, kmCost, kmFuel, passengers, parkName);
		this.music = music;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	@Override
	public String toString() {
		return getModel() +""+ getMaxPassengers() +" "+ getParkName() +" "+ getKmCost() +" "+ getLandingCost() +" "+ getMusic() +" "+ getKmFuel();
	}
	
}
