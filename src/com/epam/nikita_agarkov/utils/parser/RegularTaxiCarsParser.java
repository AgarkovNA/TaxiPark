package com.epam.nikita_agarkov.utils.parser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.TaxiCars;
import com.epam.nikita_agarkov.entity.taxi.RegularTaxi;

public class RegularTaxiCarsParser {
	public static void writeToFile(TaxiCars cars, String filename) {
		String text = cars.toString();
		try (FileOutputStream fos = new FileOutputStream(filename)) {
			byte[] buffer = text.getBytes();

			fos.write(buffer, 0, buffer.length);
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
		System.out.println("The file has been written");
	}

	public static RegularTaxi readFromFile(String filename) throws IOException {
		FileInputStream fin = new FileInputStream(filename);
		int i = -1;
		StringBuilder input = new StringBuilder();
		while ((i = fin.read()) != -1) {
			input.append((char) i);
		}
		fin.close();
		return parse(input.toString());

	}

	private static RegularTaxi parse(String input) {
		String[] cars = input.split(" ");
		RegularTaxi rtaxi = new RegularTaxi();
		rtaxi.setModel(cars[0]);
		rtaxi.setMaxPassengers(Integer.parseInt(cars[1]));
		rtaxi.setParkName(cars[2]);
		rtaxi.setKmCost(new BigDecimal(cars[3]));
		rtaxi.setLandingCost(new BigDecimal(cars[4]));
		rtaxi.setMusic(cars[5]);
		rtaxi.setKmFuel(Float.parseFloat(cars[6]));
		return rtaxi;
	}
}
