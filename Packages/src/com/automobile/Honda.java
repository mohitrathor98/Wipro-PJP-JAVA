package com.automobile;
import com.automobile.*;
public class Honda extends Vehicle{

	String modelName;
	String registrationNumber;
	String ownerName;
	int speed;
	
	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
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
	
	public void cdplayer()
	{
		System.out.print("cdplayer Start");
	}

}
