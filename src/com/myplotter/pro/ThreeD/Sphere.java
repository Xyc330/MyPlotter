package com.myplotter.pro.ThreeD;

public class Sphere extends ThreeDShape {
	
	private double radius;
	
	

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getSurfaceArea() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public double getVolume() {
		return 4 / 3 * Math.PI * radius * radius * radius;
	}

}
