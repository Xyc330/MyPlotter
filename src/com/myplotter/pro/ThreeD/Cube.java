package com.myplotter.pro.ThreeD;

public class Cube extends ThreeDShape {
	private double side;
	
	

	public Cube(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getSurfaceArea() {
		return side * side * 6;
	}

	@Override
	public double getVolume() {
		return side * side * side;
	}

}
