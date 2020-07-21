package com.wipro.automobile.ship;

public class Compartment {
	int height;
	int width;
	int breadth;
	public Compartment(int height, int width, int breadth) {
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}
	
}
