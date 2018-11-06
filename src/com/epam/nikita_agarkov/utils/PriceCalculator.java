package com.epam.nikita_agarkov.utils;

import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.Trip;

public interface PriceCalculator {

	BigDecimal calculate(Trip trip);

}