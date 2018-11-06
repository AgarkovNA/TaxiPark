package com.epam.nikita_agarkov.utils;

import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.Trip;
import com.epam.nikita_agarkov.entity.ride.RegularTrip;

public class RegularTripCalculator implements PriceCalculator {
	private final BigDecimal music = BigDecimal.ONE;

	public BigDecimal calculate(Trip trip) {
		RegularTrip rTrip = (RegularTrip) trip;

		BigDecimal totalprice = BigDecimal.ZERO;
		totalprice = totalprice.add(rTrip.getCars().getLandingCost().multiply(new BigDecimal(rTrip.getPassengers())));
		if (rTrip.getMusic()) {
			totalprice = totalprice.add(music);
		}
		totalprice = totalprice.add(rTrip.getCars().getKmCost().multiply(new BigDecimal(rTrip.getKilometers())));
		return totalprice;
	}
}