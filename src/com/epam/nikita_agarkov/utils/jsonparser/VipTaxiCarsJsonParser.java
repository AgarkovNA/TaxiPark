package com.epam.nikita_agarkov.utils.jsonparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.epam.nikita_agarkov.entity.taxi.VipTaxi;

public class VipTaxiCarsJsonParser {
	
	public static VipTaxi parse(String filename)
			throws org.json.simple.parser.ParseException, FileNotFoundException, IOException {

		JSONParser parser = new JSONParser();

		JSONArray a = (JSONArray) parser.parse(new FileReader(filename));
		VipTaxi vipTaxi = new VipTaxi();
		Object o = a.get(0);
		JSONObject jsonObject = (JSONObject) o;

		vipTaxi.setKmCost(new BigDecimal((String) jsonObject.get("kmCost")));
		vipTaxi.setMaxPassengers(Integer.parseInt((String) jsonObject.get("maxPassangers")));
		vipTaxi.setModel((String) jsonObject.get("model"));
		vipTaxi.setLandingCost(new BigDecimal((String) jsonObject.get("landingCost")));
		vipTaxi.setWifiPassword((String) jsonObject.get("music"));
		vipTaxi.setParkName((String) jsonObject.get("parkName"));
		vipTaxi.setKmFuel(Float.parseFloat((String) jsonObject.get("kmFuel")));

		return vipTaxi;

	}
}
