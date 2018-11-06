package com.epam.nikita_agarkov.utils.jsonparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.epam.nikita_agarkov.entity.taxi.RegularTaxi;

public class RegularTaxiCarsJsonParser {

	public static RegularTaxi parse(String filename)
			throws org.json.simple.parser.ParseException, FileNotFoundException, IOException {

		JSONParser parser = new JSONParser();

		JSONArray a = (JSONArray) parser.parse(new FileReader(filename));
		RegularTaxi regularTaxi = new RegularTaxi();
		Object o = a.get(0);
		JSONObject jsonObject = (JSONObject) o;

		regularTaxi.setKmCost(new BigDecimal((String) jsonObject.get("kmCost")));
		regularTaxi.setMaxPassengers(Integer.parseInt((String) jsonObject.get("maxPassangers")));
		regularTaxi.setModel((String) jsonObject.get("model"));
		regularTaxi.setLandingCost(new BigDecimal((String) jsonObject.get("landingCost")));
		regularTaxi.setMusic((String) jsonObject.get("music"));
		regularTaxi.setParkName((String) jsonObject.get("parkName"));
		regularTaxi.setKmFuel(Float.parseFloat((String) jsonObject.get("kmFuel")));

		return regularTaxi;

	}
}
