package com.epam.nikita_agarkov.utils.parser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

import com.epam.nikita_agarkov.entity.base.TaxiCars;
import com.epam.nikita_agarkov.entity.taxi.VipTaxi;

public class VipTaxiCarsParser {

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

	public static VipTaxi readFromFile(String filename) throws IOException {
		FileInputStream fin = new FileInputStream(filename);
		int i = -1;
		StringBuilder input = new StringBuilder();
		while ((i = fin.read()) != -1) {
			input.append((char) i);
		}
		fin.close();
		return parse(input.toString());

	}

	private static VipTaxi parse(String input) {
		String[] cars = input.split(" ");
		VipTaxi vtaxi = new VipTaxi();
		vtaxi.setModel(cars[0]);
		vtaxi.setMaxPassengers(Integer.parseInt(cars[1]));
		vtaxi.setParkName(cars[2]);
		vtaxi.setKmCost(new BigDecimal(cars[3]));
		vtaxi.setLandingCost(new BigDecimal(cars[4]));
		vtaxi.setWifiPassword(cars[5]);
		vtaxi.setKmFuel(Float.parseFloat(cars[6]));
		return vtaxi;
	}
}
