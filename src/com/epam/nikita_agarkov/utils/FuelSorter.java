package com.epam.nikita_agarkov.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import com.epam.nikita_agarkov.entity.base.TaxiCars;

public class FuelSorter {
	public static List<TaxiCars> sort(List<TaxiCars> cars) {
		SortedSet<Float> scars = new TreeSet<>();
		Map<Float, TaxiCars> mcars = new HashMap<>();
		for (TaxiCars car : cars) {
			scars.add(car.getKmFuel());
			mcars.put(car.getKmFuel(), car);
		}
		for (Float key : scars) {
			System.out.println(mcars.get(key).getKmFuel());
		}
		return null;
	}
}
