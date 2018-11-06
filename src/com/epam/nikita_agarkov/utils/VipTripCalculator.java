package com.epam.nikita_agarkov.utils;

import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.Trip;
import com.epam.nikita_agarkov.entity.ride.VipTrip;

public class VipTripCalculator implements PriceCalculator {

	private final BigDecimal wifiCost = BigDecimal.ONE;

	@Override
	public BigDecimal calculate(Trip trip) {
		VipTrip vTrip = (VipTrip) trip;

		BigDecimal totalprice = BigDecimal.ZERO;
		totalprice = totalprice.add(vTrip.getCars().getLandingCost().multiply(new BigDecimal(vTrip.getPassengers())));
		if (vTrip.getWifiUsed()) {
			totalprice = totalprice.add(wifiCost);
		}
		totalprice = totalprice.add(vTrip.getCars().getKmCost().multiply(new BigDecimal(vTrip.getKilometers())));
		return totalprice;
	}

}
