package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Ford extends Vehicle{
	
	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	int tempControl;
	
	public Ford(String modelName, String registrationNumber, String ownerName, int speed, int tempControl) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.tempControl = tempControl;
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
	public int tempControl()
	{
		return tempControl;
	}
	
	

}
