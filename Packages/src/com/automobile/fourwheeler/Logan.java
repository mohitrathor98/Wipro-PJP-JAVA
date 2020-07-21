package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle{
	
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	int gps;
	
	
	public Logan(String modelName, String registrationNumber, String ownerName, int speed,int gps) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps=gps;
	}

	@Override
	public String getModelName() {
		return modelName;
	}

	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	@Override
	public String getOwnerName() {
		return ownerName;
	}
	public int speed()
	{
		return speed;
	}
	public int gps()
	{
		return gps;
	}

}
