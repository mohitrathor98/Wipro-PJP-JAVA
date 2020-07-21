package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
	
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	
	
	
	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
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
	public void radio()
	{
		System.out.print("Radio Start");
	}


}
