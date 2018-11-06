package com.epam.nikita_agarkov.entity.ride;

import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.TaxiCars;
import com.epam.nikita_agarkov.entity.base.Trip;
import com.epam.nikita_agarkov.entity.taxi.RegularTaxi;
import com.epam.nikita_agarkov.enums.TaxiType;
import com.epam.nikita_agarkov.utils.exceptions.TripValidationException;
import com.epam.nikita_agarkov.utils.exceptions.WrongCarFormatExseption;

public class RegularTrip extends Trip {

	private Boolean music;
	

	public RegularTrip(Integer passengers, Float kilometers, Boolean music, TaxiCars cars) {
		super(passengers, kilometers, TaxiType.REGULAR, cars);
		this.music = music;
	}
	

	public Boolean getMusic() {
		return music;
	}

	public void setMusic(Boolean music) {
		this.music = music;
	}


	@Override
	public Boolean validation() throws WrongCarFormatExseption, TripValidationException {
		RegularTaxi taxi;
		try {
			taxi = (RegularTaxi) this.getCars();
		} catch (Exception e) {
			throw new WrongCarFormatExseption("Wrong car format",e);
		}
		if (this.getPassengers()>this.getCars().getMaxPassengers()) {
			throw new TripValidationException("Unsuitable number of passengers");
		}
		
		return true;
	}
	
	
}
