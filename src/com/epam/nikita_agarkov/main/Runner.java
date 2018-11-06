package com.epam.nikita_agarkov.main;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.epam.nikita_agarkov.entity.base.TaxiCars;
import com.epam.nikita_agarkov.entity.ride.RegularTrip;
import com.epam.nikita_agarkov.entity.ride.VipTrip;
import com.epam.nikita_agarkov.entity.taxi.RegularTaxi;
import com.epam.nikita_agarkov.entity.taxi.VipTaxi;
import com.epam.nikita_agarkov.utils.FuelSorter;
import com.epam.nikita_agarkov.utils.RegularTripCalculator;
import com.epam.nikita_agarkov.utils.VipTripCalculator;
import com.epam.nikita_agarkov.utils.exceptions.TripValidationException;
import com.epam.nikita_agarkov.utils.exceptions.WrongCarFormatExseption;
import com.epam.nikita_agarkov.utils.jsonparser.RegularTaxiCarsJsonParser;
import com.epam.nikita_agarkov.utils.jsonparser.VipTaxiCarsJsonParser;
import com.epam.nikita_agarkov.utils.parser.RegularTaxiCarsParser;
import com.epam.nikita_agarkov.utils.parser.VipTaxiCarsParser;

public class Runner {
	public static void main(String[] args) throws IOException, ParseException {

//		RegularTaxi regularTaxi = new RegularTaxi("Pegeut ", new BigDecimal(3),  new BigDecimal(3), 0.13f, 4, "true", "MyPark");
//		VipTaxi vipTaxi = new VipTaxi("BMW", new BigDecimal(5), new BigDecimal(4), 0.23f, 4, "true", "Mypark" ); 
//
//		
//
//		VipTaxiCarsParser.writeToFile(vipTaxi, "C:\\Users\\KITGREEN\\Desktop\\cars.txt");
//		RegularTaxiCarsParser.writeToFile(regularTaxi, "C:\\Users\\KITGREEN\\Desktop\\rcars.txt");
//
//		RegularTaxi regularTaxi = RegularTaxiCarsParser.readFromFile("C:\\Users\\KITGREEN\\Desktop\\rcars.txt");
//		VipTaxi vipTaxi = VipTaxiCarsParser.readFromFile("C:\\Users\\KITGREEN\\Desktop\\cars.txt");

		RegularTaxi regularTaxi = RegularTaxiCarsJsonParser.parse("C:\\Users\\KITGREEN\\Desktop\\rcars.json");
		VipTaxi vipTaxi = VipTaxiCarsJsonParser.parse("C:\\Users\\KITGREEN\\Desktop\\vcars.json");
		
		VipTrip vipTrip = new VipTrip(2, 16f, true, (TaxiCars) vipTaxi);
		RegularTrip regularTrip = new RegularTrip(1, 12f, true, (TaxiCars) regularTaxi);

		try {
			vipTrip.validation();
		} catch (WrongCarFormatExseption | TripValidationException e) {
			e.printStackTrace();
		}
		try {
			regularTrip.validation();
		} catch (WrongCarFormatExseption | TripValidationException e) {
			e.printStackTrace();
		}

		RegularTripCalculator rcalculator = new RegularTripCalculator();
		VipTripCalculator vcalculator = new VipTripCalculator();

		BigDecimal rcost = rcalculator.calculate(regularTrip);
		BigDecimal vcost = vcalculator.calculate(vipTrip);
		System.out.println(rcost);
		System.out.println(vcost);
		List<TaxiCars> cars = new ArrayList<>();
		cars.add(regularTaxi);
		cars.add(vipTaxi);
		FuelSorter.sort(cars);
	}

}
