package com.epam.nikita_agarkov.entity.ride;

import com.epam.nikita_agarkov.entity.base.TaxiCars;
import com.epam.nikita_agarkov.entity.base.Trip;
import com.epam.nikita_agarkov.entity.taxi.VipTaxi;
import com.epam.nikita_agarkov.enums.TaxiType;
import com.epam.nikita_agarkov.utils.exceptions.TripValidationException;
import com.epam.nikita_agarkov.utils.exceptions.WrongCarFormatExseption;

public class VipTrip extends Trip{

	public VipTrip(Integer passengers, Float kilometers, Boolean wifiUsed, TaxiCars cars) {
		super(passengers, kilometers, TaxiType.VIP, cars);
		this.wifiUsed = wifiUsed;
	}

	private Boolean wifiUsed;

	public Boolean getWifiUsed() {
		return wifiUsed;
	}

	public void setWifiUsed(Boolean wifiUsed) {
		this.wifiUsed = wifiUsed;
	}
	
	@Override
	public Boolean validation() throws WrongCarFormatExseption, TripValidationException {
		VipTaxi taxi;
		try {
			taxi = (VipTaxi) this.getCars();
		} catch (Exception e) {
			throw new WrongCarFormatExseption("Wrong car format",e);
		}
		if (this.getPassengers()>this.getCars().getMaxPassengers()) {
			throw new TripValidationException("Unsuitable number of passengers");
		}
		
		return true;
	}
	
}
