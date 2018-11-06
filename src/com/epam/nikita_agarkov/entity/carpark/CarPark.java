package com.epam.nikita_agarkov.entity.carpark;

import java.util.List;
import java.time.Instant;

import com.epam.nikita_agarkov.entity.base.CommonEntity;

public class CarPark extends CommonEntity{
	
	private String parkName;
	private Instant workStartTime;
	private Instant workEndTime;
	private List<String> drivers;

	public CarPark(String parkName, Instant workStartTime, Instant workEndTime, List<String> drivers) {
		super();
		this.parkName = parkName;
		this.workStartTime = workStartTime;
		this.workEndTime = workEndTime;
		this.drivers = drivers;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public Instant getWorkStartTime() {
		return workStartTime;
	}
	public void setWorkStartTime(Instant workStartTime) {
		this.workStartTime = workStartTime;
	}
	public Instant getWorkEndTime() {
		return workEndTime;
	}
	public void setWorkEndTime(Instant workEndTime) {
		this.workEndTime = workEndTime;
	}
	public List<String> getDrivers() {
		return drivers;
	}
	public void setDrivers(List<String> drivers) {
		this.drivers = drivers;
	}
	
	
}
