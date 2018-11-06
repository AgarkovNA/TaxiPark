package com.epam.nikita_agarkov.entity.base;

import java.math.BigDecimal;

import com.epam.nikita_agarkov.enums.TaxiType;
import com.epam.nikita_agarkov.utils.exceptions.TripValidationException;
import com.epam.nikita_agarkov.utils.exceptions.WrongCarFormatExseption;

public abstract class Trip extends CommonEntity {

	private Integer passengers;
	private Float kilometers;
	private TaxiType type;
	private TaxiCars cars;
	
	public Trip(Integer passengers, Float kilometers, TaxiType type, TaxiCars cars) {
		super();
		this.passengers = passengers;
		this.kilometers = kilometers;
		this.type = type;
		this.cars = cars;
	}
	
	public abstract Boolean validation() throws WrongCarFormatExseption, TripValidationException;
	
	
	public TaxiType getType() {
		return type;
	}

	public void setType(TaxiType type) {
		this.type = type;
	}

	public TaxiCars getCars() {
		return cars;
	}

	public void setCars(TaxiCars cars) {
		this.cars = cars;
	}

	public Integer getPassengers() {
		return passengers;
	}
	public void setPassengers(Integer passengers) {
		this.passengers = passengers;
	}
	public Float getKilometers() {
		return kilometers;
	}
	public void setKilometers(Float kilometers) {
		this.kilometers = kilometers;
	}
	
	
}
